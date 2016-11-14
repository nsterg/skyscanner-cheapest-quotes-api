package com.flymatcher.skyscanner.cheapestquotes;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;
import static org.apache.commons.lang.builder.ToStringBuilder.reflectionToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class ValidationErrorDto {

  @JsonPropertyOrder({"ParameterName", "ParameterValue", "Message"})

  @JsonProperty("ParameterName")
  private String parameterName;

  @JsonProperty("ParameterValue")
  private String parameterValue;

  @JsonProperty("Message")
  private String message;

  @JsonProperty("ValidValues")
  private String validValues;


  public String getParameterName() {
    return parameterName;
  }

  public void setParameterName(final String parameterName) {
    this.parameterName = parameterName;
  }

  public String getParameterValue() {
    return parameterValue;
  }

  public void setParameterValue(final String parameterValue) {
    this.parameterValue = parameterValue;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(final String message) {
    this.message = message;
  }

  public String getValidValues() {
    return validValues;
  }

  public void setValidValues(final String validValues) {
    this.validValues = validValues;
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
