package com.flymatcher.skyscanner.cheapestquotes.currency.builders;

import com.flymatcher.skyscanner.cheapestquotes.currency.CurrencyDto;


public class CurrencyDtoBuilder {

  private int decimalDigits;
  private boolean symbolOnLeft;
  private String decimalSeparator;
  private String thousandsSeparator;
  private int roundingCoefficient;
  private String code;
  private boolean spaceBetweenAmountAndSymbol;

  private CurrencyDtoBuilder() {}

  public static CurrencyDtoBuilder aCurrencyDto() {
    return new CurrencyDtoBuilder();
  }

  public CurrencyDto build() {
    final CurrencyDto currencyDto = new CurrencyDto();

    currencyDto.setDecimalDigits(decimalDigits);
    currencyDto.setSymbolOnLeft(symbolOnLeft);
    currencyDto.setDecimalSeparator(decimalSeparator);
    currencyDto.setThousandsSeparator(thousandsSeparator);
    currencyDto.setRoundingCoefficient(roundingCoefficient);
    currencyDto.setCode(code);
    currencyDto.setSpaceBetweenAmountAndSymbol(spaceBetweenAmountAndSymbol);

    return currencyDto;
  }

  public CurrencyDtoBuilder withDecimalDigits(final int decimalDigits) {
    this.decimalDigits = decimalDigits;
    return this;
  }

  public CurrencyDtoBuilder withSymbolOnLeft(final boolean symbolOnLeft) {
    this.symbolOnLeft = symbolOnLeft;
    return this;
  }

  public CurrencyDtoBuilder withDecimalSeparator(final String decimalSeparator) {
    this.decimalSeparator = decimalSeparator;
    return this;
  }

  public CurrencyDtoBuilder withThousandsSeparator(final String thousandsSeparator) {
    this.thousandsSeparator = thousandsSeparator;
    return this;
  }

  public CurrencyDtoBuilder withRoundingCoefficient(final int roundingCoefficient) {
    this.roundingCoefficient = roundingCoefficient;
    return this;
  }

  public CurrencyDtoBuilder withCode(final String code) {
    this.code = code;
    return this;
  }

  public CurrencyDtoBuilder withSpaceBetweenAmountAndSymbol(
      final boolean spaceBetweenAmountAndSymbol) {
    this.spaceBetweenAmountAndSymbol = spaceBetweenAmountAndSymbol;
    return this;
  }

  public CurrencyDtoBuilder withDefaultValues() {
    this.decimalDigits = 2;
    this.symbolOnLeft = true;
    this.decimalSeparator = ".";
    this.thousandsSeparator = ",";
    this.roundingCoefficient = 0;
    this.code = "GBP";
    this.spaceBetweenAmountAndSymbol = false;
    return this;
  }

}
