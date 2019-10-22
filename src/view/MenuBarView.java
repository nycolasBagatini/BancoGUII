package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuBarView {
    public MenuBar getMenuBar(Stage stage) {
        MenuBar menuBar = new MenuBar();
        // cria barra de Menu.

        Menu cadastrar = new Menu("Cadastrar"); // cria o menu Cadastrar.
        MenuItem produto = new MenuItem("Produto");
        MenuItem cadastrarFuncionario = new MenuItem("Cadastrar Funcionario");
        MenuItem cadastrarCliente = new MenuItem("Cliente"); // cria o item Cliente.
        cadastrar.getItems().addAll(cadastrarCliente, produto, cadastrarFuncionario);  //Gera o item Cliente dentro do menu Cadastrar.


        Menu operacoes = new Menu("Operações"); // cria o Menu Operações.
        MenuItem depret = new MenuItem("Depositar / Retirar"); // cria o item Depositar / Retirar.
        operacoes.getItems().addAll (depret); // Gera o item Operações dentro do menu Operações

        Menu sobre = new Menu("Sobre");

        menuBar.getMenus().addAll (cadastrar, operacoes, sobre);  //Gera os botões interações.

        //abrir tela de cadastrar o cliente.
        cadastrarCliente.setOnAction(event -> {
            stage.setTitle("Cadastrar Cliente");
            TelaCadastroClienteView telaCadastroClienteView = new TelaCadastroClienteView();
            stage.setScene(new Scene(telaCadastroClienteView.getTelaCadastro(stage),500, 275));
            stage.show();

        });

        depret.setOnAction(event -> {
            stage.setTitle("Depositar / Retirar");
            TelaDepositarRetirar telaDepositarRetirar = new TelaDepositarRetirar();
            stage.setScene(new Scene(telaDepositarRetirar.getTelaDepositarRetirar(stage), 500, 275));
            stage.show();
        });

        sobre.setOnAction(event -> {
            stage.setTitle("Sobre");
            TelaSobre telaSobre = new TelaSobre();
            stage.setScene(new Scene(telaSobre.getSobre(stage),500, 275));
            stage.show();
        });

        produto.setOnAction(event -> {
            stage.setTitle("Produto");
            TelaProduto telaProduto = new TelaProduto();
            stage.setScene(new Scene(telaProduto.getProduto(stage),500, 275));
            stage.show();
        });

        cadastrar.setOnAction(event -> {
            stage.setTitle("Cadastrar Funcionarios");
            TelaCadastro telaCadastro = new TelaCadastro();
            stage.setScene(new Scene(telaCadastro.getCadastro(stage),500, 275));
            stage.show();
        });











        return menuBar;

    }


}
