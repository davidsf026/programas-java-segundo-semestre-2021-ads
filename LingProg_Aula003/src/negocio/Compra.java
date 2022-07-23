package negocio;

import java.util.Calendar;
import java.util.Date;

public class Compra {
	//PROPRIEDADES DA CLASSE
	private Produto objProduto = null;
	private int quantidade = 0;
	private Date data = null;
	private String cartao = "";
	
	//MÉTODOS CONSTRUTORES
	public Compra() {
		
	}

	public Compra(Produto objProduto, int quantidade, Date data, String cartao) {
		super();
		this.objProduto = objProduto;
		this.quantidade = quantidade;
		this.data = data;
		this.cartao = cartao;
	}
	
	//MÉTODO GET/SET
	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData() {
		return data;
	}

	public String getDataParaApresentacao() {
		String retorno = "";
		
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(getData());
		
		retorno = objCalendario.get(Calendar.DAY_OF_MONTH) + "/" +
				  (objCalendario.get(Calendar.MONTH) + 1) + "/" +
				  objCalendario.get(Calendar.YEAR);
				  
		return retorno;
	}
	
	public String getDataParaPersistencia() {
		String retorno = "";
		
		Calendar objCalendario = Calendar.getInstance();
		objCalendario.setTime(getData());
		
		retorno = objCalendario.get(Calendar.YEAR) + "-" +
				  (objCalendario.get(Calendar.MONTH) + 1) + "-" +
				  objCalendario.get(Calendar.DAY_OF_MONTH);
				  
		return retorno;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public void setDataParaApresentacao(String data) {		
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(0, 2)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(3, 5)));
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(6, 10)));
		
		setData(objCalendario.getTime());
	}
	
	public void setDataParaPersistencia(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(0, 4)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(5, 7)) - 1);
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(8, 10)));
		
		setData(objCalendario.getTime());		
	}

	public String getCartao() {
		return cartao;
	}

	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
}
