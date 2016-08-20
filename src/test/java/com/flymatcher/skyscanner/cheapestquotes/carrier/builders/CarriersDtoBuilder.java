package com.flymatcher.skyscanner.cheapestquotes.carrier.builders;

import com.flymatcher.skyscanner.cheapestquotes.carrier.CarriersDto;


public class CarriersDtoBuilder {

  private String name;
  private int carrierId;

  private CarriersDtoBuilder() {}

  public static CarriersDtoBuilder aCarriersDto() {
    return new CarriersDtoBuilder();
  }

  public CarriersDto build() {
    final CarriersDto carriersDto = new CarriersDto();

    carriersDto.setName(name);
    carriersDto.setCarrierId(carrierId);

    return carriersDto;
  }

  public CarriersDtoBuilder withName(final String name) {
    this.name = name;
    return this;
  }

  public CarriersDtoBuilder withCarrierId(final int carrierId) {
    this.carrierId = carrierId;
    return this;
  }

}
