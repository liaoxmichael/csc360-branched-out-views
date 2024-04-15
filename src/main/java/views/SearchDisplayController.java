package views;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.util.Callback;
import models.BranchedOutModel;
import models.TestJobPostingModel;
import models.TransitionalViewModel;

public class SearchDisplayController
{
	TransitionalViewModel tvm;
	BranchedOutModel model;
	
    @FXML
    private ListView<TestJobPostingModel> jobView;

	public void setModels(BranchedOutModel newModel, TransitionalViewModel tvm)
	{
		this.tvm = tvm;
		model = newModel;
		
	}
	
	@FXML
    void onClickJob(MouseEvent event) throws IOException {
		JobPostingCell cell = (JobPostingCell) event.getTarget();
		TestJobPostingModel model = cell.getItem();
		tvm.showJobPosting(model);
    }
	
	public void loadData()
	{
		jobView.setCellFactory(new Callback<ListView<TestJobPostingModel>, ListCell<TestJobPostingModel>>() 
		{

			@Override
			public ListCell<TestJobPostingModel> call(ListView<TestJobPostingModel> param) 
			{
				// TODO Auto-generated method stub
				try
				{
					return new JobPostingCell(param, tvm);
				} catch (IOException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return null;
			}
	
		}
		);

		jobView.setItems(model.getJobs());
	}

}
