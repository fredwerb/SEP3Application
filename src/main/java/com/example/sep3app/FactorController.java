package com.example.sep3app;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.*;
public class FactorController extends BaseController
{

  @FXML Button doneButton;
  @FXML Button backButton;
  @FXML TextField nameOfCountry;
  @FXML TextField marketSize;
  @FXML TextField competitiveConditions;
  @FXML TextField GDP;
  @FXML TextField knowHow;
  @FXML TextField productFlexibility;
  @FXML TextField marketGrowth;
  @FXML TextField brandValue;


  private void clearFields()
  {
    nameOfCountry.clear();
    marketSize.clear();
    competitiveConditions.clear();
    GDP.clear();
    knowHow.clear();
    productFlexibility.clear();
    marketGrowth.clear();
    brandValue.clear();

  }
  @FXML public void onDoneButtonClick(ActionEvent event)
  {
    if (nameOfCountry.getText().length() < 1
        || marketGrowth.getText().length() < 1
        || marketSize.getText().length() < 1 || GDP.getText().length() < 1
        || competitiveConditions.getText().length() < 1
        || brandValue.getText().length() < 1 || knowHow.getText().length() < 1
        || productFlexibility.getText().length() < 1 )
    {
      JOptionPane.showMessageDialog(null, "All fields must be set",
          "An error occurred", JOptionPane.ERROR_MESSAGE);
      return;
    }

    {
      int maCalc = ((Integer.parseInt(marketGrowth.getText()) + Integer.parseInt(
          marketSize.getText()) + Integer.parseInt(GDP.getText()) + Integer.parseInt(competitiveConditions.getText())) / 4);

      int csCalc = ((Integer.parseInt(brandValue.getText()) + Integer.parseInt(
          knowHow.getText()) + Integer.parseInt(productFlexibility.getText())) / 3);

      countries.add(new Country(nameOfCountry.getText(),maCalc, csCalc,
          Integer.parseInt(marketGrowth.getText()),
          Integer.parseInt(marketSize.getText()),
          Integer.parseInt(GDP.getText()),
          Integer.parseInt(competitiveConditions.getText()),
          Integer.parseInt(brandValue.getText()))
          );

      clearFields();
      appStage.setScene(normalScene);
    }
  }
  @FXML public void onBackButtonClick(ActionEvent event)  {
    appStage.setScene(normalScene);
  }

}


