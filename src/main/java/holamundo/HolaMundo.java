package holamundo;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import com.reparalos.reparalos.javaBrowser;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HolaMundo extends Application {

	@Override
	public void start(Stage stage) {
		Button btn_tiendaOnline = new Button();
		btn_tiendaOnline.setText("Tienda Online");
		btn_tiendaOnline.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Abriendo URL http://reparalos.com");
				javaBrowser.openBrowser("http://reparalos.com");
		
			}
		});

		StackPane layout = new StackPane();
		layout.getChildren().add(btn_tiendaOnline);
		Scene escena = new Scene(layout, 300, 250);
		stage.setTitle("Reparalos.com");
		stage.setScene(escena);
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}