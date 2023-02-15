package co.edu.unbosque.controller;

import java.util.Iterator;
import java.util.Random;

import co.edu.unbosque.model.Cliente;
import co.edu.unbosque.model.FachadaModelo;
import co.edu.unbosque.model.Servidor;
import co.edu.unbosque.view.Consola;
import co.edu.unbosque.view.FachadaVista;

public class Controlador {

	private FachadaModelo model;
	private FachadaVista vp;
	private Cliente client;
	private Servidor server;

	public Controlador() {
		model = new FachadaModelo();
		vp = new FachadaVista();
		asignarOyentes();
		server = new Servidor(5000);
		client = new Cliente("172.18.92.58", 6969);

	}

	private void asignarOyentes() {
	}

	public void ejecutar() {
		while (true) {
			try {

				vp.getConsola().imprimirString("Trabajo");
				vp.getConsola().imprimirString("1) Abrir servidor 2) Conectar Cliente  3) Salir ");

				int eleccion = vp.getConsola().leerEntero();
				switch (eleccion) {
				case 1:
					vp.getConsola().imprimirString("1");

					server.run();
					break;
				case 2:
					vp.getConsola().imprimirString("2");

					client.run();
					break;

				case 3:
					System.exit(1);
					break;
				default:
					break;

				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	}

}
