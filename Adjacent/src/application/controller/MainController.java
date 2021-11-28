package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class MainController {

    //Rectangles
	@FXML
    private Rectangle s3;

    @FXML
    private Rectangle s4;

    @FXML
    private Rectangle s5;

    @FXML
    private Rectangle s6;

    @FXML
    private Rectangle s7;

    @FXML
    private Rectangle s8;

    @FXML
    private Rectangle s9;

    @FXML
    private Rectangle s1;

    @FXML
    private Rectangle s2;
    
    //Buttons
    @FXML
    private Button three;

    @FXML
    private Button eight;

    @FXML
    private Button ten;

    @FXML
    private Button five;
    
    //AnchorPane
    @FXML
    private AnchorPane mainPane;

    //make square black on enter
    @FXML
    void black(MouseEvent event) {
    	Rectangle source = (Rectangle) event.getSource();
    	source.setFill(Color.BLACK);
    }

    //make square white on exit
    @FXML
    void white(MouseEvent event) {
    	Rectangle source = (Rectangle) event.getSource();
    	source.setFill(Color.WHITE);
    }

    //change to 3x3 scene (Boxes3.fxml)
    @FXML
    void load3(ActionEvent event) throws IOException {
    	URL url = new File("src/application/view/Boxes3.fxml").toURI().toURL();
    	mainPane = FXMLLoader.load(url);
        Scene scene = new Scene(mainPane);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    //change to 5x5 scene (Boxes5.fxml)
    @FXML
    void load5(ActionEvent event) throws IOException {
    	URL url = new File("src/application/view/Boxes5.fxml").toURI().toURL();
    	mainPane = FXMLLoader.load(url);
        Scene scene = new Scene(mainPane);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    //change to 8x8 scene (Boxes8.fxml)
    @FXML
    void load8(ActionEvent event) throws IOException {
    	URL url = new File("src/application/view/Boxes8.fxml").toURI().toURL();
    	mainPane = FXMLLoader.load(url);
        Scene scene = new Scene(mainPane);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }

    //change to 10x10 scene (Boxes10.fxml)
    @FXML
    void load10(ActionEvent event) throws IOException {
    	URL url = new File("src/application/view/Boxes10.fxml").toURI().toURL();
    	mainPane = FXMLLoader.load(url);
        Scene scene = new Scene(mainPane);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }
}