package views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.TransitionalViewModel;

public class JobPostingController
{

	TransitionalViewModel model;

	public void setModel(TransitionalViewModel newModel)
	{
		model = newModel;
	}

	@FXML
	void onClickBack(ActionEvent event) throws IOException
	{
		model.showSearchDisplay();
	}

}
