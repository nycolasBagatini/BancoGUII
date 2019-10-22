package view;

import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TelaSobre {
    public VBox getSobre(Stage stage){
        VBox raiz = new VBox(10);
        Label sobre = new Label("Desenvolvido por Turista");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(sobre);



        return raiz;
    }

}
