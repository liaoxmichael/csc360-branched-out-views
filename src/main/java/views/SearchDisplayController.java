package views;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import models.TransitionalViewModel;

public class SearchDisplayController
{
	
	TransitionalViewModel model;

	public void setModel(TransitionalViewModel newModel)
	{
		model = newModel;
	}
	
	@FXML
    void onClickJob(MouseEvent event) {
		model.showJobPosting();
    }
}
