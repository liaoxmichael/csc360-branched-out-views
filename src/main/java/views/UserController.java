package views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import models.BranchedOutModel;
import models.TransitionalViewModel;

public class UserController
{
	TransitionalViewModel tvm;
	BranchedOutModel model;

	public void setModels(BranchedOutModel newModel, TransitionalViewModel tvm)
	{
		this.tvm = tvm;
		model = newModel;
	}
}
