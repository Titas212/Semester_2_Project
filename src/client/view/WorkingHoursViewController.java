package client.view;

import client.viewModel.LoginViewModel;
import client.viewModel.WorkingHoursViewModel;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Region;

/**
 * A controller for working hours view.
 */
public class WorkingHoursViewController
{
  @FXML private Label errorLabel;
  private ViewHandler viewHandler;
  private Region root;
  private WorkingHoursViewModel workingHoursViewModel;

  /**
   * Constructor that is empty.
   */
  public WorkingHoursViewController()
  {

  }
  /**
   * Initialization method to initialize controllers viewmodel, viewhandler, root and binding instance variables to viewmodels.
   * @param viewHandler views handler.
   * @param viewModel cancel reservation viewmodel.
   * @param root root.
   */
  public void init(ViewHandler viewHandler, WorkingHoursViewModel viewModel, Region root)
  {
    this.workingHoursViewModel = viewModel;
    this.viewHandler = viewHandler;
    this.root = root;
    errorLabel.textProperty().bindBidirectional(viewModel.getErrorProperty());
  }

  /**
   * Getter for root.
   * @return root.
   */
  public Region getRoot()
  {
    return root;
  }

  /**
   * Resetting the controller.
   */
  public void reset()
  {
    workingHoursViewModel.reset();
  }


  @FXML private void onProfile()
  {
    viewHandler.openView("ProfileView");
  }

  @FXML private void onParkingLot()
  {
    viewHandler.openView("ParkingLotView");
  }

  @FXML private void onChangeYourCar()
  {
    viewHandler.openView("ChangeCar");
  }



}
