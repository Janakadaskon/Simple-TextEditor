package lk.ijse.dep11;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MainFormController {
    public AnchorPane root;

    public MenuItem itemNew;
    public MenuItem itemOpen;
    public MenuItem itemExit;
    public MenuItem itemUserGuide;
    public MenuItem itemAboutUs;
    public HTMLEditor txtArea;


    public void itemNewOnAction(ActionEvent actionEvent) throws Exception{

        txtArea.setHtmlText("");
    }

    public void itemOpenOnAction(ActionEvent actionEvent) {
    }

    public void itemExitOnAction(ActionEvent actionEvent) {
    }

    public void itemUserGuideOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane scene1Root = FXMLLoader.load(getClass().getResource("/view/Scene1.fxml"));
        Scene mainScene = new Scene(scene1Root);

        Stage stage = new Stage();

        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());

        stage.setScene(mainScene);
        stage.setTitle("User Guide");
        stage.show();

    }

    public void itemAboutUsOnAction(ActionEvent actionEvent) throws Exception{
        AnchorPane scene2Root = FXMLLoader.load(getClass().getResource("/view/Scene2.fxml"));
        Scene mainScene1 = new Scene(scene2Root);

        Stage stage = new Stage();

        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(root.getScene().getWindow());

        stage.setScene(mainScene1);
        stage.setTitle("About Us");
        stage.show();
    }
}
