package lk.ijse.dep11;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.paint.Color;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

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
        Platform.exit();
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
        Stage stage1 = new Stage();
        stage1.setScene(mainScene1);
        stage1.setTitle("About Us");

        stage1.initStyle(StageStyle.TRANSPARENT);
        scene2Root.setBackground(Background.fill(Color.TRANSPARENT));
        mainScene1.setFill(Color.TRANSPARENT);

        stage1.show();
        stage1.centerOnScreen();
    }

    public void start(Stage primaryStage)throws Exception{
        AnchorPane root = FXMLLoader.load(getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setScene(mainScene);
        primaryStage.setTitle("Undecorated Windows");

        primaryStage.initStyle(StageStyle.TRANSPARENT);
    }
}
