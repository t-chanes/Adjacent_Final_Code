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

public class Controller8x8 {
	
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
    
    @FXML
    private Rectangle s26;

    @FXML
    private Rectangle s27;

    @FXML
    private Rectangle s28;

    @FXML
    private Rectangle s29;

    @FXML
    private Rectangle s30;

    @FXML
    private Rectangle s31;

    @FXML
    private Rectangle s32;

    @FXML
    private Rectangle s33;

    @FXML
    private Rectangle s34;

    @FXML
    private Rectangle s35;
    
    @FXML
    private Rectangle s36;
    
    @FXML
    private Rectangle s37;
    
    @FXML
    private Rectangle s38;
    
    @FXML
    private Rectangle s39;
    
    @FXML
    private Rectangle s40;
    
    @FXML
    private Rectangle s41;
    
    @FXML
    private Rectangle s42;
    
    @FXML
    private Rectangle s43;
    
    @FXML
    private Rectangle s44;
    
    @FXML
    private Rectangle s45;
    
    @FXML
    private Rectangle s46;
    
    @FXML
    private Rectangle s47;
    
    @FXML
    private Rectangle s48;
    
    @FXML
    private Rectangle s49;
    
    @FXML
    private Rectangle s50;
    
    @FXML
    private Rectangle s51;

    @FXML
    private Rectangle s52;

    @FXML
    private Rectangle s53;

    @FXML
    private Rectangle s54;

    @FXML
    private Rectangle s55;

    @FXML
    private Rectangle s56;

    @FXML
    private Rectangle s57;

    @FXML
    private Rectangle s58;

    @FXML
    private Rectangle s59;

    @FXML
    private Rectangle s60;
    
    @FXML
    private Rectangle s61;
    
    @FXML
    private Rectangle s62;
    
    @FXML
    private Rectangle s63;
    
    @FXML
    private Rectangle s64;
    
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
    	//make 8 lists of 8 rectangles in order
    	List<Rectangle> line1 = new ArrayList<Rectangle>();
    	line1.add(s1);
    	line1.add(s2);
    	line1.add(s3);
    	line1.add(s4);
    	line1.add(s5);
    	line1.add(s6);
    	line1.add(s7);
    	line1.add(s8);
    	List<Rectangle> line2 = new ArrayList<Rectangle>();
    	line2.add(s9);
    	line2.add(s10);
    	line2.add(s11);
    	line2.add(s12);
    	line2.add(s13);
    	line2.add(s14);
    	line2.add(s15);
    	line2.add(s16);
    	List<Rectangle> line3 = new ArrayList<Rectangle>();
    	line3.add(s17);
    	line3.add(s18);
    	line3.add(s19);
    	line3.add(s20);
    	line3.add(s21); //oh my god there has to be a way to do this with generics
    	line3.add(s22);
    	line3.add(s23);
    	line3.add(s24); 
    	List<Rectangle> line4 = new ArrayList<Rectangle>();
    	line4.add(s25);
    	line4.add(s26);
    	line4.add(s27);
    	line4.add(s28);
    	line4.add(s29);
    	line4.add(s30);
    	line4.add(s31);
    	line4.add(s32);
    	List<Rectangle> line5 = new ArrayList<Rectangle>();
    	line5.add(s33);
    	line5.add(s34);
    	line5.add(s35);
    	line5.add(s36);
    	line5.add(s37);
    	line5.add(s38);
    	line5.add(s39);
    	line5.add(s40);
    	List<Rectangle> line6 = new ArrayList<Rectangle>();
    	line6.add(s41);
    	line6.add(s42);
    	line6.add(s43);
    	line6.add(s44);
    	line6.add(s45);
    	line6.add(s46);
    	line6.add(s47);
    	line6.add(s48);
    	List<Rectangle> line7 = new ArrayList<Rectangle>();
    	line7.add(s49);
    	line7.add(s50);
    	line7.add(s51);
    	line7.add(s52);
    	line7.add(s53);
    	line7.add(s54);
    	line7.add(s55);
    	line7.add(s56);
    	List<Rectangle> line8 = new ArrayList<Rectangle>();
    	line8.add(s57);
    	line8.add(s58);
    	line8.add(s59);
    	line8.add(s60);
    	line8.add(s61);
    	line8.add(s62);
    	line8.add(s63);
    	line8.add(s64);
    	//add all lists to board
    	board.add(line1);
    	board.add(line2);
    	board.add(line3);
    	board.add(line4);
    	board.add(line5);
    	board.add(line6);
    	board.add(line7);
    	board.add(line8);
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
    		if (savedTemp+x >= 0 && savedTemp+x < 8) {
    			if (saved2 >= 0 && saved2 < 8) {
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
    		if (savedTemp >= 0 && savedTemp < 8) {
    			if (saved2+x >= 0 && saved2+x < 8) {
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
    	if (counter == 64) {
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