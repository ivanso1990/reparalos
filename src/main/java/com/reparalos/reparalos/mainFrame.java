package com.reparalos.reparalos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class mainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField eco;

	public mainFrame() {
		setTitle("Reparalos");
		JComponent botonera = creaBotonera();
		JComponent eco = creaEco();
		
		// Crea panel con botonera y eco
		JSplitPane panelPrincipal = new JSplitPane(JSplitPane.VERTICAL_SPLIT, botonera, eco);
		
		// Añade el panel a la ventana principal
		getContentPane().add(panelPrincipal);
		
		// Se 'redimensiona' toda la interfaz gráfica en la ventana
		pack();
		// Y hace visible la ventana, con sus componentes
		setVisible(true);
	}

	private JComponent creaBotonera() {
		JPanel botonera = new JPanel();
		
		// Se crean los botones ...
		JButton btn_tiendaOnline = new JButton("Tienda Online");
		JButton btn_consulta = new JButton("Consulta");
		
		//se añaden funcionalidad
		btn_tiendaOnline.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent ev) {
					eco.setText("Tienda Online!");
					
					javaBrowser openURL = new javaBrowser();
					openURL.openBrowser();
					
					}});
		
		
		// .. y se añaden al panel
		botonera.add(btn_tiendaOnline);
		botonera.add(btn_consulta);
		return botonera;
	}

	private JComponent creaEco() {
		// Se crea el campo de texto donde poner el eco
		eco = new JTextField("Escoja una opción");
		return eco;
	}


	public static void main(String[] args) {
		//javaBrowser openURL = new javaBrowser();
		mainFrame mainFrame = new mainFrame();
		
		//openURL.openBrowser();
		// ... aquí termina la ejecución del 'hilo principal',
		// ... pero queda pendiente la ejecución del hilo de
		// ... tratamiento de eventos... A partir de ahora toda la
		// ... ejecución es gobernada por la interacción con el usuario.
	}

}