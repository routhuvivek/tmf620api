package io.swagger.api;

import io.swagger.dao.ProductOfferingPriceDao;
import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Error;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Controller
public class ProductOfferingPriceApiController implements ProductOfferingPriceApi {

    private static final Logger log = LoggerFactory.getLogger(ProductOfferingPriceApiController.class);

    private final ObjectMapper objectMapper;
    private final ModelMapper modelMapper;
    private final ProductOfferingPriceDao productOfferingPriceDao;
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductOfferingPriceApiController(ModelMapper modelMapper,ProductOfferingPriceDao productOfferingPriceDao,ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.productOfferingPriceDao = productOfferingPriceDao;
    }

    public ResponseEntity<ProductOfferingPrice> createProductOfferingPrice(@ApiParam(value = "The ProductOfferingPrice to be created" ,required=true )  @Valid @RequestBody ProductOfferingPriceCreate productOfferingPrice) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ProductOfferingPrice productOfferingPriceRequest = modelMapper.map(productOfferingPrice,ProductOfferingPrice.class);
                productOfferingPriceDao.save(productOfferingPriceRequest);
                return new ResponseEntity<ProductOfferingPrice>(productOfferingPriceRequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if(productOfferingPriceDao.findOne(id) != null){
            productOfferingPriceDao.delete(id);
            return new ResponseEntity<String>("Deleted", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<String>("ID not found",HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductOfferingPrice>> listProductOfferingPrice(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductOfferingPrice>>(productOfferingPriceDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductOfferingPrice>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductOfferingPrice>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOfferingPrice> patchProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductOfferingPrice to be updated" ,required=true )  @Valid @RequestBody ProductOfferingPriceUpdate productOfferingPrice) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ProductOfferingPrice productOfferingPriceDb= productOfferingPriceDao.findOne(id);
                if(Objects.nonNull(productOfferingPrice.getName())&& !"".equalsIgnoreCase(productOfferingPrice.getName())){
                    productOfferingPriceDb.setName(productOfferingPrice.getName());
                }
                if(Objects.nonNull(productOfferingPrice.getDescription())&& !"".equalsIgnoreCase(productOfferingPrice.getDescription())){
                    productOfferingPriceDb.setDescription(productOfferingPrice.getDescription());
                }
                if(Objects.nonNull(productOfferingPrice.getVersion())&& !"".equalsIgnoreCase(productOfferingPrice.getVersion())){
                    productOfferingPriceDb.setVersion(productOfferingPrice.getVersion());
                }
//                if(Objects.nonNull(productOfferingPrice.getValidFor())&& !"".equalsIgnoreCase(productOfferingPrice.getValidFor().toString())){
//                    productOfferingPriceDb.setValidFor(productOfferingPrice.getValidFor());
//                }
                ProductOfferingPrice productOfferingPriceResponse = productOfferingPriceDao.findOne(id);
                productOfferingPriceDao.save(productOfferingPriceResponse);
                return new ResponseEntity<ProductOfferingPrice>(productOfferingPriceResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOfferingPrice> retrieveProductOfferingPrice(@ApiParam(value = "Identifier of the ProductOfferingPrice",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductOfferingPrice>(productOfferingPriceDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOfferingPrice>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOfferingPrice>(HttpStatus.NOT_IMPLEMENTED);
    }

}
