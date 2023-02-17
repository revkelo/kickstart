package co.edu.unbosque.view;

public class FachadaVista {

	private Consola consola;
	private JPane jpane;

	public FachadaVista() {
		consola = new Consola();
		jpane = new JPane();
	}

	public Consola getConsola() {
		return consola;
	}

	public void setConsola(Consola consola) {
		this.consola = consola;
	}

	public JPane getJpane() {
		return jpane;
	}

	public void setJpane(JPane jpane) {
		this.jpane = jpane;
	}

}
