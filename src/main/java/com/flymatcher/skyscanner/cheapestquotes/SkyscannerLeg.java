package com.flymatcher.skyscanner.cheapestquotes;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class SkyscannerLeg {

  @JsonPropertyOrder({"DestinationId", "CarrierIds", "OriginId", "DepartureDate"})

  @JsonProperty("DestinationId")
  private int destinationId;

  @JsonProperty("CarrierIds")
  private List<Integer> carrierIds;

  @JsonProperty("OriginId")
  private int originId;

  @JsonProperty("DepartureDate")
  private String departureDate;

  public int getDestinationId() {
    return destinationId;
  }

  public void setDestinationId(final int destinationId) {
    this.destinationId = destinationId;
  }

  public List<Integer> getCarrierIds() {
    return carrierIds;
  }

  public void setCarrierIds(final List<Integer> carrierIds) {
    this.carrierIds = carrierIds;
  }

  public int getOriginId() {
    return originId;
  }

  public void setOriginId(final int originId) {
    this.originId = originId;
  }

  public String getDepartureDate() {
    return departureDate;
  }

  public void setDepartureDate(final String departureDate) {
    this.departureDate = departureDate;
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
