package com.flymatcher.skyscanner.cheapestquotes.builders;

import com.flymatcher.skyscanner.cheapestquotes.SkyscannerLeg;
import com.flymatcher.skyscanner.cheapestquotes.QuoteDto;


public class QuoteDtoBuilder {

  private int quoteId;
  private boolean direct;
  private String quoteDateTime;
  private SkyscannerLeg outboundLeg;
  private SkyscannerLeg inboundLeg;
  private double minPrice;

  private QuoteDtoBuilder() {}

  public static QuoteDtoBuilder aQuoteDto() {
    return new QuoteDtoBuilder();
  }

  public QuoteDto build() {
    final QuoteDto quoteDto = new QuoteDto();

    quoteDto.setQuoteId(quoteId);
    quoteDto.setDirect(direct);
    quoteDto.setQuoteDateTime(quoteDateTime);
    quoteDto.setOutboundLeg(outboundLeg);
    quoteDto.setInboundLeg(inboundLeg);
    quoteDto.setMinPrice(minPrice);

    return quoteDto;
  }

  public QuoteDtoBuilder withQuoteId(final int quoteId) {
    this.quoteId = quoteId;
    return this;
  }

  public QuoteDtoBuilder withDirect(final boolean direct) {
    this.direct = direct;
    return this;
  }

  public QuoteDtoBuilder withQuoteDateTime(final String quoteDateTime) {
    this.quoteDateTime = quoteDateTime;
    return this;
  }

  public QuoteDtoBuilder withOutboundLeg(final SkyscannerLegBuilder builder) {
    this.outboundLeg = builder.build();
    return this;
  }

  public QuoteDtoBuilder withInboundLeg(final SkyscannerLegBuilder builder) {
    this.inboundLeg = builder.build();
    return this;
  }

  public QuoteDtoBuilder withMinPrice(final double minPrice) {
    this.minPrice = minPrice;
    return this;
  }

}
