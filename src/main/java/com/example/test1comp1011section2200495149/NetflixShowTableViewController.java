package com.example.test1comp1011section2200495149;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class NetflixShowTableViewController implements Initializable {

    @FXML
    private TableColumn<NetflixShow, String> castColumn;

    @FXML
    private TableColumn<NetflixShow, String> directorColumn;

    @FXML
    private TableColumn<NetflixShow, String> ratingColumn;

    @FXML
    private TableColumn<NetflixShow, Integer> showIdColumn;

    @FXML
    private TableColumn<NetflixShow, String> titleColumn;

    @FXML
    private TableColumn<NetflixShow, String> typeColumn;

    @FXML
    private TableView<NetflixShow> showTable;

    @FXML
    private CheckBox movieCheckBox;

    @FXML
    private CheckBox tvShowCheckBox;

    @FXML
    private Label numberOfShowsLabel;

    @FXML
    private ComboBox<String> ratingComboBox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        castColumn.setCellValueFactory(new PropertyValueFactory<>("cast"));
        directorColumn.setCellValueFactory(new PropertyValueFactory<>("director"));
        ratingColumn.setCellValueFactory(new PropertyValueFactory<>("rating"));
        showIdColumn.setCellValueFactory(new PropertyValueFactory<>("showId"));
        titleColumn.setCellValueFactory(new PropertyValueFactory<>("title"));
        typeColumn.setCellValueFactory(new PropertyValueFactory<>("type"));
        showTable.getItems().addAll(DBUtility.getNetflixShowsFromDB());

        ratingComboBox.getItems().addAll(DBUtility.getRatingsFromDB());

        numberOfShowsLabel.setText("Number of movies/shows : " + showTable.getItems().size());

        movieCheckBox.setSelected(true);
        tvShowCheckBox.setSelected(true);



    }
}
