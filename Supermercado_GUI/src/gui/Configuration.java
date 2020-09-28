package gui;

import java.io.BufferedWriter;
import java.io.FileWriter;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class Configuration {

	@FXML
	TextArea lista;

	@FXML
	Button botao;

	public void ListaSalvar() {
		String Lista = lista.getText();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("Supermercado" + ".txt"))) {
			bw.write(Lista + "\n");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			System.out.println("pronto!");
		}
	}
}
