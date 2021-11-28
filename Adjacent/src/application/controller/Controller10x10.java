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

public class Controller10x10 {
	
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
    
    @FXML
    private Rectangle s65;

    @FXML
    private Rectangle s66;

    @FXML
    private Rectangle s67;

    @FXML
    private Rectangle s68;

    @FXML
    private Rectangle s69;

    @FXML
    private Rectangle s70;

    @FXML
    private Rectangle s71;

    @FXML
    private Rectangle s72;

    @FXML
    private Rectangle s73;

    @FXML
    private Rectangle s74;
    
    @FXML
    private Rectangle s75;
    
    @FXML
    private Rectangle s76;
    
    @FXML
    private Rectangle s77;
    
    @FXML
    private Rectangle s78;
    
    @FXML
    private Rectangle s79;
    
    @FXML
    private Rectangle s80;
    
    @FXML
    private Rectangle s81;
    
    @FXML
    private Rectangle s82;
    
    @FXML
    private Rectangle s83;
    
    @FXML
    private Rectangle s84;
    
    @FXML
    private Rectangle s85;
    
    @FXML
    private Rectangle s86;
    
    @FXML
    private Rectangle s87;
    
    @FXML
    private Rectangle s88;
    
    @FXML
    private Rectangle s89;
    
    @FXML
    private Rectangle s90;

    @FXML
    private Rectangle s91;

    @FXML
    private Rectangle s92;

    @FXML
    private Rectangle s93;

    @FXML
    private Rectangle s94;

    @FXML
    private Rectangle s95;

    @FXML
    private Rectangle s96;

    @FXML
    private Rectangle s97;

    @FXML
    private Rectangle s98;

    @FXML
    private Rectangle s99;
    
    @FXML
    private Rectangle s100;
    
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
    	//make 10 lists of 10 rectangles in order
    	List<Rectangle> line1 = new ArrayList<Rectangle>();
    	line1.add(s1);
    	line1.add(s2);
    	line1.add(s3);
    	line1.add(s4);
    	line1.add(s5);	//oh my god please someone find a way to do this with generics
    	line1.add(s6);
    	line1.add(s7);
    	line1.add(s8);
    	line1.add(s9);
    	line1.add(s10);
    	List<Rectangle> line2 = new ArrayList<Rectangle>();
    	line2.add(s11);
    	line2.add(s12);
    	line2.add(s13);
    	line2.add(s14);
    	line2.add(s15);	//so I don't have to look at this embarrassing reminder 
    	line2.add(s16);
    	line2.add(s17);
    	line2.add(s18);
    	line2.add(s19);
    	line2.add(s20);
    	List<Rectangle> line3 = new ArrayList<Rectangle>();
    	line3.add(s21);
    	line3.add(s22);
    	line3.add(s23);
    	line3.add(s24);
    	line3.add(s25); 
    	line3.add(s26);
    	line3.add(s27);
    	line3.add(s28); 
    	line3.add(s29);
    	line3.add(s30); 
    	List<Rectangle> line4 = new ArrayList<Rectangle>();
    	line4.add(s31);
    	line4.add(s32);
    	line4.add(s33);
    	line4.add(s34);
    	line4.add(s35);
    	line4.add(s36);
    	line4.add(s37);
    	line4.add(s38);
    	line4.add(s39);
    	line4.add(s40);
    	List<Rectangle> line5 = new ArrayList<Rectangle>();
    	line5.add(s41);
    	line5.add(s42);
    	line5.add(s43);
    	line5.add(s44);
    	line5.add(s45);
    	line5.add(s46);
    	line5.add(s47);
    	line5.add(s48);
    	line5.add(s49);
    	line5.add(s50);
    	List<Rectangle> line6 = new ArrayList<Rectangle>();
    	line6.add(s51);
    	line6.add(s52);
    	line6.add(s53);
    	line6.add(s54);
    	line6.add(s55);
    	line6.add(s56);
    	line6.add(s57);
    	line6.add(s58);
    	line6.add(s59);
    	line6.add(s60);
    	List<Rectangle> line7 = new ArrayList<Rectangle>();
    	line7.add(s61);
    	line7.add(s62);
    	line7.add(s63);
    	line7.add(s64);
    	line7.add(s65);
    	line7.add(s66);	//i can't believe im doing this
    	line7.add(s67);
    	line7.add(s68);
    	line7.add(s69);
    	line7.add(s70);
    	List<Rectangle> line8 = new ArrayList<Rectangle>();
    	line8.add(s71);
    	line8.add(s72);
    	line8.add(s73);
    	line8.add(s74);
    	line8.add(s75);
    	line8.add(s76);
    	line8.add(s77);
    	line8.add(s78);
    	line8.add(s79);
    	line8.add(s80);
    	List<Rectangle> line9 = new ArrayList<Rectangle>();
    	line9.add(s81);
    	line9.add(s82);
    	line9.add(s83);
    	line9.add(s84);
    	line9.add(s85);
    	line9.add(s86);
    	line9.add(s87);
    	line9.add(s88);
    	line9.add(s89);
    	line9.add(s90);
    	List<Rectangle> line10 = new ArrayList<Rectangle>();
    	line10.add(s91);
    	line10.add(s92);
    	line10.add(s93);
    	line10.add(s94);
    	line10.add(s95);
    	line10.add(s96);
    	line10.add(s97);
    	line10.add(s98);
    	line10.add(s99);
    	line10.add(s100);
    	//add all lists to board
    	board.add(line1);
    	board.add(line2);
    	board.add(line3);
    	board.add(line4);
    	board.add(line5);
    	board.add(line6);
    	board.add(line7);
    	board.add(line8);
    	board.add(line9);
    	board.add(line10); //i dream of the day this monstrosity shrinks to like 10 lines of code
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
        	if (savedTemp+x >= 0 && savedTemp+x < 10) { //testing if out of bounds
        		if (saved2 >= 0 && saved2 < 10) {
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
        	if (savedTemp >= 0 && savedTemp < 10) {
        		if (saved2+x >= 0 && saved2+x < 10) {
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
    	if (counter == 100) {
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
    			counter++;
    			System.out.println(counter);
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