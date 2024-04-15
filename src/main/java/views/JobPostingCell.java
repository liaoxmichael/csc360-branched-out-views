package views;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import models.BranchedOutModel;
import models.TestJobPostingModel;
import models.TransitionalViewModel;

public class JobPostingCell extends ListCell<TestJobPostingModel>
{
	
	AnchorPane view;
	TestJobPostingModel job;
	JobPostingCellController controller;
	TransitionalViewModel model;
	
	public JobPostingCell(ListView<TestJobPostingModel> view, TransitionalViewModel model) throws IOException {
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(TransitionalViewModel.class.getResource("../views/JobPostingCellView.fxml")); 

		this.view = loader.load();
		this.model = model;

		controller = loader.getController();
		controller.setModels(job, model);
	}
	
	@Override
	protected void updateItem(TestJobPostingModel item, boolean empty) 
	{
		super.updateItem(item, empty);
		
		if (empty || item == null)
		{
			setGraphic(null);
			setText(null);
		}
		else 
		{
			controller.setModels(item, model);
			controller.loadData();
		}
	}
	
}
