package com.flymatcher.skyscanner.cheapestquotes.place.builders;

import com.flymatcher.skyscanner.cheapestquotes.place.PlaceDto;


public class PlaceDtoBuilder {

  private String name;
  private int placeId;
  private String skyscannerCode;
  private String type;
  private String cityName;
  private String cityId;
  private String countryName;
  private String iataCode;


  private PlaceDtoBuilder() {}

  public static PlaceDtoBuilder aPlaceDto() {
    return new PlaceDtoBuilder();
  }

  public PlaceDto build() {
    final PlaceDto placeDto = new PlaceDto();

    placeDto.setName(name);
    placeDto.setPlaceId(placeId);
    placeDto.setSkyscannerCode(skyscannerCode);
    placeDto.setType(type);
    placeDto.setCityId(cityId);
    placeDto.setCityName(cityName);
    placeDto.setCountryName(countryName);
    placeDto.setIataCode(iataCode);

    return placeDto;
  }

  public PlaceDtoBuilder withName(final String name) {
    this.name = name;
    return this;
  }

  public PlaceDtoBuilder withPlaceId(final int placeId) {
    this.placeId = placeId;
    return this;
  }

  public PlaceDtoBuilder withSkyscannerCode(final String skyscannerCode) {
    this.skyscannerCode = skyscannerCode;
    return this;
  }

  public PlaceDtoBuilder withType(final String type) {
    this.type = type;
    return this;
  }

  public PlaceDtoBuilder withCityId(final String cityId) {
    this.cityId = cityId;
    return this;
  }

  public PlaceDtoBuilder withCityName(final String cityName) {
    this.cityName = cityName;
    return this;
  }

  public PlaceDtoBuilder withCountryName(final String countryName) {
    this.countryName = countryName;
    return this;
  }

  public PlaceDtoBuilder withIataCode(final String iataCode) {
    this.iataCode = iataCode;
    return this;
  }

  public PlaceDtoBuilder withDefaultValues() {
    this.name = "Aberdeen";
    this.placeId = 40074;
    this.skyscannerCode = "ABZ";
    this.type = "Station";
    this.cityName = "United Kingdom";
    this.cityId = "ABER";
    this.countryName = "United Kingdom";
    this.iataCode = "ABZ";
    return this;
  }

}
