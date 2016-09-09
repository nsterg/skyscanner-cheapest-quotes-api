package com.flymatcher.skyscanner.cheapestquotes;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class QuoteDto {

  @JsonPropertyOrder({"QuoteId", "Direct", "QuoteDateTime", "OutboundLeg", "InboundLeg",
      "MinPrice"})

  @JsonProperty("QuoteId")
  private int quoteId;

  @JsonProperty("Direct")
  private boolean direct;

  @JsonProperty("QuoteDateTime")
  private String quoteDateTime;

  @JsonProperty("OutboundLeg")
  private OutboundLeg outboundLeg;

  @JsonProperty("InboundLeg")
  private OutboundLeg inboundLeg;

  @JsonProperty("MinPrice")
  private double minPrice;

  public int getQuoteId() {
    return quoteId;
  }

  public void setQuoteId(final int quoteId) {
    this.quoteId = quoteId;
  }

  public boolean getDirect() {
    return direct;
  }

  public void setDirect(final boolean direct) {
    this.direct = direct;
  }

  public String getQuoteDateTime() {
    return quoteDateTime;
  }

  public void setQuoteDateTime(final String quoteDateTime) {
    this.quoteDateTime = quoteDateTime;
  }

  public OutboundLeg getOutboundLeg() {
    return outboundLeg;
  }

  public void setInboundLeg(final OutboundLeg inboundLeg) {
    this.inboundLeg = inboundLeg;
  }

  public OutboundLeg getInboundLeg() {
    return inboundLeg;
  }

  public void setOutboundLeg(final OutboundLeg outboundLeg) {
    this.outboundLeg = outboundLeg;
  }

  public double getMinPrice() {
    return minPrice;
  }

  public void setMinPrice(final double minPrice) {
    this.minPrice = minPrice;
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
