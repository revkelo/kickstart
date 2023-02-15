package co.edu.unbosque.model;

public class FachadaModelo {

	private EstudianteDAO estudao;

	public FachadaModelo() {

		estudao = new EstudianteDAO();
	}



	/**
	 * @return the estudao
	 */
	public EstudianteDAO getEstudao() {
		return estudao;
	}

	/**
	 * @param estudao the estudao to set
	 */
	public void setEstudao(EstudianteDAO estudao) {
		this.estudao = estudao;
	}

}
