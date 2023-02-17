package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Random;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.FachadaVista;

public class Controlador {

	private FachadaVista vp;
	private Cliente cl;

	public Controlador() {
		cl = new Cliente("127.0.0.1", 5000);
		vp = new FachadaVista();

	}

	public void ejecutar() {

		while (true) {
			try {
				String aux= vp.getJpane().read("Bienvenidp \n\n1.buscar informacion con la cedula \n2. vete");
				int msj = Integer.parseInt(aux);

				switch (msj) {

				case 1:

					String cedula =String.valueOf(vp.getJpane().leerDato("Escriba la cedula"));
					cl.setLine(cedula);
					cl.run();
					vp.getConsola().imprimirString("1");

					break;
				case 2:
					System.exit(0);
					break;
				default:
					
					break;
				}
			} catch (Exception e) {
				vp.getJpane().mostrarAdvertencia("eres tonto");
			}
		}

	}

}
