package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.AgreementRef;
import io.swagger.model.AttachmentRefOrValue;
import io.swagger.model.BundledProductOffering;
import io.swagger.model.CategoryRef;
import io.swagger.model.ChannelRef;
import io.swagger.model.MarketSegmentRef;
import io.swagger.model.PlaceRef;
import io.swagger.model.ProductOfferingPriceRefOrValue;
import io.swagger.model.ProductOfferingRelationship;
import io.swagger.model.ProductOfferingTerm;
import io.swagger.model.ProductSpecificationCharacteristicValueUse;
import io.swagger.model.ProductSpecificationRef;
import io.swagger.model.ResourceCandidateRef;
import io.swagger.model.SLARef;
import io.swagger.model.ServiceCandidateRef;
import io.swagger.model.TimePeriod;
import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
 */
@ApiModel(description = "Represents entities that are orderable from the provider of the catalog, this resource includes pricing information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Entity
@Data
@Builder
public class ProductOffering   {
  @Id
  @GeneratedValue(generator = "system-uuid")
  @GenericGenerator(name = "system-uuid", strategy = "uuid")
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isSellable")
  private Boolean isSellable = null;

  @JsonProperty("lastUpdate")
  private OffsetDateTime lastUpdate = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("statusReason")
  private String statusReason = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("agreement")
  @Valid
  @OneToMany(targetEntity = AgreementRef.class, cascade = CascadeType.ALL)
  private List<AgreementRef> agreement = null;

  @JsonProperty("attachment")
  @Valid
  @OneToMany(targetEntity = AttachmentRefOrValue.class, cascade = CascadeType.ALL)
  private List<AttachmentRefOrValue> attachment = null;

  @JsonProperty("bundledProductOffering")
  @Valid
  @OneToMany(targetEntity = BundledProductOffering.class, cascade = CascadeType.ALL)
  private List<BundledProductOffering> bundledProductOffering = null;

  @JsonProperty("category")
  @Valid
  @OneToMany(targetEntity = CategoryRef.class, cascade = CascadeType.ALL)
  private List<CategoryRef> category = null;

  @JsonProperty("channel")
  @Valid
  @OneToMany(targetEntity = ChannelRef.class, cascade = CascadeType.ALL)
  private List<ChannelRef> channel = null;

  @JsonProperty("marketSegment")
  @Valid
  @OneToMany(targetEntity = MarketSegmentRef.class, cascade = CascadeType.ALL)
  private List<MarketSegmentRef> marketSegment = null;

  @JsonProperty("place")
  @Valid
  @OneToMany(targetEntity = PlaceRef.class, cascade = CascadeType.ALL)
  private List<PlaceRef> place = null;

  @JsonProperty("prodSpecCharValueUse")
  @Valid
  @OneToMany(targetEntity = ProductSpecificationCharacteristicValueUse.class, cascade = CascadeType.ALL)
  private List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse = null;

  @JsonProperty("productOfferingPrice")
  @Valid
  @OneToMany(targetEntity = ProductOfferingPriceRefOrValue.class, cascade = CascadeType.ALL)
  private List<ProductOfferingPriceRefOrValue> productOfferingPrice = null;

  @JsonProperty("productOfferingRelationship")
  @Valid
  @OneToMany(targetEntity = ProductOfferingRelationship.class, cascade = CascadeType.ALL)
  private List<ProductOfferingRelationship> productOfferingRelationship = null;

  @JsonProperty("productOfferingTerm")
  @Valid
  @OneToMany(targetEntity = ProductOfferingTerm.class, cascade = CascadeType.ALL)
  private List<ProductOfferingTerm> productOfferingTerm = null;

  @JsonProperty("productSpecification")
  @OneToOne(targetEntity = ProductSpecificationRef.class, cascade = CascadeType.ALL)
  private ProductSpecificationRef productSpecification = null;

  @JsonProperty("resourceCandidate")
  @OneToOne(targetEntity = ResourceCandidateRef.class, cascade = CascadeType.ALL)
  private ResourceCandidateRef resourceCandidate = null;

  @JsonProperty("serviceCandidate")
  @OneToOne(targetEntity = ServiceCandidateRef.class, cascade = CascadeType.ALL)
  private ServiceCandidateRef serviceCandidate = null;

  @JsonProperty("serviceLevelAgreement")
  @OneToOne(targetEntity = SLARef.class, cascade = CascadeType.ALL)
  private SLARef serviceLevelAgreement = null;

  @JsonProperty("validFor")
  @OneToOne(targetEntity = TimePeriod.class, cascade = CascadeType.ALL)
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  public ProductOffering id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the productOffering
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the productOffering")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOffering href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the ProductOffering
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the ProductOffering")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOffering description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the productOffering
   * @return description
  **/
  @ApiModelProperty(value = "Description of the productOffering")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductOffering isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

  /**
   * isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).
   * @return isBundle
  **/
  @ApiModelProperty(value = "isBundle determines whether a productOffering represents a single productOffering (false), or a bundle of productOfferings (true).")


  public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductOffering isSellable(Boolean isSellable) {
    this.isSellable = isSellable;
    return this;
  }

  /**
   * A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.
   * @return isSellable
  **/
  @ApiModelProperty(value = "A flag indicating if this product offer can be sold stand-alone for sale or not. If this flag is false it indicates that the offer can only be sold within a bundle.")


  public Boolean isIsSellable() {
    return isSellable;
  }

  public void setIsSellable(Boolean isSellable) {
    this.isSellable = isSellable;
  }

  public ProductOffering lastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
    return this;
  }

  /**
   * Date and time of the last update
   * @return lastUpdate
  **/
  @ApiModelProperty(value = "Date and time of the last update")

  @Valid

  public OffsetDateTime getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(OffsetDateTime lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public ProductOffering lifecycleStatus(String lifecycleStatus) {
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

  public ProductOffering name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the productOffering
   * @return name
  **/
  @ApiModelProperty(value = "Name of the productOffering")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOffering statusReason(String statusReason) {
    this.statusReason = statusReason;
    return this;
  }

  /**
   * A string providing a complementary information on the value of the lifecycle status attribute.
   * @return statusReason
  **/
  @ApiModelProperty(value = "A string providing a complementary information on the value of the lifecycle status attribute.")


  public String getStatusReason() {
    return statusReason;
  }

  public void setStatusReason(String statusReason) {
    this.statusReason = statusReason;
  }

  public ProductOffering version(String version) {
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

  public ProductOffering agreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductOffering addAgreementItem(AgreementRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

  /**
   * An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
   * @return agreement
  **/
  @ApiModelProperty(value = "An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.")

  @Valid

  public List<AgreementRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementRef> agreement) {
    this.agreement = agreement;
  }

  public ProductOffering attachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
    return this;
  }

  public ProductOffering addAttachmentItem(AttachmentRefOrValue attachmentItem) {
    if (this.attachment == null) {
      this.attachment = new ArrayList<AttachmentRefOrValue>();
    }
    this.attachment.add(attachmentItem);
    return this;
  }

  /**
   * Complements the description of an element (for instance a product) through video, pictures...
   * @return attachment
  **/
  @ApiModelProperty(value = "Complements the description of an element (for instance a product) through video, pictures...")

  @Valid

  public List<AttachmentRefOrValue> getAttachment() {
    return attachment;
  }

  public void setAttachment(List<AttachmentRefOrValue> attachment) {
    this.attachment = attachment;
  }

  public ProductOffering bundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
    return this;
  }

  public ProductOffering addBundledProductOfferingItem(BundledProductOffering bundledProductOfferingItem) {
    if (this.bundledProductOffering == null) {
      this.bundledProductOffering = new ArrayList<BundledProductOffering>();
    }
    this.bundledProductOffering.add(bundledProductOfferingItem);
    return this;
  }

  /**
   * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
   * @return bundledProductOffering
  **/
  @ApiModelProperty(value = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")

  @Valid

  public List<BundledProductOffering> getBundledProductOffering() {
    return bundledProductOffering;
  }

  public void setBundledProductOffering(List<BundledProductOffering> bundledProductOffering) {
    this.bundledProductOffering = bundledProductOffering;
  }

  public ProductOffering category(List<CategoryRef> category) {
    this.category = category;
    return this;
  }

  public ProductOffering addCategoryItem(CategoryRef categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<CategoryRef>();
    }
    this.category.add(categoryItem);
    return this;
  }

  /**
   * The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.
   * @return category
  **/
  @ApiModelProperty(value = "The category resource is used to group product offerings, service and resource candidates in logical containers. Categories can contain other categories and/or product offerings, resource or service candidates.")

  @Valid

  public List<CategoryRef> getCategory() {
    return category;
  }

  public void setCategory(List<CategoryRef> category) {
    this.category = category;
  }

  public ProductOffering channel(List<ChannelRef> channel) {
    this.channel = channel;
    return this;
  }

  public ProductOffering addChannelItem(ChannelRef channelItem) {
    if (this.channel == null) {
      this.channel = new ArrayList<ChannelRef>();
    }
    this.channel.add(channelItem);
    return this;
  }

  /**
   * The channel defines the channel for selling product offerings.
   * @return channel
  **/
  @ApiModelProperty(value = "The channel defines the channel for selling product offerings.")

  @Valid

  public List<ChannelRef> getChannel() {
    return channel;
  }

  public void setChannel(List<ChannelRef> channel) {
    this.channel = channel;
  }

  public ProductOffering marketSegment(List<MarketSegmentRef> marketSegment) {
    this.marketSegment = marketSegment;
    return this;
  }

  public ProductOffering addMarketSegmentItem(MarketSegmentRef marketSegmentItem) {
    if (this.marketSegment == null) {
      this.marketSegment = new ArrayList<MarketSegmentRef>();
    }
    this.marketSegment.add(marketSegmentItem);
    return this;
  }

  /**
   * provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.
   * @return marketSegment
  **/
  @ApiModelProperty(value = "provides references to the corresponding market segment as target of product offerings. A market segment is grouping of Parties, GeographicAreas, SalesChannels, and so forth.")

  @Valid

  public List<MarketSegmentRef> getMarketSegment() {
    return marketSegment;
  }

  public void setMarketSegment(List<MarketSegmentRef> marketSegment) {
    this.marketSegment = marketSegment;
  }

  public ProductOffering place(List<PlaceRef> place) {
    this.place = place;
    return this;
  }

  public ProductOffering addPlaceItem(PlaceRef placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<PlaceRef>();
    }
    this.place.add(placeItem);
    return this;
  }

  /**
   * Place defines the places where the products are sold or delivered.
   * @return place
  **/
  @ApiModelProperty(value = "Place defines the places where the products are sold or delivered.")

  @Valid

  public List<PlaceRef> getPlace() {
    return place;
  }

  public void setPlace(List<PlaceRef> place) {
    this.place = place;
  }

  public ProductOffering prodSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
    return this;
  }

  public ProductOffering addProdSpecCharValueUseItem(ProductSpecificationCharacteristicValueUse prodSpecCharValueUseItem) {
    if (this.prodSpecCharValueUse == null) {
      this.prodSpecCharValueUse = new ArrayList<ProductSpecificationCharacteristicValueUse>();
    }
    this.prodSpecCharValueUse.add(prodSpecCharValueUseItem);
    return this;
  }

  /**
   * A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.
   * @return prodSpecCharValueUse
  **/
  @ApiModelProperty(value = "A use of the ProductSpecificationCharacteristicValue by a ProductOffering to which additional properties (attributes) apply or override the properties of similar properties contained in ProductSpecificationCharacteristicValue. It should be noted that characteristics which their value(s) addressed by this object must exist in corresponding product specification. The available characteristic values for a ProductSpecificationCharacteristic in a Product specification can be modified at the ProductOffering level. For example, a characteristic 'Color' might have values White, Blue, Green, and Red. But, the list of values can be restricted to e.g. White and Blue in an associated product offering. It should be noted that the list of values in 'ProductSpecificationCharacteristicValueUse' is a strict subset of the list of values as defined in the corresponding product specification characteristics.")

  @Valid

  public List<ProductSpecificationCharacteristicValueUse> getProdSpecCharValueUse() {
    return prodSpecCharValueUse;
  }

  public void setProdSpecCharValueUse(List<ProductSpecificationCharacteristicValueUse> prodSpecCharValueUse) {
    this.prodSpecCharValueUse = prodSpecCharValueUse;
  }

  public ProductOffering productOfferingPrice(List<ProductOfferingPriceRefOrValue> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
    return this;
  }

  public ProductOffering addProductOfferingPriceItem(ProductOfferingPriceRefOrValue productOfferingPriceItem) {
    if (this.productOfferingPrice == null) {
      this.productOfferingPrice = new ArrayList<ProductOfferingPriceRefOrValue>();
    }
    this.productOfferingPrice.add(productOfferingPriceItem);
    return this;
  }

  /**
   * An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.
   * @return productOfferingPrice
  **/
  @ApiModelProperty(value = "An amount, usually of money, that is asked for or allowed when a ProductOffering is bought, rented, or leased. The price is valid for a defined period of time and may not represent the actual price paid by a customer.")

  @Valid

  public List<ProductOfferingPriceRefOrValue> getProductOfferingPrice() {
    return productOfferingPrice;
  }

  public void setProductOfferingPrice(List<ProductOfferingPriceRefOrValue> productOfferingPrice) {
    this.productOfferingPrice = productOfferingPrice;
  }

  public ProductOffering productOfferingRelationship(List<ProductOfferingRelationship> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
    return this;
  }

  public ProductOffering addProductOfferingRelationshipItem(ProductOfferingRelationship productOfferingRelationshipItem) {
    if (this.productOfferingRelationship == null) {
      this.productOfferingRelationship = new ArrayList<ProductOfferingRelationship>();
    }
    this.productOfferingRelationship.add(productOfferingRelationshipItem);
    return this;
  }

  /**
   * A relationship between this product offering and other product offerings.
   * @return productOfferingRelationship
  **/
  @ApiModelProperty(value = "A relationship between this product offering and other product offerings.")

  @Valid

  public List<ProductOfferingRelationship> getProductOfferingRelationship() {
    return productOfferingRelationship;
  }

  public void setProductOfferingRelationship(List<ProductOfferingRelationship> productOfferingRelationship) {
    this.productOfferingRelationship = productOfferingRelationship;
  }

  public ProductOffering productOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
    return this;
  }

  public ProductOffering addProductOfferingTermItem(ProductOfferingTerm productOfferingTermItem) {
    if (this.productOfferingTerm == null) {
      this.productOfferingTerm = new ArrayList<ProductOfferingTerm>();
    }
    this.productOfferingTerm.add(productOfferingTermItem);
    return this;
  }

  /**
   * A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.
   * @return productOfferingTerm
  **/
  @ApiModelProperty(value = "A condition under which a ProductOffering is made available to Customers. For instance, a productOffering can be offered with multiple commitment periods.")

  @Valid

  public List<ProductOfferingTerm> getProductOfferingTerm() {
    return productOfferingTerm;
  }

  public void setProductOfferingTerm(List<ProductOfferingTerm> productOfferingTerm) {
    this.productOfferingTerm = productOfferingTerm;
  }

  public ProductOffering productSpecification(ProductSpecificationRef productSpecification) {
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

  public ProductOffering resourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
    return this;
  }

  /**
   * A resource candidate is an entity that makes a ResourceSpecification available to a catalog.
   * @return resourceCandidate
  **/
  @ApiModelProperty(value = "A resource candidate is an entity that makes a ResourceSpecification available to a catalog.")

  @Valid

  public ResourceCandidateRef getResourceCandidate() {
    return resourceCandidate;
  }

  public void setResourceCandidate(ResourceCandidateRef resourceCandidate) {
    this.resourceCandidate = resourceCandidate;
  }

  public ProductOffering serviceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
    return this;
  }

  /**
   * ServiceCandidate is an entity that makes a ServiceSpecification available to a catalog.
   * @return serviceCandidate
  **/
  @ApiModelProperty(value = "ServiceCandidate is an entity that makes a ServiceSpecification available to a catalog.")

  @Valid

  public ServiceCandidateRef getServiceCandidate() {
    return serviceCandidate;
  }

  public void setServiceCandidate(ServiceCandidateRef serviceCandidate) {
    this.serviceCandidate = serviceCandidate;
  }

  public ProductOffering serviceLevelAgreement(SLARef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
    return this;
  }

  /**
   * A service level agreement (SLA) is a type of agreement that represents a formal negotiated agreement between two parties designed to create a common understanding about products, services, priorities, responsibilities, and so forth. The SLA is a set of appropriate procedures and targets formally or informally agreed between parties in order to achieve and maintain specified Quality of Service.
   * @return serviceLevelAgreement
  **/
  @ApiModelProperty(value = "A service level agreement (SLA) is a type of agreement that represents a formal negotiated agreement between two parties designed to create a common understanding about products, services, priorities, responsibilities, and so forth. The SLA is a set of appropriate procedures and targets formally or informally agreed between parties in order to achieve and maintain specified Quality of Service.")

  @Valid

  public SLARef getServiceLevelAgreement() {
    return serviceLevelAgreement;
  }

  public void setServiceLevelAgreement(SLARef serviceLevelAgreement) {
    this.serviceLevelAgreement = serviceLevelAgreement;
  }

  public ProductOffering validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * The period for which the productOffering is valid
   * @return validFor
  **/
  @ApiModelProperty(value = "The period for which the productOffering is valid")

  @Valid

  public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public ProductOffering baseType(String baseType) {
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

  public ProductOffering schemaLocation(String schemaLocation) {
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

  public ProductOffering type(String type) {
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
    ProductOffering productOffering = (ProductOffering) o;
    return Objects.equals(this.id, productOffering.id) &&
        Objects.equals(this.href, productOffering.href) &&
        Objects.equals(this.description, productOffering.description) &&
        Objects.equals(this.isBundle, productOffering.isBundle) &&
        Objects.equals(this.isSellable, productOffering.isSellable) &&
        Objects.equals(this.lastUpdate, productOffering.lastUpdate) &&
        Objects.equals(this.lifecycleStatus, productOffering.lifecycleStatus) &&
        Objects.equals(this.name, productOffering.name) &&
        Objects.equals(this.statusReason, productOffering.statusReason) &&
        Objects.equals(this.version, productOffering.version) &&
        Objects.equals(this.agreement, productOffering.agreement) &&
        Objects.equals(this.attachment, productOffering.attachment) &&
        Objects.equals(this.bundledProductOffering, productOffering.bundledProductOffering) &&
        Objects.equals(this.category, productOffering.category) &&
        Objects.equals(this.channel, productOffering.channel) &&
        Objects.equals(this.marketSegment, productOffering.marketSegment) &&
        Objects.equals(this.place, productOffering.place) &&
        Objects.equals(this.prodSpecCharValueUse, productOffering.prodSpecCharValueUse) &&
        Objects.equals(this.productOfferingPrice, productOffering.productOfferingPrice) &&
        Objects.equals(this.productOfferingRelationship, productOffering.productOfferingRelationship) &&
        Objects.equals(this.productOfferingTerm, productOffering.productOfferingTerm) &&
        Objects.equals(this.productSpecification, productOffering.productSpecification) &&
        Objects.equals(this.resourceCandidate, productOffering.resourceCandidate) &&
        Objects.equals(this.serviceCandidate, productOffering.serviceCandidate) &&
        Objects.equals(this.serviceLevelAgreement, productOffering.serviceLevelAgreement) &&
        Objects.equals(this.validFor, productOffering.validFor) &&
        Objects.equals(this.baseType, productOffering.baseType) &&
        Objects.equals(this.schemaLocation, productOffering.schemaLocation) &&
        Objects.equals(this.type, productOffering.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, isSellable, lastUpdate, lifecycleStatus, name, statusReason, version, agreement, attachment, bundledProductOffering, category, channel, marketSegment, place, prodSpecCharValueUse, productOfferingPrice, productOfferingRelationship, productOfferingTerm, productSpecification, resourceCandidate, serviceCandidate, serviceLevelAgreement, validFor, baseType, schemaLocation, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOffering {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isSellable: ").append(toIndentedString(isSellable)).append("\n");
    sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    statusReason: ").append(toIndentedString(statusReason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    attachment: ").append(toIndentedString(attachment)).append("\n");
    sb.append("    bundledProductOffering: ").append(toIndentedString(bundledProductOffering)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
    sb.append("    marketSegment: ").append(toIndentedString(marketSegment)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    prodSpecCharValueUse: ").append(toIndentedString(prodSpecCharValueUse)).append("\n");
    sb.append("    productOfferingPrice: ").append(toIndentedString(productOfferingPrice)).append("\n");
    sb.append("    productOfferingRelationship: ").append(toIndentedString(productOfferingRelationship)).append("\n");
    sb.append("    productOfferingTerm: ").append(toIndentedString(productOfferingTerm)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    resourceCandidate: ").append(toIndentedString(resourceCandidate)).append("\n");
    sb.append("    serviceCandidate: ").append(toIndentedString(serviceCandidate)).append("\n");
    sb.append("    serviceLevelAgreement: ").append(toIndentedString(serviceLevelAgreement)).append("\n");
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

