package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ConstraintRef;
import io.swagger.model.POPAlteration;
import io.swagger.model.ProductPriceValue;
import io.swagger.model.Quantity;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the product offering price and not to this ReforValue structure
 */
@ApiModel(description = "A new product offering price being created by value or a reference to an existing product offering price that alreasy created. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product offering price and not to this ReforValue structure")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
public class ProductOfferingPriceRefOrValue   {
  @Id
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("priceType")
  private String priceType = null;

  @JsonProperty("recurringChargePeriod")
  private String recurringChargePeriod = null;

  @JsonProperty("recurringChargePeriodLength")
  private Integer recurringChargePeriodLength = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("constraint")
  @Valid
  @OneToMany(targetEntity = ConstraintRef.class, cascade = CascadeType.ALL)
  private List<ConstraintRef> constraint = null;

  @JsonProperty("price")
  @OneToOne(targetEntity = ProductPriceValue.class, cascade = CascadeType.ALL)
  private ProductPriceValue price = null;

  @JsonProperty("priceAlteration")
  @Valid
  @OneToMany(targetEntity = POPAlteration.class, cascade = CascadeType.ALL)
  private List<POPAlteration> priceAlteration = null;

  @JsonProperty("unitOfMeasure")
  @OneToOne(targetEntity = Quantity.class, cascade = CascadeType.ALL)
  private Quantity unitOfMeasure = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public ProductOfferingPriceRefOrValue id(String id) {
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

  public ProductOfferingPriceRefOrValue href(String href) {
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

  public ProductOfferingPriceRefOrValue description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productOfferingPrice
   * @return description
  **/
  @ApiModelProperty(value = "Description of the productOfferingPrice")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOfferingPriceRefOrValue lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * the last update time of this ProductOfferingPrice
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "the last update time of this ProductOfferingPrice")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductOfferingPriceRefOrValue lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * the lifecycle status of this ProductOfferingPrice
   * @return lifecycleStatus
  **/
  @ApiModelProperty(value = "the lifecycle status of this ProductOfferingPrice")


  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public ProductOfferingPriceRefOrValue name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productOfferingPrice
   * @return name
  **/
  @ApiModelProperty(value = "Name of the productOfferingPrice")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOfferingPriceRefOrValue priceType(String priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * A category that describes the price charge, such as recurring, penalty, One time fee and so forth.
   * @return priceType
  **/
  @ApiModelProperty(value = "A category that describes the price charge, such as recurring, penalty, One time fee and so forth.")


  public String getPriceType() {
    return priceType;
  }

  public void setPriceType(String priceType) {
    this.priceType = priceType;
  }

  public ProductOfferingPriceRefOrValue recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * The period type to repeat the application of the price Could be month, week...
   * @return recurringChargePeriod
  **/
  @ApiModelProperty(value = "The period type to repeat the application of the price Could be month, week...")


  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public ProductOfferingPriceRefOrValue recurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
    return this;
  }

  /**
   * the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable
   * @return recurringChargePeriodLength
  **/
  @ApiModelProperty(value = "the period of the recurring charge:  1, 2, ... .It sets to zero if it is not applicable")


  public Integer getRecurringChargePeriodLength() {
    return recurringChargePeriodLength;
  }

  public void setRecurringChargePeriodLength(Integer recurringChargePeriodLength) {
    this.recurringChargePeriodLength = recurringChargePeriodLength;
  }

  public ProductOfferingPriceRefOrValue version(String version) {
    this.version = version;
    return this;
  }

  /**
   * ProductOffering version
   * @return version
  **/
  @ApiModelProperty(value = "ProductOffering version")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductOfferingPriceRefOrValue constraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
    return this;
  }

  public ProductOfferingPriceRefOrValue addConstraintItem(ConstraintRef constraintItem) {
    if (this.constraint == null) {
      this.constraint = new ArrayList<ConstraintRef>();
    }
    this.constraint.add(constraintItem);
    return this;
  }

  /**
   * The Constraint resource represents a policy/rule applied to ProductOfferingPrice.
   * @return constraint
  **/
  @ApiModelProperty(value = "The Constraint resource represents a policy/rule applied to ProductOfferingPrice.")

  @Valid

  public List<ConstraintRef> getConstraint() {
    return constraint;
  }

  public void setConstraint(List<ConstraintRef> constraint) {
    this.constraint = constraint;
  }

  public ProductOfferingPriceRefOrValue price(ProductPriceValue price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ProductPriceValue getPrice() {
    return price;
  }

  public void setPrice(ProductPriceValue price) {
    this.price = price;
  }

  public ProductOfferingPriceRefOrValue priceAlteration(List<POPAlteration> priceAlteration) {
    this.priceAlteration = priceAlteration;
    return this;
  }

  public ProductOfferingPriceRefOrValue addPriceAlterationItem(POPAlteration priceAlterationItem) {
    if (this.priceAlteration == null) {
      this.priceAlteration = new ArrayList<POPAlteration>();
    }
    this.priceAlteration.add(priceAlterationItem);
    return this;
  }

  /**
   * Get priceAlteration
   * @return priceAlteration
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<POPAlteration> getPriceAlteration() {
    return priceAlteration;
  }

  public void setPriceAlteration(List<POPAlteration> priceAlteration) {
    this.priceAlteration = priceAlteration;
  }

  public ProductOfferingPriceRefOrValue unitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * A number and unit representing denominator of a rate. For example, for a data charge rate of $2 per 5 GB usage, the amount of unitOfMeasure will be 5 with units as GB.
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "A number and unit representing denominator of a rate. For example, for a data charge rate of $2 per 5 GB usage, the amount of unitOfMeasure will be 5 with units as GB.")

  @Valid

  public Quantity getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(Quantity unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public ProductOfferingPriceRefOrValue validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the productOfferingPrice is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which the productOfferingPrice is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductOfferingPriceRefOrValue baseType(String baseType) {
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

  public ProductOfferingPriceRefOrValue schemaLocation(String schemaLocation) {
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

  public ProductOfferingPriceRefOrValue type(String type) {
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

  public ProductOfferingPriceRefOrValue referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

  /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")


  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOfferingPriceRefOrValue productOfferingPriceRefOrValue = (ProductOfferingPriceRefOrValue) o;
    return Objects.equals(this.id, productOfferingPriceRefOrValue.id) &&
        Objects.equals(this.href, productOfferingPriceRefOrValue.href) &&
        Objects.equals(this.description, productOfferingPriceRefOrValue.description) &&
        Objects.equals(this.lastUpdate, productOfferingPriceRefOrValue.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOfferingPriceRefOrValue.lifecycleStatus) &&
        Objects.equals(this.name, productOfferingPriceRefOrValue.name) &&
        Objects.equals(this.priceType, productOfferingPriceRefOrValue.priceType) &&
        Objects.equals(this.recurringChargePeriod, productOfferingPriceRefOrValue.recurringChargePeriod) &&
        Objects.equals(this.recurringChargePeriodLength, productOfferingPriceRefOrValue.recurringChargePeriodLength) &&
        Objects.equals(this.version, productOfferingPriceRefOrValue.version) &&
        Objects.equals(this.constraint, productOfferingPriceRefOrValue.constraint) &&
        Objects.equals(this.price, productOfferingPriceRefOrValue.price) &&
        Objects.equals(this.priceAlteration, productOfferingPriceRefOrValue.priceAlteration) &&
        Objects.equals(this.unitOfMeasure, productOfferingPriceRefOrValue.unitOfMeasure) &&
        Objects.equals(this.validFor, productOfferingPriceRefOrValue.validFor) &&
        Objects.equals(this.baseType, productOfferingPriceRefOrValue.baseType) &&
        Objects.equals(this.schemaLocation, productOfferingPriceRefOrValue.schemaLocation) &&
        Objects.equals(this.type, productOfferingPriceRefOrValue.type) &&
        Objects.equals(this.referredType, productOfferingPriceRefOrValue.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, lastUpdate, lifecycleStatus, name, priceType, recurringChargePeriod, recurringChargePeriodLength, version, constraint, price, priceAlteration, unitOfMeasure, validFor, baseType, schemaLocation, type, referredType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOfferingPriceRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    recurringChargePeriodLength: ").append(toIndentedString(recurringChargePeriodLength)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    constraint: ").append(toIndentedString(constraint)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

