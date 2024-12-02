package gui.guiWarenUbersicht;


import business.MoebelModel;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import ownUtil.*;

public class WarenuebersichtView {
	
private WarenuebersichtControl
 	warenuebersichtControl;
	private MoebelModel moebelModel;		
    	//---Anfang Attribute der grafischen Oberflaeche---
    	private Pane pane = new  Pane();
    	private Label lblAnzeigeMoebel     
 		= new Label("Anzeige Möbelstücke");
    	private TextArea txtAnzeigeMoebel  = new TextArea();
    	private Button btnAnzeigeMoebel = new Button("Anzeige");
    	//-------Ende Attribute der grafischen Oberflaeche-------
    
    	public WarenuebersichtView(
 		WarenuebersichtControl 
 		warenuebersichtControl, 
   	 	Stage primaryStage, 
 		MoebelModel moebelModel){
    		Scene scene = new Scene(this.pane, 560, 340);
    		primaryStage.setScene(scene);
    		primaryStage.setTitle("Anzeige der Warenübersicht");
    		primaryStage.show();
    		this.warenuebersichtControl 
 			= warenuebersichtControl;
 		this.moebelModel = moebelModel;
 		this.initKomponenten();
		this.initListener();
    	}

 	private void initKomponenten(){
    		// Label
 		Font font = new Font("Arial", 20);
       	lblAnzeigeMoebel.setLayoutX(310);
    		lblAnzeigeMoebel.setLayoutY(40);
    		
    		
    		lblAnzeigeMoebel.setFont(font);
    		lblAnzeigeMoebel.setStyle("-fx-font-weight: bold;"); 
       	pane.getChildren().add(lblAnzeigeMoebel);           
// Textbereich	
        	txtAnzeigeMoebel.setEditable(false);
     		txtAnzeigeMoebel.setLayoutX(310);
    		txtAnzeigeMoebel.setLayoutY(90);
     		txtAnzeigeMoebel.setPrefWidth(220);
    		txtAnzeigeMoebel.setPrefHeight(185);
       	pane.getChildren().add(txtAnzeigeMoebel);        	
        	// Button
          	btnAnzeigeMoebel.setLayoutX(310);
        	btnAnzeigeMoebel.setLayoutY(290);
        	pane.getChildren().add(btnAnzeigeMoebel); 
   }
   
   private void initListener() {
	    btnAnzeigeMoebel.setOnAction(
 			new EventHandler<ActionEvent>() {
	    		@Override
	        	public void handle(ActionEvent e) {
	            	zeigeMoebelhausAn();
	        	} 
   	    });
    }
   
   
    public void zeigeMoebelhausAn(){
    	if(moebelModel.getMoebel() != null){
    		txtAnzeigeMoebel.setText(
    				this.moebelModel.getMoebel().gibMoebelhausZurueck(' '));
    	}
    	else{
    		zeigeInformationsfensterAn("Bisher wurde kein Moebelstück aufgenommen!");
    	}
    }    
		
    
   
    private void zeigeInformationsfensterAn(String meldung){
    	  	new MeldungsfensterAnzeiger(AlertType.INFORMATION,
               	"Information", meldung).zeigeMeldungsfensterAn();
    }	
    
}





