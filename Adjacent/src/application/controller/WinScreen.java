package application.controller;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WinScreen {

    //reward Button
	@FXML
    private Button rewardButton;

    //AnchorPane
	@FXML
    private AnchorPane mainPane;

    //changes scene to Reward.fxml
	@FXML
    void rewardLink(MouseEvent event) throws InterruptedException, IOException {
    	Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
    	//makes WebView element
    	WebView webview = new WebView();
        webview.getEngine().load("https://www.youtube.com/watch?v=o-YBDTqX_ZU");
        webview.setPrefSize(800, 800);
        stage.setScene(new Scene(webview));
        stage.show();
    }

}