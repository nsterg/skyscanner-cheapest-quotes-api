package com.flymatcher.skyscanner.cheapestquotes;

import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.flymatcher.skyscanner.cheapestquotes.builders.BrowseQuotesResponseAPIDtoBuilder.aBrowseQuotesResponseAPIDto;
import static com.flymatcher.skyscanner.cheapestquotes.builders.QuoteDtoBuilder.aQuoteDto;
import static com.flymatcher.skyscanner.cheapestquotes.builders.SkyscannerLegBuilder.aSkyscannerLeg;
import static com.flymatcher.skyscanner.cheapestquotes.builders.ValidationErrorDtoBuilder.aValidationError;
import static com.flymatcher.skyscanner.cheapestquotes.carrier.builders.CarriersDtoBuilder.aCarriersDto;
import static com.flymatcher.skyscanner.cheapestquotes.currency.builders.CurrencyDtoBuilder.aCurrencyDto;
import static com.flymatcher.skyscanner.cheapestquotes.place.builders.PlaceDtoBuilder.aPlaceDto;
import static java.util.Arrays.asList;
import static org.apache.commons.io.FileUtils.readFileToString;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class QuotesResponseUnmarshalTest {
  private ObjectMapper mapper;

  @Before
  public void setup() {
    mapper = new ObjectMapper().configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
  }

  @Test
  public void shouldUnmarshalCheapestQuotesSuccessResponse()
      throws JsonParseException, JsonMappingException, IOException {

    // @formatter:off
    final BrowseQuotesResponseAPIDto expectedDto = aBrowseQuotesResponseAPIDto()
                                                    .withQuotes(aQuoteDto()
                                                                .withDirect(true)
                                                                .withInboundLeg(aSkyscannerLeg()
                                                                                .withCarrierIds(asList(1050))
                                                                                .withDepartureDate("2016-10-23T00:00:00")
                                                                                .withDestinationId(65655)
                                                                                .withOriginId(40074))
                                                                .withOutboundLeg(aSkyscannerLeg()
                                                                                .withCarrierIds(asList(1050))
                                                                                .withDepartureDate("2016-10-10T00:00:00")
                                                                                .withDestinationId(40074)
                                                                                .withOriginId(66270))                                                                    
                                                                .withMinPrice(62)
                                                                .withQuoteDateTime("2016-08-06T22:01:00")
                                                                .withQuoteId(1), 
                                                                aQuoteDto()
                                                                .withDirect(false)
                                                                .withInboundLeg(aSkyscannerLeg()
                                                                                .withCarrierIds(asList(1324))
                                                                                .withDepartureDate("2016-12-30T00:00:00")
                                                                                .withDestinationId(65698)
                                                                                .withOriginId(40074))
                                                                .withOutboundLeg(aSkyscannerLeg()
                                                                                .withCarrierIds(asList(1324))
                                                                                .withDepartureDate("2016-12-26T00:00:00")
                                                                                .withDestinationId(40074)
                                                                                .withOriginId(65698))                                                                    
                                                                .withMinPrice(165)
                                                                .withQuoteDateTime("2016-08-18T11:56:00")
                                                                .withQuoteId(2))
                                                    .withPlaces(aPlaceDto()
                                                                      .withCityId("ABER")
                                                                      .withCityName("Aberdeen")
                                                                      .withCountryName("United Kingdom")
                                                                      .withIataCode("ABZ")
                                                                      .withName("Aberdeen")
                                                                      .withPlaceId(40074)
                                                                      .withSkyscannerCode("ABZ")
                                                                      .withType("Station"))
                                                    .withCurrencies(aCurrencyDto()
                                                                      .withCode("GBP")
                                                                      .withDecimalDigits(2)
                                                                      .withDecimalSeparator(".")
                                                                      .withRoundingCoefficient(0)
                                                                      .withSpaceBetweenAmountAndSymbol(false)
                                                                      .withSymbolOnLeft(true)
                                                                      .withThousandsSeparator(","))
                                                    .withCarriers(aCarriersDto()
                                                                      .withCarrierId(1050)
                                                                      .withName("easyJet"))
                                                  .build();
    // @formatter:on

    final String json = readFileToString(
        new File("src/test/resources/junit/cheapest-quotes-success-response.json"));

    final BrowseQuotesResponseAPIDto actualDto =
        mapper.readValue(json, BrowseQuotesResponseAPIDto.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }

  @Test
  public void shouldUnmarshalCheapestQuotesErrorResponse()
      throws JsonParseException, JsonMappingException, IOException {

    final BrowseQuotesResponseAPIDto expectedDto = aBrowseQuotesResponseAPIDto()
        .withValidationErrors(aValidationError().withDefaultValues()).build();


    final String json =
        readFileToString(new File("src/test/resources/junit/cheapest-quotes-error-response.json"));

    final BrowseQuotesResponseAPIDto actualDto =
        mapper.readValue(json, BrowseQuotesResponseAPIDto.class);

    assertEquals("Dto did not match expected input", expectedDto, actualDto);

  }
}
