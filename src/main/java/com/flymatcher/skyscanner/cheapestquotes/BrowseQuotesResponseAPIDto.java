package com.flymatcher.skyscanner.cheapestquotes;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.flymatcher.skyscanner.cheapestquotes.carrier.CarriersDto;
import com.flymatcher.skyscanner.cheapestquotes.currency.CurrencyDto;
import com.flymatcher.skyscanner.cheapestquotes.place.PlaceDto;

public class BrowseQuotesResponseAPIDto {

  @JsonPropertyOrder({"Currencies", "Places", "Carriers", "Quotes"})

  @JsonProperty("Currencies")
  private List<CurrencyDto> currencies;

  @JsonProperty("Places")
  private List<PlaceDto> places;

  @JsonProperty("Carriers")
  private List<CarriersDto> carriers;

  @JsonProperty("Quotes")
  private List<QuoteDto> quotes;

  @JsonProperty("ValidationErrors")
  private List<ValidationErrorDto> validationErrors;

  public List<CurrencyDto> getCurrencies() {
    return currencies;
  }

  public void setCurrencies(final List<CurrencyDto> currencies) {
    this.currencies = currencies;
  }

  public List<PlaceDto> getPlaces() {
    return places;
  }

  public void setPlaces(final List<PlaceDto> places) {
    this.places = places;
  }

  public List<CarriersDto> getCarriers() {
    return carriers;
  }

  public void setCarriers(final List<CarriersDto> carriers) {
    this.carriers = carriers;
  }

  public List<QuoteDto> getQuotes() {
    return quotes;
  }

  public void setQuotes(final List<QuoteDto> quotes) {
    this.quotes = quotes;
  }


  public List<ValidationErrorDto> getValidationErrors() {
    return validationErrors;
  }

  public void setValidationErrors(final List<ValidationErrorDto> validationErrors) {
    this.validationErrors = validationErrors;
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
