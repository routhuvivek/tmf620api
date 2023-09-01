package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Money;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A tax item is created for each tax rate and tax type used in the bill.
 */
@ApiModel(description = "A tax item is created for each tax rate and tax type used in the bill.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
public class TaxItem   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("taxCategory")
  private String taxCategory = null;

  @JsonProperty("taxRate")
  private Float taxRate = null;

  @JsonProperty("taxAmount")
  @OneToOne(targetEntity = Money.class, cascade = CascadeType.ALL)
  private Money taxAmount = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public TaxItem id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * unique identifier
   * @return id
  **/
  @ApiModelProperty(value = "unique identifier")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public TaxItem href(String href) {
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

  public TaxItem taxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
    return this;
  }

  /**
   * Tax category
   * @return taxCategory
  **/
  @ApiModelProperty(value = "Tax category")


  public String getTaxCategory() {
    return taxCategory;
  }

  public void setTaxCategory(String taxCategory) {
    this.taxCategory = taxCategory;
  }

  public TaxItem taxRate(Float taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Applied rate of the tax
   * @return taxRate
  **/
  @ApiModelProperty(value = "Applied rate of the tax")


  public Float getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Float taxRate) {
    this.taxRate = taxRate;
  }

  public TaxItem taxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

  /**
   * Amount of tax expressed in the given currency
   * @return taxAmount
  **/
  @ApiModelProperty(value = "Amount of tax expressed in the given currency")

  @Valid

  public Money getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Money taxAmount) {
    this.taxAmount = taxAmount;
  }

  public TaxItem baseType(String baseType) {
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

  public TaxItem schemaLocation(String schemaLocation) {
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

  public TaxItem type(String type) {
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
    TaxItem taxItem = (TaxItem) o;
    return Objects.equals(this.id, taxItem.id) &&
        Objects.equals(this.href, taxItem.href) &&
        Objects.equals(this.taxCategory, taxItem.taxCategory) &&
        Objects.equals(this.taxRate, taxItem.taxRate) &&
        Objects.equals(this.taxAmount, taxItem.taxAmount) &&
        Objects.equals(this.baseType, taxItem.baseType) &&
        Objects.equals(this.schemaLocation, taxItem.schemaLocation) &&
        Objects.equals(this.type, taxItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, taxCategory, taxRate, taxAmount, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    taxCategory: ").append(toIndentedString(taxCategory)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
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

