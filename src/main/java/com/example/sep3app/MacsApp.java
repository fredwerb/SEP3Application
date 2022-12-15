package com.example.sep3app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.*;

public class MacsApp extends Application
{
  ObservableList<Country> countries = FXCollections.observableArrayList();

  private final String filename = "countrylist.dat";


  @Override public void start(Stage stage) throws IOException
  {
    FXMLLoader fxmlLoader = new FXMLLoader(
        MacsApp.class.getResource("Macs.fxml"));
    Scene normalScene = new Scene(fxmlLoader.load(), 720, 600);
    MacsController macsController = (MacsController) fxmlLoader.getController();

    FXMLLoader fxmlLoader1 = new FXMLLoader(
        MacsApp.class.getResource("Scene2.fxml"));
    Scene factorScene = new Scene(fxmlLoader1.load(), 720, 600);
    FactorController factorController = (FactorController) fxmlLoader1.getController();

    macsController.setCountries(countries);
    macsController.setAppStage(stage);
    macsController.setNormalScene(normalScene);
    macsController.setFactorScene(factorScene);
    macsController.init();

    factorController.setCountries(countries);
    factorController.setFactorScene(factorScene);
    factorController.setNormalScene(normalScene);
    factorController.setAppStage(stage);


    stage.setTitle("Country Comparison");
    stage.setScene(normalScene);
    stage.show();
    }

    @Override public void stop()
    {
      try
      {
        FileOutputStream fstream = new FileOutputStream(filename);
        ObjectOutputStream outputFile = new ObjectOutputStream(fstream);
        for (Country country : countries)
          outputFile.writeObject(country);
      }
      catch (IOException e)
      {
        JOptionPane.showMessageDialog(null, "Could not write data file", "Error occurred", JOptionPane.ERROR_MESSAGE);
      }
    }





  public static void main(String[] args)
  {
    launch();
  }

}