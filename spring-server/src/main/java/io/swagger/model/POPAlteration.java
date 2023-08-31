package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Duration;
import io.swagger.model.ProductPriceValue;
import io.swagger.model.Quantity;
import io.swagger.model.TimePeriod;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Is an amount, usually of money, that modifies the price charged for an order item.
 */
@ApiModel(description = "Is an amount, usually of money, that modifies the price charged for an order item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
public class POPAlteration   {
  @Id
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priceType")
  private String priceType = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("recurringChargePeriod")
  private String recurringChargePeriod = null;

  @JsonProperty("applicationDuration")
  @OneToOne(targetEntity = Duration.class, cascade = CascadeType.ALL)
  private Duration applicationDuration = null;

  @JsonProperty("price")
  @OneToOne(targetEntity = ProductPriceValue.class, cascade = CascadeType.ALL)
  private ProductPriceValue price = null;

  @JsonProperty("unitOfMeasure")
  @OneToOne(targetEntity = Quantity.class, cascade = CascadeType.ALL)
  private Quantity unitOfMeasure = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class,cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public POPAlteration id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public POPAlteration href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink reference
   * @return href
  **/
  @ApiModelProperty(value = "Hyperlink reference")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public POPAlteration description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail the semantics of this order item price alteration
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price alteration")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public POPAlteration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to this price alteration
   * @return name
  **/
  @ApiModelProperty(value = "Name given to this price alteration")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public POPAlteration priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price such as recurring, one time and usage.
   * @return priceType
  **/
  @ApiModelProperty(required = true, value = "A category that describes the price such as recurring, one time and usage.")
  @NotNull


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public POPAlteration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Priority level for applying this alteration among all the defined alterations on the order item price
   * @return priority
  **/
  @ApiModelProperty(value = "Priority level for applying this alteration among all the defined alterations on the order item price")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public POPAlteration recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * Could be month, week...
   * @return recurringChargePeriod
  **/
  @ApiModelProperty(value = "Could be month, week...")


  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public POPAlteration applicationDuration(Duration applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

  /**
   * The period for which the productOfferingPriceAlteration is applicable
   * @return applicationDuration
  **/
  @ApiModelProperty(value = "The period for which the productOfferingPriceAlteration is applicable")

  @Valid

  public Duration getApplicationDuration() {
    return applicationDuration;
  }

  public void setApplicationDuration(Duration applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  public POPAlteration price(ProductPriceValue price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ProductPriceValue getPrice() {
    return price;
  }

  public void setPrice(ProductPriceValue price) {
    this.price = price;
  }

  public POPAlteration unitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * A number and unit representing denominator of an alteration rate. For example, for a data discount rate of $1 per 20 GB usage, the amount of unitOfMeasure will be 20 with units as GB.
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "A number and unit representing denominator of an alteration rate. For example, for a data discount rate of $1 per 20 GB usage, the amount of unitOfMeasure will be 20 with units as GB.")

  @Valid

  public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public POPAlteration validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which this productOfferingPriceAlteration is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which this productOfferingPriceAlteration is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public POPAlteration baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")


  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public POPAlteration schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public POPAlteration type(String type) {
    this.type = type;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class Extensible name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class Extensible name")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    POPAlteration poPAlteration = (POPAlteration) o;
    return Objects.equals(this.id, poPAlteration.id) &&
        Objects.equals(this.href, poPAlteration.href) &&
        Objects.equals(this.description, poPAlteration.description) &&
        Objects.equals(this.name, poPAlteration.name) &&
        Objects.equals(this.priceType, poPAlteration.priceType) &&
        Objects.equals(this.priority, poPAlteration.priority) &&
        Objects.equals(this.recurringChargePeriod, poPAlteration.recurringChargePeriod) &&
        Objects.equals(this.applicationDuration, poPAlteration.applicationDuration) &&
        Objects.equals(this.price, poPAlteration.price) &&
        Objects.equals(this.unitOfMeasure, poPAlteration.unitOfMeasure) &&
        Objects.equals(this.validFor, poPAlteration.validFor) &&
        Objects.equals(this.baseType, poPAlteration.baseType) &&
        Objects.equals(this.schemaLocation, poPAlteration.schemaLocation) &&
        Objects.equals(this.type, poPAlteration.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, priceType, priority, recurringChargePeriod, applicationDuration, price, unitOfMeasure, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class POPAlteration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

