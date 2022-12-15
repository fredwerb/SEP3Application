package com.example.sep3app;

import javafx.beans.property.*;

import java.io.*;


public class Country implements Serializable
{
  private transient StringProperty nameOfCountry;
  private transient IntegerProperty marketGrowth;
  private transient IntegerProperty competitiveConditions;
  private transient IntegerProperty GDP;
  private transient IntegerProperty marketSize;
  private transient IntegerProperty productFlexibility;
  private transient IntegerProperty brandValue;
  private transient IntegerProperty knowHow;

  public int getMarketGrowth()
  {
    return marketGrowth.get();
  }

  public IntegerProperty marketGrowthProperty ()
  {
    return marketGrowth;
  }

  public void setMarketGrowth(int marketGrowth)
  {
    this.marketGrowth.set(marketGrowth);
  }

  public String getNameOfCountry()
  {
    return nameOfCountry.get();
  }

  public StringProperty nameOfCountryProperty()
  {
    return nameOfCountry;
  }

  public void setNameOfCountry(String nameOfCountry)
  {
    this.nameOfCountry.set(nameOfCountry);
  }

  public int getCompetitiveConditions()
  {
    return competitiveConditions.get();
  }

  public IntegerProperty competitiveConditionsProperty()
  {
    return competitiveConditions;
  }

  public void setCompetitiveConditions(int competitiveConditions)
  {
    this.competitiveConditions.set(competitiveConditions);
  }

  public int getGDP()
  {
    return GDP.get();
  }

  public IntegerProperty GDPProperty()
  {
    return GDP;
  }

  public void setGDP(int GDP)
  {
    this.GDP.set(GDP);
  }

  public int getMarketSize()
  {
    return marketSize.get();
  }

  public IntegerProperty marketSizeProperty()
  {
    return marketSize;
  }

  public void setMarketSize(int marketSize)
  {
    this.marketSize.set(marketSize);
  }

  public int getProductFlexibility()
  {
    return productFlexibility.get();
  }

  public IntegerProperty productFlexibilityProperty()
  {
    return productFlexibility;
  }

  public void setProductFlexibility(int productFlexibility)
  {
    this.productFlexibility.set(productFlexibility);
  }

  public int getBrandValue()
  {
    return brandValue.get();
  }

  public IntegerProperty brandValueProperty()
  {
    return brandValue;
  }

  public void setBrandValue(int brandValue)
  {
    this.brandValue.set(brandValue);
  }

  public int getKnowHow()
  {
    return knowHow.get();
  }

  public IntegerProperty knowHowProperty()
  {
    return knowHow;
  }

  public void setKnowHow(int knowHow)
  {
    this.knowHow.set(knowHow);
  }


  Country()
  {
    this.nameOfCountry = new SimpleStringProperty(this, "nameOfCountry");
    this.marketSize = new SimpleIntegerProperty(this, "marketSize");
    this.competitiveConditions = new SimpleIntegerProperty(this,
        "competitiveConditions");
    this.GDP = new SimpleIntegerProperty(this, "GDP");
    this.productFlexibility = new SimpleIntegerProperty(this,
        "productFlexibility");
    this.brandValue = new SimpleIntegerProperty(this, "brandValue");
    this.knowHow = new SimpleIntegerProperty(this, "knowHow");
    this.marketGrowth = new SimpleIntegerProperty(this, "marketGrowth");

  }
  Country(String nameOfCountry, int marketGrowth, int marketSize,
      int competitiveConditions, int GDP, int productFlexibility,
      int brandValue, int knowHow)

    {
this();
      setNameOfCountry(nameOfCountry);
      setGDP(GDP);
      setMarketGrowth(marketGrowth);
      setBrandValue(brandValue);
      setKnowHow(knowHow);
      setProductFlexibility(productFlexibility);
      setCompetitiveConditions(competitiveConditions);
      setMarketSize(marketSize);

  }

  @Serial private void writeObject(ObjectOutputStream s) throws IOException
  {
    s.defaultWriteObject();
    s.writeObject(getNameOfCountry());
    s.writeObject(getBrandValue());
    s.writeObject(getGDP());
    s.writeObject(getMarketGrowth());
    s.writeObject(getKnowHow());
    s.writeObject(getProductFlexibility());
    s.writeObject(getCompetitiveConditions());
    s.writeObject(getMarketSize());

  }

  @Serial private void readObject(ObjectInputStream s)
      throws IOException, ClassNotFoundException
  {
    s.defaultReadObject();
    nameOfCountry = new SimpleStringProperty((String) s.readObject());
    marketGrowth = new SimpleIntegerProperty((int) s.readObject());
    competitiveConditions = new SimpleIntegerProperty((int) s.readObject());
    GDP = new SimpleIntegerProperty((int) s.readObject());
    marketSize = new SimpleIntegerProperty((int) s.readObject());
    productFlexibility = new SimpleIntegerProperty((int) s.readObject());
    brandValue = new SimpleIntegerProperty((int) s.readObject());
    knowHow = new SimpleIntegerProperty((int) s.readObject());

  }



}



