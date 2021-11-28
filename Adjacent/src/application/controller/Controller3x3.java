package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import application.Main;
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

public class Controller3x3 extends Main {

	//Buttons
	@FXML
    private Button returnHome;
	
	@FXML
    private Button clearButton;
	
	//Rectangles
	@FXML
    private Rectangle s1;

    @FXML
    private Rectangle s2;

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
    
    //AnchorPane
    @FXML
    private AnchorPane mainPane;
    
    //list of squares
    List<List<Rectangle>> board;
    
    //counter
    int counter = 0;
    
    //make array list for each element and add those lists to another array
    @FXML 
    public void initialize() {
    	board = new ArrayList<List<Rectangle>>();
    	//make 3 lists of 3 rectangles in order
    	List<Rectangle> line1 = new ArrayList<Rectangle>();
    	line1.add(s1);
    	line1.add(s2);
    	line1.add(s3);
    	List<Rectangle> line2 = new ArrayList<Rectangle>();
    	line2.add(s4);
    	line2.add(s5);
    	line2.add(s6);
    	List<Rectangle> line3 = new ArrayList<Rectangle>();
    	line3.add(s7);
    	line3.add(s8);
    	line3.add(s9);
    	//add all lists to board
    	board.add(line1);
    	board.add(line2);
    	board.add(line3);
    }
    
    //inverses the colors for adjacent squares
    @FXML
    void adjacent(MouseEvent event) throws Exception {
    	//variables
    	int temp = 0;
    	int savedTemp = 0;
    	int saved2 = 0;
    	
    	//check each line in board for the line containing source
    	for (List<Rectangle> lines: board) {
    		//for (Rectangle lines2: lines)
    		if (lines.indexOf(event.getSource()) > -1) {
    			//save index of source on line
    			saved2 = lines.indexOf(event.getSource());
    			//save line number
    			savedTemp = temp;
    		}
    		temp++;
    	}
    	
    	//inverse center
    	if (board.get(savedTemp).get(saved2).getFill().equals(Color.WHITE)) {
			board.get(savedTemp).get(saved2).setFill(Color.BLACK);
			counter++;
		}
    	else {
			board.get(savedTemp).get(saved2).setFill(Color.WHITE);
			counter--;
		}
    	
    	//loop inverse adjacent squares
    	for (int x = -1; x < 2; x+=2) {
    		//up and down squares inverse
    		if (savedTemp+x >= 0 && savedTemp+x < 3) {
    			if (saved2 >= 0 && saved2 < 3) {
    				if (board.get(savedTemp+x).get(saved2).getFill().equals(Color.WHITE)) {
    					board.get(savedTemp+x).get(saved2).setFill(Color.BLACK);
    					counter++;
    				}
    				else {
    					board.get(savedTemp+x).get(saved2).setFill(Color.WHITE);
    					counter--;
    				}
    			}
    		}
    		//left and right squares inverse
    		if (savedTemp >= 0 && savedTemp < 3) {
    			if (saved2+x >= 0 && saved2+x < 3) {
    				if (board.get(savedTemp).get(saved2+x).getFill().equals(Color.WHITE)) {
    					board.get(savedTemp).get(saved2+x).setFill(Color.BLACK);
    					counter++;
    				}
    				else {
    					board.get(savedTemp).get(saved2+x).setFill(Color.WHITE);
    					counter--;
    				}
    			}
    		}
    	}
    	
    	//check if all squares are black
    	if (counter == 9) {
    		//change to Win Screen (WinScreen.fxml)
    		URL url = new File("src/application/view/WinScreen.fxml").toURI().toURL();
        	mainPane = FXMLLoader.load(url);
            Scene scene = new Scene(mainPane);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
            window.setScene(scene);
            window.show();
    	}
    }
    
    //make all squares white
    @FXML
    void clear(MouseEvent event) {
    	counter = 0;
    	for (List<Rectangle> lines : board) {
    		for (Rectangle r: lines) {
    			r.setFill(Color.WHITE);
    		}
    	}
    }
    
    //return to main menu (MenuAdjacent.fxml)
    @FXML
    void home(MouseEvent event) throws IOException {
    	URL url = new File("src/application/view/MenuAdjacent.fxml").toURI().toURL();
    	mainPane = FXMLLoader.load(url);
        Scene scene = new Scene(mainPane);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();// pane you are ON
        window.setScene(scene);
        window.show();
    }
}