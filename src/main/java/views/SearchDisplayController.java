package views;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import models.BranchedOutModel;
import models.TransitionalViewModel;

public class SearchDisplayController
{
	TransitionalViewModel tvm;
	BranchedOutModel model;

	public void setModels(BranchedOutModel newModel, TransitionalViewModel tvm)
	{
		this.tvm = tvm;
		model = newModel;
	}
	
	@FXML
    void onClickJob(MouseEvent event) {
		tvm.showJobPosting();
    }
}
