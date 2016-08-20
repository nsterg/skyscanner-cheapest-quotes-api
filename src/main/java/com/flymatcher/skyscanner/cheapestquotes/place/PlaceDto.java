package com.flymatcher.skyscanner.cheapestquotes.place;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class PlaceDto {
  @JsonPropertyOrder({"PlaceId", "IataCode", "Name", "Type", "SkyscannerCode", "CityName", "CityId",
      "CountryName"})

  @JsonProperty("PlaceId")
  private int placeId;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("SkyscannerCode")
  private String skyscannerCode;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("CityName")
  private String cityName;

  @JsonProperty("CityId")
  private String cityId;

  @JsonProperty("CountryName")
  private String countryName;

  @JsonProperty("IataCode")
  private String iataCode;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getPlaceId() {
    return placeId;
  }

  public void setPlaceId(final int placeId) {
    this.placeId = placeId;
  }

  public String getSkyscannerCode() {
    return skyscannerCode;
  }

  public void setSkyscannerCode(final String skyscannerCode) {
    this.skyscannerCode = skyscannerCode;
  }

  public String getType() {
    return type;
  }

  public void setType(final String Type) {
    this.type = Type;
  }


  public String getCityName() {
    return cityName;
  }

  public void setCityName(final String cityName) {
    this.cityName = cityName;
  }

  public String getCityId() {
    return cityId;
  }

  public void setCityId(final String cityId) {
    this.cityId = cityId;
  }

  public String getCountryName() {
    return countryName;
  }

  public void setCountryName(final String countryName) {
    this.countryName = countryName;
  }

  public String getIataCode() {
    return iataCode;
  }

  public void setIataCode(final String iataCode) {
    this.iataCode = iataCode;
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }

  @Override
  public boolean equals(final Object obj) {
    return reflectionEquals(this, obj);
  }

  @Override
  public String toString() {
    return reflectionToString(this);
  }
}
