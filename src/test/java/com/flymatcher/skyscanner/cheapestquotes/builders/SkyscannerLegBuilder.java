package com.flymatcher.skyscanner.cheapestquotes.builders;

import java.util.List;

import com.flymatcher.skyscanner.cheapestquotes.SkyscannerLeg;


public class SkyscannerLegBuilder {

  private int destinationId;
  private List<Integer> carrierIds;
  private int originId;
  private String departureDate;

  private SkyscannerLegBuilder() {}

  public static SkyscannerLegBuilder aSkyscannerLeg() {
    return new SkyscannerLegBuilder();
  }

  public SkyscannerLeg build() {
    final SkyscannerLeg skyscannerLeg = new SkyscannerLeg();

    skyscannerLeg.setDestinationId(destinationId);
    skyscannerLeg.setCarrierIds(carrierIds);
    skyscannerLeg.setOriginId(originId);
    skyscannerLeg.setDepartureDate(departureDate);

    return skyscannerLeg;
  }

  public SkyscannerLegBuilder withDestinationId(final int destinationId) {
    this.destinationId = destinationId;
    return this;
  }

  public SkyscannerLegBuilder withCarrierIds(final List<Integer> carrierIds) {
    this.carrierIds = carrierIds;
    return this;
  }

  public SkyscannerLegBuilder withOriginId(final int originId) {
    this.originId = originId;
    return this;
  }

  public SkyscannerLegBuilder withDepartureDate(final String departureDate) {
    this.departureDate = departureDate;
    return this;
  }

}
