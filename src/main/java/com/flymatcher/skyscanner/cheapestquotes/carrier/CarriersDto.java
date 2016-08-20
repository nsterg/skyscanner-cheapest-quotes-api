package com.flymatcher.skyscanner.cheapestquotes.carrier;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class CarriersDto {

  @JsonPropertyOrder({"CarrierId", "Name"})

  @JsonProperty("Name")
  private String name;

  @JsonProperty("CarrierId")
  private int carrierId;

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public int getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(final int carrierId) {
    this.carrierId = carrierId;
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
