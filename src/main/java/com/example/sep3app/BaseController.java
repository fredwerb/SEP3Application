package com.example.sep3app;

import javafx.beans.property.StringProperty;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BaseController
{
  protected Stage appStage;

  protected Scene normalScene;

  protected Scene factorScene;

  protected MacsController macsController;
  protected  FactorController factorController;

  public void setAppStage(Stage appStage)
  {
    this.appStage = appStage;
  }

  public void setNormalScene(Scene normalScene)
  {
    this.normalScene = normalScene;
  }
  public void setFactorScene(Scene factorScene)
  {
    this.factorScene = factorScene;
  }

  public void setMacsController(MacsController macsController)
  {
    this.macsController = macsController;
  }

  public void setFactorController(FactorController factorController)
  {
    this.factorController = factorController;
  }

  public ObservableList <Country> countries;

  public  void setCountries(ObservableList<Country> countries)
  {
    this.countries = countries;
  }

}
