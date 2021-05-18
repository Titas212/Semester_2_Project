package client.view;

import client.viewModel.ParkingLotViewModel;
import client.viewModel.RegisterViewModel;
import javafx.fxml.FXML;
import javafx.scene.layout.Region;
import server.model.domain.ParkingLot;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import utility.observer.javaobserver.UnnamedPropertyChangeSubject;

import java.awt.*;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.rmi.RemoteException;

public class ParkingLotViewController implements UnnamedPropertyChangeSubject {

    @FXML
    private Label spaceA1;
    @FXML
    private Label spaceA2;
    @FXML
    private Label spaceA3;
    @FXML
    private Label spaceA4;
    @FXML
    private Label spaceA5;
    @FXML
    private Label spaceA6;

    @FXML
    private Label spaceB1;
    @FXML
    private Label spaceB2;
    @FXML
    private Label spaceB3;
    @FXML
    private Label spaceB4;

    @FXML
    private Label spaceC1;
    @FXML
    private Label spaceC2;
    @FXML
    private Label spaceC3;
    @FXML
    private Label spaceC4;

    @FXML
    private Label spaceD1;
    @FXML
    private Label spaceD2;
    @FXML
    private Label spaceD3;
    @FXML
    private Label spaceD4;
    @FXML
    private Label spaceD5;
    @FXML
    private Label spaceD6;

    private ViewHandler viewHandler;
    private Region root;
    private ParkingLotViewModel viewModel;

    private PropertyChangeSupport propertyChangeSupport;

    public ParkingLotViewController() {

    }

    public void init(ViewHandler viewHandler, ParkingLotViewModel viewModel, Region root) throws RemoteException {
        this.viewModel = viewModel;
        this.viewHandler = viewHandler;
        this.root = root;
        propertyChangeSupport = new PropertyChangeSupport(this);

        spaceA1.textProperty().bindBidirectional(viewModel.spaceA1Property());
        spaceA2.textProperty().bindBidirectional(viewModel.spaceA2Property());
        spaceA3.textProperty().bindBidirectional(viewModel.spaceA3Property());
        spaceA4.textProperty().bindBidirectional(viewModel.spaceA4Property());
        spaceA5.textProperty().bindBidirectional(viewModel.spaceA5Property());
        spaceA6.textProperty().bindBidirectional(viewModel.spaceA6Property());

        spaceB1.textProperty().bindBidirectional(viewModel.spaceB1Property());
        spaceB2.textProperty().bindBidirectional(viewModel.spaceB2Property());
        spaceB3.textProperty().bindBidirectional(viewModel.spaceB3Property());
        spaceB4.textProperty().bindBidirectional(viewModel.spaceB4Property());

        spaceC1.textProperty().bindBidirectional(viewModel.spaceC1Property());
        spaceC2.textProperty().bindBidirectional(viewModel.spaceC2Property());
        spaceC3.textProperty().bindBidirectional(viewModel.spaceC3Property());
        spaceC4.textProperty().bindBidirectional(viewModel.spaceC4Property());

        spaceD1.textProperty().bindBidirectional(viewModel.spaceD1Property());
        spaceD2.textProperty().bindBidirectional(viewModel.spaceD2Property());
        spaceD3.textProperty().bindBidirectional(viewModel.spaceD3Property());
        spaceD4.textProperty().bindBidirectional(viewModel.spaceD4Property());
        spaceD5.textProperty().bindBidirectional(viewModel.spaceD5Property());
        spaceD6.textProperty().bindBidirectional(viewModel.spaceD6Property());

        setColour(spaceA1, "A1");
        setColour(spaceA2, "A2");
        setColour(spaceA3, "A3");
        setColour(spaceA4, "A4");
        setColour(spaceA5, "A5");
        setColour(spaceA6, "A6");

        setColour(spaceB1, "B1");
        setColour(spaceB2, "B2");
        setColour(spaceB3, "B3");
        setColour(spaceB4, "B4");

        setColour(spaceC1, "C1");
        setColour(spaceC2, "C2");
        setColour(spaceC3, "C3");
        setColour(spaceC4, "C4");

        setColour(spaceD1, "D1");
        setColour(spaceD2, "D2");
        setColour(spaceD3, "D3");
        setColour(spaceD4, "D4");
        setColour(spaceD5, "D5");
        setColour(spaceD6, "D6");
    }

    public Region getRoot() {
        return root;
    }

    public void reset() {
        viewModel.reset();
    }

    private void setColour(Label space, String name) throws RemoteException {
        if (viewModel.isOccupied(name)) {
            space.setTextFill(Color.rgb(255, 0, 0));
        } else if (space.isYourCar()) {
            space.setTextFill(Color.rgb(0, 0, 255));
        } else {
            spaceD6.setTextFill(Color.rgb(0, 255, 0));
        }
    }

    @FXML
    private void onClickedA1() {
        onClickUndef("A1");
    }

    @FXML
    private void onClickedA2() {

        onClickUndef("A2");
    }

    @FXML
    private void onClickedA3() {

        onClickUndef("A3");
    }

    @FXML
    private void onClickedA4() {

        onClickUndef("A4");
    }

    @FXML
    private void onClickedA5() {

        onClickUndef("A5");
    }

    @FXML
    private void onClickedA6() {
        onClickUndef("A6");
    }

    @FXML
    private void onClickedB1() {
        onClickUndef("B1");
    }

    @FXML
    private void onClickedB2() {
        onClickUndef("B2");
    }

    @FXML
    private void onClickedB3() {
        onClickUndef("B3");
    }

    @FXML
    private void onClickedB4() {
        onClickUndef("B4");
    }

    @FXML
    private void onClickedC1() {
        onClickUndef("C1");
    }

    @FXML
    private void onClickedC2() {
        onClickUndef("C2");
    }

    @FXML
    private void onClickedC3() {
        onClickUndef("C3");
    }

    @FXML
    private void onClickedC4() {
        onClickUndef("C4");
    }

    @FXML
    private void onClickedD1() {
        onClickUndef("D1");
    }

    @FXML
    private void onClickedD2() {
        onClickUndef("D2");
    }

    @FXML
    private void onClickedD3() {
        onClickUndef("D3");
    }

    @FXML
    private void onClickedD4() {
        onClickUndef("D4");
    }

    @FXML
    private void onClickedD5() {
        onClickUndef("D5");
    }

    @FXML
    private void onClickedD6() {
        onClickUndef("D6");
    }

    private void onClickUndef(String name) {
        viewHandler.openView("ReserveView");
        propertyChangeSupport.firePropertyChange(name, null, 1);
    }

    @Override
    public void addListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    @Override
    public void removeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
