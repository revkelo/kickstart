package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Random;

import co.edu.unbosque.model.FachadaModelo;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.FachadaVista;

public class Controlador {

	private FachadaModelo model;
	private FachadaVista vp;

	public Controlador() {
		model = new FachadaModelo();
		vp = new FachadaVista();
		asignarOyentes();
	}

	private void asignarOyentes() {
	}

	public void ejecutar() {

		vp.getConsola().imprimirString("Taller");
		vp.getConsola().imprimirString(
				"1) Cargar estudiantes 2) Estudiante mejor promedio  3) Materia que mas perdieron estudiantes  4)   5) ");

		int eleccion = vp.getConsola().leerEntero();
		switch (eleccion) {
		case 1:
			vp.getConsola().imprimirString("1");

			break;

		default:
			break;
		}

	}

}
