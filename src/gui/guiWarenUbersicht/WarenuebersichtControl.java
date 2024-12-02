package gui.guiWarenUbersicht;

import business.MoebelModel;
import javafx.stage.Stage;
import ownUtil.Observer;

public class WarenuebersichtControl implements Observer{	
	
	private WarenuebersichtView warenuebersichtView;
	private MoebelModel moebelModel;
	
	public WarenuebersichtControl(Stage primaryStage){
 		this.moebelModel =MoebelModel.getInstance(); 		
		this.warenuebersichtView = new WarenuebersichtView(this, primaryStage,
			moebelModel);
		moebelModel.addObserver(this);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		warenuebersichtView.zeigeMoebelhausAn();
		
	}
}

