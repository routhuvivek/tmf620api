package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CategoryRef;
import io.swagger.model.RelatedParty;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details Skipped properties: id,href,lastUpdate,@type,@baseType
 */
@ApiModel(description = "A collection of Product Offerings, intended for a specific DistributionChannel, enhanced with additional information such as SLA parameters, invoicing and shipping details Skipped properties: id,href,lastUpdate,@type,@baseType")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")


public class CatalogUpdate   {
  @JsonProperty("catalogType")
  private String catalogType = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("category")
  @Valid
  private List<CategoryRef> category = null;

  @JsonProperty("relatedParty")
  @Valid
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public CatalogUpdate catalogType(String catalogType) {
    this.catalogType = catalogType;
    return this;
  }

  /**
   * Indicates if the catalog is a product, service or resource catalog
   * @return catalogType
  **/
  @ApiModelProperty(value = "Indicates if the catalog is a product, service or resource catalog")


  public String getCatalogType() {
    return catalogType;
  }

  public void setCatalogType(String catalogType) {
    this.catalogType = catalogType;
  }

  public CatalogUpdate description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this catalog
   * @return description
  **/
  @ApiModelProperty(value = "Description of this catalog")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogUpdate lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
  **/
  @ApiModelProperty(value = "Used to indicate the current lifecycle status")


  public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public CatalogUpdate name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the catalog
   * @return name
  **/
  @ApiModelProperty(value = "Name of the catalog")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CatalogUpdate version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Catalog version
   * @return version
  **/
  @ApiModelProperty(value = "Catalog version")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CatalogUpdate category(List<CategoryRef> category) {
    this.category = category;
    return this;
  }

  public CatalogUpdate addCategoryItem(CategoryRef categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<CategoryRef>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * List of root categories contained in this catalog
   * @return category
  **/
  @ApiModelProperty(value = "List of root categories contained in this catalog")

  @Valid

  public List<CategoryRef> getCategory() {
    return category;
  }

  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }

  public CatalogUpdate relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public CatalogUpdate addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

  /**
   * List of parties involved in this catalog
   * @return relatedParty
  **/
  @ApiModelProperty(value = "List of parties involved in this catalog")

  @Valid

  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public CatalogUpdate validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the catalog is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which the catalog is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public CatalogUpdate schemaLocation(String schemaLocation) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogUpdate catalogUpdate = (CatalogUpdate) o;
    return Objects.equals(this.catalogType, catalogUpdate.catalogType) &&
        Objects.equals(this.description, catalogUpdate.description) &&
        Objects.equals(this.lifecycleStatus, catalogUpdate.lifecycleStatus) &&
        Objects.equals(this.name, catalogUpdate.name) &&
        Objects.equals(this.version, catalogUpdate.version) &&
        Objects.equals(this.category, catalogUpdate.category) &&
        Objects.equals(this.relatedParty, catalogUpdate.relatedParty) &&
        Objects.equals(this.validFor, catalogUpdate.validFor) &&
        Objects.equals(this.schemaLocation, catalogUpdate.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(catalogType, description, lifecycleStatus, name, version, category, relatedParty, validFor, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogUpdate {\n");
    
    sb.append("    catalogType: ").append(toIndentedString(catalogType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

