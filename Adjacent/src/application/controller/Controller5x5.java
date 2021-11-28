package application.controller;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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

public class Controller5x5 {
	
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

    @FXML
    private Rectangle s10;
    
    @FXML
    private Rectangle s11;
    
    @FXML
    private Rectangle s12;
    
    @FXML
    private Rectangle s13;
    
    @FXML
    private Rectangle s14;
    
    @FXML
    private Rectangle s15;
    
    @FXML
    private Rectangle s16;
    
    @FXML
    private Rectangle s17;
    
    @FXML
    private Rectangle s18;
    
    @FXML
    private Rectangle s19;
    
    @FXML
    private Rectangle s20;
    
    @FXML
    private Rectangle s21;
    
    @FXML
    private Rectangle s22;
    
    @FXML
    private Rectangle s23;
    
    @FXML
    private Rectangle s24;
    
    @FXML
    private Rectangle s25;
    
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
    	//make 5 lists of 5 rectangles in order
    	List<Rectangle> line1 = new ArrayList<Rectangle>();
    	line1.add(s1);
    	line1.add(s2);
    	line1.add(s3);
    	line1.add(s4);
    	line1.add(s5);
    	List<Rectangle> line2 = new ArrayList<Rectangle>();
    	line2.add(s6);
    	line2.add(s7);
    	line2.add(s8);
    	line2.add(s9);
    	line2.add(s10);
    	List<Rectangle> line3 = new ArrayList<Rectangle>();
    	line3.add(s11);
    	line3.add(s12);
    	line3.add(s13);
    	line3.add(s14);
    	line3.add(s15);
    	List<Rectangle> line4 = new ArrayList<Rectangle>();
    	line4.add(s16);
    	line4.add(s17);
    	line4.add(s18);
    	line4.add(s19);
    	line4.add(s20);
    	List<Rectangle> line5 = new ArrayList<Rectangle>();
    	line5.add(s21);
    	line5.add(s22);
    	line5.add(s23);
    	line5.add(s24);
    	line5.add(s25);
    	//add all lists to board
    	board.add(line1);
    	board.add(line2);
    	board.add(line3);
    	board.add(line4);
    	board.add(line5);
    }
    
    //inverses the colors for adjacent squares
    @FXML
    void adjacent(MouseEvent event) throws IOException {
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
    		if (savedTemp+x >= 0 && savedTemp+x < 5) {
    			if (saved2 >= 0 && saved2 < 5) {
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
    		if (savedTemp >= 0 && savedTemp < 5) {
    			if (saved2+x >= 0 && saved2+x < 5) {
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
    	if (counter == 25) {
    		//change to Win Screen (WinScreen.fxml)
    		URL url = new File("src/application/view/WinScreen.fxml").toURI().toURL();
        	mainPane = FXMLLoader.load(url);
            Scene scene = new Scene(mainPane);
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
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