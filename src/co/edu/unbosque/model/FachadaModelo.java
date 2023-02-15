package co.edu.unbosque.model;

public class FachadaModelo {

	private Cliente cliente;
	private Servidor servidor;

	public FachadaModelo() {
cliente = new Cliente();
servidor = new Servidor();
		
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}


}
