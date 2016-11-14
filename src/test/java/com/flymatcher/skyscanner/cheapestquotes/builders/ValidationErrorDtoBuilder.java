package com.flymatcher.skyscanner.cheapestquotes.builders;

import com.flymatcher.skyscanner.cheapestquotes.ValidationErrorDto;

public class ValidationErrorDtoBuilder {


  private String parameterName;
  private String parameterValue;
  private String message;
  private String validValues;

  private ValidationErrorDtoBuilder() {}

  public static ValidationErrorDtoBuilder aValidationError() {
    return new ValidationErrorDtoBuilder();
  }

  public ValidationErrorDto build() {
    final ValidationErrorDto validationErrorDto = new ValidationErrorDto();

    validationErrorDto.setMessage(message);
    validationErrorDto.setParameterName(parameterName);
    validationErrorDto.setParameterValue(parameterValue);
    validationErrorDto.setValidValues(validValues);

    return validationErrorDto;
  }

  public ValidationErrorDtoBuilder withParameterName(final String parameterName) {
    this.parameterName = parameterName;
    return this;
  }

  public ValidationErrorDtoBuilder withParameterValue(final String parameterValue) {
    this.parameterValue = parameterValue;
    return this;
  }

  public ValidationErrorDtoBuilder withMessage(final String message) {
    this.message = message;
    return this;
  }

  public ValidationErrorDtoBuilder withValidValues(final String validValues) {
    this.validValues = validValues;
    return this;
  }

  public ValidationErrorDtoBuilder withDefaultValues() {
    this.parameterName = "Origin and Destination must be valid codes";
    this.parameterValue = "Your inputs could not be parsed, please refer to documentation";
    this.message = "Invalid Origin and Destination combination";
    this.validValues = "(City/Airport to Country),(Country to City/Airport)";

    return this;
  }

}
