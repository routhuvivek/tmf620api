/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.32).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.ProductOfferingPrice;
import io.swagger.model.ProductOfferingPriceCreate;
import io.swagger.model.ProductOfferingPriceUpdate;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Validated
@Api(value = "productOfferingPrice", description = "the productOfferingPrice API")
@RequestMapping(value = "/tmf-api/productCatalogManagement/v4/")
public interface ProductOfferingPriceApi {

    @ApiOperation(value = "Creates a ProductOfferingPrice", nickname = "createProductOfferingPrice", notes = "This operation creates a ProductOfferingPrice entity.", response = ProductOfferingPrice.class, tags={ "productOfferingPrice", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = ProductOfferingPrice.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productOfferingPrice",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.POST)
    ResponseEntity<ProductOfferingPrice> createProductOfferingPrice(@ApiParam(value = "The ProductOfferingPrice to be created" ,required=true )  @Valid @RequestBody ProductOfferingPriceCreate productOfferingPrice);


    @ApiOperation(value = "Deletes a ProductOfferingPrice", nickname = "deleteProductOfferingPrice", notes = "This operation deletes a ProductOfferingPrice entity.", tags={ "productOfferingPrice", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productOfferingPrice/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.DELETE)
    ResponseEntity<String> deleteProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id);


    @ApiOperation(value = "List or find ProductOfferingPrice objects", nickname = "listProductOfferingPrice", notes = "This operation list or find ProductOfferingPrice entities", response = ProductOfferingPrice.class, responseContainer = "List", tags={ "productOfferingPrice", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductOfferingPrice.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productOfferingPrice",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<List<ProductOfferingPrice>> listProductOfferingPrice(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "Updates partially a ProductOfferingPrice", nickname = "patchProductOfferingPrice", notes = "This operation updates partially a ProductOfferingPrice entity.", response = ProductOfferingPrice.class, tags={ "productOfferingPrice", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Updated", response = ProductOfferingPrice.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productOfferingPrice/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.PATCH)
    ResponseEntity<ProductOfferingPrice> patchProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductOfferingPrice to be updated" ,required=true )  @Valid @RequestBody ProductOfferingPriceUpdate productOfferingPrice);


    @ApiOperation(value = "Retrieves a ProductOfferingPrice by ID", nickname = "retrieveProductOfferingPrice", notes = "This operation retrieves a ProductOfferingPrice entity. Attribute selection is enabled for all first level attributes.", response = ProductOfferingPrice.class, tags={ "productOfferingPrice", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Success", response = ProductOfferingPrice.class),
        @ApiResponse(code = 400, message = "Bad Request", response = Error.class),
        @ApiResponse(code = 401, message = "Unauthorized", response = Error.class),
        @ApiResponse(code = 403, message = "Forbidden", response = Error.class),
        @ApiResponse(code = 404, message = "Not Found", response = Error.class),
        @ApiResponse(code = 405, message = "Method Not allowed", response = Error.class),
        @ApiResponse(code = 409, message = "Conflict", response = Error.class),
        @ApiResponse(code = 500, message = "Internal Server Error", response = Error.class) })
    @RequestMapping(value = "/productOfferingPrice/{id}",
        produces = { "application/json;charset=utf-8" }, 
        consumes = { "application/json;charset=utf-8" },
        method = RequestMethod.GET)
    ResponseEntity<ProductOfferingPrice> retrieveProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields);

}
