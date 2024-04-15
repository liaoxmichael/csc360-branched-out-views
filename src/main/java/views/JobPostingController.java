package views;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.BranchedOutModel;
import models.TransitionalViewModel;

public class JobPostingController
{

	TransitionalViewModel tvm;
	BranchedOutModel model;

	public void setModels(BranchedOutModel newModel, TransitionalViewModel tvm)
	{
		this.tvm = tvm;
		model = newModel;
	}

	@FXML
	void onClickBack(ActionEvent event) throws IOException
	{
		tvm.showSearchDisplay();
	}

}
