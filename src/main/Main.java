package main;

import gui.guiMoebelHaus.MoebelControl;
import gui.guiMoebelHaus.MoebelhausAnwendersystem;
import gui.guiWarenUbersicht.WarenuebersichtControl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		new MoebelControl(primaryStage);
		
		Stage fensterWarenhaus= new Stage();
		new WarenuebersichtControl(fensterWarenhaus);
	}	
	
	public static void main(String[] args){
		launch(args);
	}
}



