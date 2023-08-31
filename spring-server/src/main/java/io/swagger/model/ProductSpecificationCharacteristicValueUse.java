package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CharacteristicValueSpecification;
import io.swagger.model.ProductSpecificationRef;
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
 * A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic &#39;Color&#39; might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in &#39;ProductSpecificationCharacteristicValueUse&#39; is a strict subset of the list of values as defined in the corresponding product specification characteristics.
 */
@ApiModel(description = "A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
@Table(name = "ProdSpecCharValUse")
public class ProductSpecificationCharacteristicValueUse   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("maxCardinality")
  private Integer maxCardinality = null;

  @JsonProperty("minCardinality")
  private Integer minCardinality = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("valueType")
  private String valueType = null;

  @JsonProperty("productSpecCharValue")
  @Valid
  @OneToMany(targetEntity = CharacteristicValueSpecification.class, cascade = CascadeType.ALL)
  private List<CharacteristicValueSpecification> productSpecCharValue = null;

  @JsonProperty("productSpecification")
  @OneToOne(targetEntity = ProductSpecificationRef.class, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
  private ProductSpecificationRef productSpecification = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ProductSpecificationCharacteristicValueUse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Unique ID for the characteristic
   * @return id
  **/
  @ApiModelProperty(value = "Unique ID for the characteristic")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductSpecificationCharacteristicValueUse description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A narrative that explains in detail what the productSpecificationCharacteristic is
   * @return description
  **/
  @ApiModelProperty(value = "A narrative that explains in detail what the productSpecificationCharacteristic is")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductSpecificationCharacteristicValueUse maxCardinality(Integer maxCardinality) {
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

  public ProductSpecificationCharacteristicValueUse minCardinality(Integer minCardinality) {
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

  public ProductSpecificationCharacteristicValueUse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the associated productSpecificationCharacteristic
   * @return name
  **/
  @ApiModelProperty(value = "Name of the associated productSpecificationCharacteristic")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationCharacteristicValueUse valueType(String valueType) {
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

  public ProductSpecificationCharacteristicValueUse productSpecCharValue(List<CharacteristicValueSpecification> productSpecCharValue) {
    this.productSpecCharValue = productSpecCharValue;
    return this;
  }

  public ProductSpecificationCharacteristicValueUse addproductSpecCharValueItem(CharacteristicValueSpecification productSpecCharValueItem) {
    if (this.productSpecCharValue == null) {
      this.productSpecCharValue = new ArrayList<CharacteristicValueSpecification>();
    }
    this.productSpecCharValue.add(productSpecCharValueItem);
    return this;
  }

  /**
   * A number or text that can be assigned to a ProductSpecificationCharacteristic.
   * @return productSpecCharValue
  **/
  @ApiModelProperty(value = "A number or text that can be assigned to a ProductSpecificationCharacteristic.")

  @Valid

  public List<CharacteristicValueSpecification> getproductSpecCharValue() {
    return productSpecCharValue;
  }

  public void setproductSpecCharValue(List<CharacteristicValueSpecification> productSpecCharValue) {
    this.productSpecCharValue = productSpecCharValue;
  }

  public ProductSpecificationCharacteristicValueUse productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

  /**
   * A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
   * @return productSpecification
  **/
  @ApiModelProperty(value = "A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.")

  @Valid

  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductSpecificationCharacteristicValueUse validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the productSpecificationCharacteristic is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which the productSpecificationCharacteristic is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductSpecificationCharacteristicValueUse baseType(String baseType) {
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

  public ProductSpecificationCharacteristicValueUse schemaLocation(String schemaLocation) {
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

  public ProductSpecificationCharacteristicValueUse type(String type) {
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
    ProductSpecificationCharacteristicValueUse productSpecificationCharacteristicValueUse = (ProductSpecificationCharacteristicValueUse) o;
    return Objects.equals(this.id, productSpecificationCharacteristicValueUse.id) &&
        Objects.equals(this.description, productSpecificationCharacteristicValueUse.description) &&
        Objects.equals(this.maxCardinality, productSpecificationCharacteristicValueUse.maxCardinality) &&
        Objects.equals(this.minCardinality, productSpecificationCharacteristicValueUse.minCardinality) &&
        Objects.equals(this.name, productSpecificationCharacteristicValueUse.name) &&
        Objects.equals(this.valueType, productSpecificationCharacteristicValueUse.valueType) &&
        Objects.equals(this.productSpecCharValue, productSpecificationCharacteristicValueUse.productSpecCharValue) &&
        Objects.equals(this.productSpecification, productSpecificationCharacteristicValueUse.productSpecification) &&
        Objects.equals(this.validFor, productSpecificationCharacteristicValueUse.validFor) &&
        Objects.equals(this.baseType, productSpecificationCharacteristicValueUse.baseType) &&
        Objects.equals(this.schemaLocation, productSpecificationCharacteristicValueUse.schemaLocation) &&
        Objects.equals(this.type, productSpecificationCharacteristicValueUse.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description, maxCardinality, minCardinality, name, valueType, productSpecCharValue, productSpecification, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationCharacteristicValueUse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    maxCardinality: ").append(toIndentedString(maxCardinality)).append("\n");
    sb.append("    minCardinality: ").append(toIndentedString(minCardinality)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
    sb.append("    productSpecCharValue: ").append(toIndentedString(productSpecCharValue)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

