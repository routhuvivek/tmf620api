package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CharacteristicValueSpecification;
import io.swagger.model.ProductSpecificationCharacteristicRelationship;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) &#x3D; 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.
 */
@ApiModel(description = "A characteristic quality or distinctive feature of a ProductSpecification.  The characteristic can be take on a discrete value, such as color, can take on a range of values, (for example, sensitivity of 100-240 mV), or can be derived from a formula (for example, usage time (hrs) = 30 - talk time *3). Certain characteristics, such as color, may be configured during the ordering or some other process.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
public class ProductSpecificationCharacteristic   {
  @Id
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("configurable")
  private Boolean configurable = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("extensible")
  private Boolean extensible = null;

  @JsonProperty("isUnique")
  private Boolean isUnique = null;

  @JsonProperty("maxCardinality")
  private Integer maxCardinality = null;

  @JsonProperty("minCardinality")
  private Integer minCardinality = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("regex")
  private String regex = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("productSpecCharRel")
  @Valid
  @OneToMany(targetEntity = ProductSpecificationCharacteristicRelationship.class,cascade = CascadeType.ALL)
  private List<ProductSpecificationCharacteristicRelationship> productSpecCharRel = null;

  @JsonProperty("productSpecCharValue")
  @Valid
  @OneToMany(targetEntity = CharacteristicValueSpecification.class, cascade = CascadeType.ALL)
  private List<CharacteristicValueSpecification> productSpecCharValue = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@valueSchemaLocation")
  private String valueSchemaLocation = null;

  public ProductSpecificationCharacteristic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the characteristic
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID for the characteristic")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecificationCharacteristic configurable(Boolean configurable) {
    this.configurable = configurable;
    return this;
  }

  /**
   * If true, the Boolean indicates that the target Characteristic is configurable
   * @return configurable
  **/
  @ApiModelProperty(value = "If true, the Boolean indicates that the target Characteristic is configurable")


  public Boolean isConfigurable() {
    return configurable;
  }

  public void setConfigurable(Boolean configurable) {
    this.configurable = configurable;
  }

  public ProductSpecificationCharacteristic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains the CharacteristicSpecification.
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains the CharacteristicSpecification.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSpecificationCharacteristic extensible(Boolean extensible) {
    this.extensible = extensible;
    return this;
  }

  /**
   * An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.
   * @return extensible
  **/
  @ApiModelProperty(value = "An indicator that specifies that the values for the characteristic can be extended by adding new values when instantiating a characteristic for a resource.")


  public Boolean isExtensible() {
    return extensible;
  }

  public void setExtensible(Boolean extensible) {
    this.extensible = extensible;
  }

  public ProductSpecificationCharacteristic isUnique(Boolean isUnique) {
    this.isUnique = isUnique;
    return this;
  }

  /**
   * An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"
   * @return isUnique
  **/
  @ApiModelProperty(value = "An indicator that specifies if a value is unique for the specification. Possible values are; \"unique while value is in effect\" and \"unique whether value is in effect or not\"")


  public Boolean isIsUnique() {
    return isUnique;
  }

  public void setIsUnique(Boolean isUnique) {
    this.isUnique = isUnique;
  }

  public ProductSpecificationCharacteristic maxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
    return this;
  }

  /**
   * The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.
   * @return maxCardinality
  **/
  @ApiModelProperty(value = "The maximum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where five is the value for the maxCardinality.")


  public Integer getMaxCardinality() {
    return maxCardinality;
  }

  public void setMaxCardinality(Integer maxCardinality) {
    this.maxCardinality = maxCardinality;
  }

  public ProductSpecificationCharacteristic minCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
    return this;
  }

  /**
   * The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.
   * @return minCardinality
  **/
  @ApiModelProperty(value = "The minimum number of instances a CharacteristicValue can take on. For example, zero to five phone numbers in a group calling plan, where zero is the value for the minCardinality.")


  public Integer getMinCardinality() {
    return minCardinality;
  }

  public void setMinCardinality(Integer minCardinality) {
    this.minCardinality = minCardinality;
  }

  public ProductSpecificationCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.
   * @return name
  **/
  @ApiModelProperty(value = "A word, term, or phrase by which this characteristic specification is known and distinguished from other characteristic specifications.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationCharacteristic regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * A rule or principle represented in regular expression used to derive the value of a characteristic value.
   * @return regex
  **/
  @ApiModelProperty(value = "A rule or principle represented in regular expression used to derive the value of a characteristic value.")


  public String getRegex() {
    return regex;
  }

  public void setRegex(String regex) {
    this.regex = regex;
  }

  public ProductSpecificationCharacteristic valueType(String valueType) {
    this.valueType = valueType;
    return this;
  }

  /**
   * A kind of value that the characteristic can take on, such as numeric, text and so forth
   * @return valueType
  **/
  @ApiModelProperty(value = "A kind of value that the characteristic can take on, such as numeric, text and so forth")


  public String getValueType() {
    return valueType;
  }

  public void setValueType(String valueType) {
    this.valueType = valueType;
  }

  public ProductSpecificationCharacteristic productSpecCharRel(List<ProductSpecificationCharacteristicRelationship> productSpecCharRel) {
    this.productSpecCharRel = productSpecCharRel;
    return this;
  }

  public ProductSpecificationCharacteristic addProductSpecCharRelationshipItem(ProductSpecificationCharacteristicRelationship productSpecCharRelItem) {
    if (this.productSpecCharRel == null) {
      this.productSpecCharRel = new ArrayList<ProductSpecificationCharacteristicRelationship>();
    }
    this.productSpecCharRel.add(productSpecCharRelItem);
    return this;
  }

  /**
   * An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.
   * @return productSpecCharRel
  **/
  @ApiModelProperty(value = "An aggregation, migration, substitution, dependency or exclusivity relationship between/among Specification Characteristics.")

  @Valid

  public List<ProductSpecificationCharacteristicRelationship> getProductSpecCharRelationship() {
    return productSpecCharRel;
  }

  public void setProductSpecCharRelationship(List<ProductSpecificationCharacteristicRelationship> productSpecCharRel) {
    this.productSpecCharRel = productSpecCharRel;
  }

  public ProductSpecificationCharacteristic productSpecCharValue(List<CharacteristicValueSpecification> productSpecCharValue) {
    this.productSpecCharValue = productSpecCharValue;
    return this;
  }

  public ProductSpecificationCharacteristic addproductSpecCharValueItem(CharacteristicValueSpecification productSpecCharValueItem) {
    if (this.productSpecCharValue == null) {
      this.productSpecCharValue = new ArrayList<CharacteristicValueSpecification>();
    }
    this.productSpecCharValue.add(productSpecCharValueItem);
    return this;
  }

  /**
   * A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.
   * @return productSpecCharValue
  **/
  @ApiModelProperty(value = "A ProductSpecificationCharacteristicValue object is used to define a set of attributes, each of which can be assigned to a corresponding set of attributes in a ProductSpecificationCharacteristic object. The values of the attributes in the ProductSpecificationCharacteristicValue object describe the values of the attributes that a corresponding ProductSpecificationCharacteristic object can take on.")

  @Valid

  public List<CharacteristicValueSpecification> getproductSpecCharValue() {
    return productSpecCharValue;
  }

  public void setproductSpecCharValue(List<CharacteristicValueSpecification> productSpecCharValue) {
    this.productSpecCharValue = productSpecCharValue;
  }

  public ProductSpecificationCharacteristic validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period of time for which a characteristic is applicable.
   * @return validFor
  **/
  @ApiModelProperty(value = "The period of time for which a characteristic is applicable.")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductSpecificationCharacteristic baseType(String baseType) {
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

  public ProductSpecificationCharacteristic schemaLocation(String schemaLocation) {
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

  public ProductSpecificationCharacteristic type(String type) {
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

  public ProductSpecificationCharacteristic valueSchemaLocation(String valueSchemaLocation) {
    this.valueSchemaLocation = valueSchemaLocation;
    return this;
  }

  /**
   * This (optional) field provides a link to the schema describing the value type.
   * @return valueSchemaLocation
  **/
  @ApiModelProperty(value = "This (optional) field provides a link to the schema describing the value type.")


  public String getValueSchemaLocation() {
    return valueSchemaLocation;
  }

  public void setValueSchemaLocation(String valueSchemaLocation) {
    this.valueSchemaLocation = valueSchemaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationCharacteristic productSpecificationCharacteristic = (ProductSpecificationCharacteristic) o;
    return Objects.equals(this.id, productSpecificationCharacteristic.id) &&
        Objects.equals(this.configurable, productSpecificationCharacteristic.configurable) &&
        Objects.equals(this.description, productSpecificationCharacteristic.description) &&
        Objects.equals(this.extensible, productSpecificationCharacteristic.extensible) &&
        Objects.equals(this.isUnique, productSpecificationCharacteristic.isUnique) &&
        Objects.equals(this.maxCardinality, productSpecificationCharacteristic.maxCardinality) &&
        Objects.equals(this.minCardinality, productSpecificationCharacteristic.minCardinality) &&
        Objects.equals(this.name, productSpecificationCharacteristic.name) &&
        Objects.equals(this.regex, productSpecificationCharacteristic.regex) &&
        Objects.equals(this.valueType, productSpecificationCharacteristic.valueType) &&
        Objects.equals(this.productSpecCharRel, productSpecificationCharacteristic.productSpecCharRel) &&
        Objects.equals(this.productSpecCharValue, productSpecificationCharacteristic.productSpecCharValue) &&
        Objects.equals(this.validFor, productSpecificationCharacteristic.validFor) &&
        Objects.equals(this.baseType, productSpecificationCharacteristic.baseType) &&
        Objects.equals(this.schemaLocation, productSpecificationCharacteristic.schemaLocation) &&
        Objects.equals(this.type, productSpecificationCharacteristic.type) &&
        Objects.equals(this.valueSchemaLocation, productSpecificationCharacteristic.valueSchemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, configurable, description, extensible, isUnique, maxCardinality, minCardinality, name, regex, valueType, productSpecCharRel, productSpecCharValue, validFor, baseType, schemaLocation, type, valueSchemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristic {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    configurable: ").append(toIndentedString(configurable)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extensible: ").append(toIndentedString(extensible)).append("\n");
    sb.append("    isUnique: ").append(toIndentedString(isUnique)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    productSpecCharRel: ").append(toIndentedString(productSpecCharRel)).append("\n");
    sb.append("    productSpecCharValue: ").append(toIndentedString(productSpecCharValue)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueSchemaLocation: ").append(toIndentedString(valueSchemaLocation)).append("\n");
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

