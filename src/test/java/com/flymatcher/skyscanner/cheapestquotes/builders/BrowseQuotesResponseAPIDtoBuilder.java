package com.flymatcher.skyscanner.cheapestquotes.builders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.flymatcher.skyscanner.cheapestquotes.BrowseQuotesResponseAPIDto;
import com.flymatcher.skyscanner.cheapestquotes.QuoteDto;
import com.flymatcher.skyscanner.cheapestquotes.ValidationErrorDto;
import com.flymatcher.skyscanner.cheapestquotes.carrier.CarriersDto;
import com.flymatcher.skyscanner.cheapestquotes.carrier.builders.CarriersDtoBuilder;
import com.flymatcher.skyscanner.cheapestquotes.currency.CurrencyDto;
import com.flymatcher.skyscanner.cheapestquotes.currency.builders.CurrencyDtoBuilder;
import com.flymatcher.skyscanner.cheapestquotes.place.PlaceDto;
import com.flymatcher.skyscanner.cheapestquotes.place.builders.PlaceDtoBuilder;


public class BrowseQuotesResponseAPIDtoBuilder {

  private List<CurrencyDto> currencies;
  private List<PlaceDto> places;
  private List<CarriersDto> carriers;
  private List<QuoteDto> quotes;
  private List<ValidationErrorDto> validationErrors;

  private BrowseQuotesResponseAPIDtoBuilder() {}

  public static BrowseQuotesResponseAPIDtoBuilder aBrowseQuotesResponseAPIDto() {
    return new BrowseQuotesResponseAPIDtoBuilder();
  }

  public BrowseQuotesResponseAPIDto build() {
    final BrowseQuotesResponseAPIDto browseQuotesResponseAPIDto = new BrowseQuotesResponseAPIDto();

    browseQuotesResponseAPIDto.setCurrencies(currencies);
    browseQuotesResponseAPIDto.setPlaces(places);
    browseQuotesResponseAPIDto.setCarriers(carriers);
    browseQuotesResponseAPIDto.setQuotes(quotes);
    browseQuotesResponseAPIDto.setValidationErrors(validationErrors);
    return browseQuotesResponseAPIDto;
  }

  public BrowseQuotesResponseAPIDtoBuilder withQuotes(final QuoteDtoBuilder... builders) {
    return withQuotes(Arrays.asList(builders));

  }

  public BrowseQuotesResponseAPIDtoBuilder withQuotes(final List<QuoteDtoBuilder> builders) {
    if (null == this.quotes) {
      this.quotes = new ArrayList<QuoteDto>();
    }

    for (final QuoteDtoBuilder builder : builders) {
      this.quotes.add(builder.build());
    }

    return this;
  }

  public BrowseQuotesResponseAPIDtoBuilder withCurrencies(final CurrencyDtoBuilder... builders) {
    return withCurrencies(Arrays.asList(builders));

  }

  public BrowseQuotesResponseAPIDtoBuilder withCurrencies(final List<CurrencyDtoBuilder> builders) {
    if (null == this.currencies) {
      this.currencies = new ArrayList<CurrencyDto>();
    }

    for (final CurrencyDtoBuilder builder : builders) {
      this.currencies.add(builder.build());
    }

    return this;
  }

  public BrowseQuotesResponseAPIDtoBuilder withCarriers(final CarriersDtoBuilder... builders) {
    return withCarriers(Arrays.asList(builders));

  }

  public BrowseQuotesResponseAPIDtoBuilder withCarriers(final List<CarriersDtoBuilder> builders) {
    if (null == this.carriers) {
      this.carriers = new ArrayList<CarriersDto>();
    }

    for (final CarriersDtoBuilder builder : builders) {
      this.carriers.add(builder.build());
    }

    return this;
  }

  public BrowseQuotesResponseAPIDtoBuilder withPlaces(final PlaceDtoBuilder... builders) {
    return withPlaces(Arrays.asList(builders));

  }

  public BrowseQuotesResponseAPIDtoBuilder withPlaces(final List<PlaceDtoBuilder> builders) {
    if (null == this.places) {
      this.places = new ArrayList<PlaceDto>();
    }

    for (final PlaceDtoBuilder builder : builders) {
      this.places.add(builder.build());
    }

    return this;
  }

  public BrowseQuotesResponseAPIDtoBuilder withValidationErrors(
      final ValidationErrorDtoBuilder... builders) {
    return withValidationErrors(Arrays.asList(builders));

  }

  public BrowseQuotesResponseAPIDtoBuilder withValidationErrors(
      final List<ValidationErrorDtoBuilder> builders) {
    if (null == this.validationErrors) {
      this.validationErrors = new ArrayList<ValidationErrorDto>();
    }

    for (final ValidationErrorDtoBuilder builder : builders) {
      this.validationErrors.add(builder.build());
    }

    return this;
  }

}
