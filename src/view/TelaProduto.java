package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Produto;

public class TelaProduto {
   public VBox getProduto(Stage stage){
        VBox raiz = new VBox(10);

        Label nomeP = new Label("Nome:");
        TextField nome = new TextField();
        Label precoP = new Label("Preço:");
        TextField preco = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, nomeP, nome, precoP, preco, btnCadastrar, btnLimpar);

        btnCadastrar.setOnAction(event -> {
            Produto produto = new Produto(nome.getText(),Double.valueOf(preco.getText()));
            System.out.println(produto);

        });

        btnLimpar.setOnAction(event -> {
            nome.setText("");
            preco.setText("");

        });

        return  raiz;
    }

}
