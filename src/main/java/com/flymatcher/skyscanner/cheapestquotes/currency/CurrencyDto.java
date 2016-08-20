package com.flymatcher.skyscanner.cheapestquotes.currency;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class CurrencyDto {

  @JsonPropertyOrder({"Code", "ThousandsSeparator", "DecimalSeparator", "SymbolOnLeft",
      "SpaceBetweenAmountAndSymbol", "RoundingCoefficient", "DecimalDigits"})

  @JsonProperty("DecimalDigits")
  private int decimalDigits;

  @JsonProperty("SymbolOnLeft")
  private boolean symbolOnLeft;

  @JsonProperty("DecimalSeparator")
  private String decimalSeparator;

  @JsonProperty("ThousandsSeparator")
  private String thousandsSeparator;

  @JsonProperty("RoundingCoefficient")
  private int roundingCoefficient;

  @JsonProperty("Code")
  private String code;

  @JsonProperty("SpaceBetweenAmountAndSymbol")
  private boolean spaceBetweenAmountAndSymbol;

  public int getDecimalDigits() {
    return decimalDigits;
  }

  public void setDecimalDigits(final int decimalDigits) {
    this.decimalDigits = decimalDigits;
  }

  public boolean getSymbolOnLeft() {
    return symbolOnLeft;
  }

  public void setSymbolOnLeft(final boolean symbolOnLeft) {
    this.symbolOnLeft = symbolOnLeft;
  }

  public String getDecimalSeparator() {
    return decimalSeparator;
  }

  public void setDecimalSeparator(final String decimalSeparator) {
    this.decimalSeparator = decimalSeparator;
  }

  public String getThousandsSeparator() {
    return thousandsSeparator;
  }

  public void setThousandsSeparator(final String thousandsSeparator) {
    this.thousandsSeparator = thousandsSeparator;
  }

  public int getRoundingCoefficient() {
    return roundingCoefficient;
  }

  public void setRoundingCoefficient(final int roundingCoefficient) {
    this.roundingCoefficient = roundingCoefficient;
  }

  public String getCode() {
    return code;
  }

  public void setCode(final String code) {
    this.code = code;
  }

  public boolean getSpaceBetweenAmountAndSymbol() {
    return spaceBetweenAmountAndSymbol;
  }

  public void setSpaceBetweenAmountAndSymbol(final boolean spaceBetweenAmountAndSymbol) {
    this.spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
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
