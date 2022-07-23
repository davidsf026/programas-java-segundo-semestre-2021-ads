package negocio;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import persistencia.CompraDAO;

public class Compra {
	//PROPRIEDADES DA CLASSE
	private int id = 0;
	private Produto objProduto = null;
	private Cliente objCliente = null;
	private Date data = null;
	private int quantidade = 0;
	
	//MÉTODO CONSTRUTORES DA CLASSE
	public Compra() {
		super();
	}

	public Compra(int id, Produto objProduto, Cliente objCliente, Date data, int quantidade) {
		super();
		this.id = id;
		this.objProduto = objProduto;
		this.objCliente = objCliente;
		this.data = data;
		this.quantidade = quantidade;
	}

	//MÉTODOS GET/SET DA CLASSE
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getObjProduto() {
		return objProduto;
	}

	public void setObjProduto(Produto objProduto) {
		this.objProduto = objProduto;
	}

	public Cliente getObjCliente() {
		return objCliente;
	}

	public void setObjCliente(Cliente objCliente) {
		this.objCliente = objCliente;
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

	public void setDataDaApresentaca(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(0, 2)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(3, 5)) - 1);
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(6)));
		
		setData(objCalendario.getTime());
	}
	
	public void setDataDaPersistencia(String data) {
		Calendar objCalendario = Calendar.getInstance();
		
		objCalendario.set(Calendar.YEAR, Integer.parseInt(data.substring(0, 4)));
		objCalendario.set(Calendar.MONTH, Integer.parseInt(data.substring(5, 7)) - 1);
		objCalendario.set(Calendar.DAY_OF_MONTH, Integer.parseInt(data.substring(8)));
		
		setData(objCalendario.getTime());
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//MÉTODOS DA CLASSE
	public static Collection<Compra> getTodos() throws Exception {
		return new CompraDAO().getTodos();
	}
	
	public void persistir() throws Exception {
		new CompraDAO().persistir(this);
	}
	
	public void despersistir() throws Exception {
		new CompraDAO().despersistir(this);
	}
}
