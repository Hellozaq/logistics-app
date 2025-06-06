package com.example.model;

import java.net.URI;
import java.util.Objects;
import com.example.model.AddressRequest;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateOrderRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-05-04T15:16:19.844067600+05:30[Asia/Calcutta]", comments = "Generator version: 7.9.0")
public class UpdateOrderRequest {

  private AddressRequest deliveryAddress;

  public UpdateOrderRequest deliveryAddress(AddressRequest deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

  /**
   * Get deliveryAddress
   * @return deliveryAddress
   */
  @Valid 
  @Schema(name = "deliveryAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("deliveryAddress")
  public AddressRequest getDeliveryAddress() {
    return deliveryAddress;
  }

  public void setDeliveryAddress(AddressRequest deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrderRequest updateOrderRequest = (UpdateOrderRequest) o;
    return Objects.equals(this.deliveryAddress, updateOrderRequest.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOrderRequest {\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

