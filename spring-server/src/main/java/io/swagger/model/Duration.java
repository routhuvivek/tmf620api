package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A time interval in a given unit of time
 */
@ApiModel(description = "A time interval in a given unit of time")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
public class Duration   {
  @Id
  @JsonProperty("amount")
  private Integer amount = null;

  @JsonProperty("units")
  private String units = null;

  public Duration amount(Integer amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Time interval (number of seconds, minutes, hours, etc.)
   * @return amount
  **/
  @ApiModelProperty(value = "Time interval (number of seconds, minutes, hours, etc.)")


  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public Duration units(String units) {
    this.units = units;
    return this;
  }

  /**
   * Unit of time (seconds, minutes, hours, etc.)
   * @return units
  **/
  @ApiModelProperty(value = "Unit of time (seconds, minutes, hours, etc.)")


  public String getUnits() {
    return units;
  }

  public void setUnits(String units) {
    this.units = units;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Duration duration = (Duration) o;
    return Objects.equals(this.amount, duration.amount) &&
        Objects.equals(this.units, duration.units);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, units);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Duration {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    units: ").append(toIndentedString(units)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

