package com.flymatcher.skyscanner.cheapestquotes.builders;

import java.util.List;

import com.flymatcher.skyscanner.cheapestquotes.OutboundLeg;


public class OutboundLegBuilder {

  private int destinationId;
  private List<Integer> carrierIds;
  private int originId;
  private String departureDate;

  private OutboundLegBuilder() {}

  public static OutboundLegBuilder aOutboundLeg() {
    return new OutboundLegBuilder();
  }

  public OutboundLeg build() {
    final OutboundLeg outboundLeg = new OutboundLeg();

    outboundLeg.setDestinationId(destinationId);
    outboundLeg.setCarrierIds(carrierIds);
    outboundLeg.setOriginId(originId);
    outboundLeg.setDepartureDate(departureDate);

    return outboundLeg;
  }

  public OutboundLegBuilder withDestinationId(final int destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public OutboundLegBuilder withCarrierIds(final List<Integer> carrierIds) {
    this.carrierIds = carrierIds;
    return this;
  }

  public OutboundLegBuilder withOriginId(final int originId) {
    this.originId = originId;
    return this;
  }

  public OutboundLegBuilder withDepartureDate(final String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

}
