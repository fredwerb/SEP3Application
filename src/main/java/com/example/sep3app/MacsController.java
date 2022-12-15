package com.example.sep3app;

import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.Comparator;
import java.util.ResourceBundle;

public class MacsController extends BaseController
{

  @FXML private Button addValuesButton;

  //Columns
  @FXML public TableColumn<Country, String> CountryColumn;

  @FXML public TableColumn<Country, String> columnMarket;

  @FXML public TableColumn<Country, String> columnCompSt;

  @FXML private TableView<Country> table;

  public void init()
  {
    table.setItems(countries);

    CountryColumn.setCellValueFactory(new PropertyValueFactory<>("nameOfCountry"));
    columnMarket.setCellValueFactory(new PropertyValueFactory<>("marketSize"));
    columnCompSt.setCellValueFactory(new PropertyValueFactory<>("competitiveConditions"));

    Comparator<String> columnComparator = (String v1, String v2) -> {
      return v1.toLowerCase().compareTo(v2.toLowerCase());

    };

    CountryColumn.setComparator(columnComparator);
    columnCompSt.setComparator(columnComparator);
    columnMarket.setComparator(columnComparator);
    table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
  }

  @FXML public void onAddValuesButtonClick() {
      appStage.setScene(factorScene);
    }
  }

