package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.CadastrarFuncionario;

public class TelaCadastro {
    public VBox getCadastro(Stage stage) {
        VBox raiz = new VBox(10);

        Label nome = new Label("Nome:");
        Label area = new Label("Area:");
        Label codigo = new Label("Codigo:");
        Label lider = new Label("Lider:");
        Label cadastroc = new Label();

        TextField nomet = new TextField();
        TextField areat = new TextField();
        TextField codigot = new TextField();
        TextField lidert = new TextField();

        Button btnCadastrar = new Button("Cadastrar");
        Button btnLimpar = new Button("Limpar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, nome, nomet, area, areat, codigo, codigot, lider, lidert, btnCadastrar, btnLimpar,cadastroc);

        btnCadastrar.setOnAction(event -> {
            CadastrarFuncionario cadastrarf = new CadastrarFuncionario(nomet.getText(),areat.getText(),codigot.getText(),lidert.getText());
            System.out.println(cadastrarf);
            cadastroc.setText("Cadastro realizado com sucesso");
        });

        btnLimpar.setOnAction(event -> {

            nomet.setText("");
            areat.setText("");
            codigot.setText("");
            lidert.setText("");
        });

        return raiz;
    }


}
