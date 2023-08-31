package io.swagger.api;

import io.swagger.dao.ProductOfferingDao;
import io.swagger.model.Error;
import io.swagger.model.ProductOffering;
import io.swagger.model.ProductOfferingCreate;
import io.swagger.model.ProductOfferingUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Controller
public class ProductOfferingApiController implements ProductOfferingApi {

    private static final Logger log = LoggerFactory.getLogger(ProductOfferingApiController.class);

    private final ObjectMapper objectMapper;
    private final ModelMapper modelMapper;
    private final ProductOfferingDao productOfferingDao;
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductOfferingApiController(ProductOfferingDao productOfferingDao,ModelMapper modelMapper,ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.productOfferingDao = productOfferingDao;
    }

    public ResponseEntity<ProductOffering> createProductOffering(@ApiParam(value = "The ProductOffering to be created" ,required=true )  @Valid @RequestBody ProductOfferingCreate productOffering) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ProductOffering productOfferingRequest = modelMapper.map(productOffering,ProductOffering.class);
                productOfferingDao.save(productOfferingRequest);
                return new ResponseEntity<ProductOffering>(productOfferingRequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOffering>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOffering>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteProductOffering(@ApiParam(value = "Identifier of the ProductOffering",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if(productOfferingDao.findOne(id)!= null){
            productOfferingDao.delete(id);
            return new ResponseEntity<String>("Deleted Successfully",HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<String>("Entity not available",HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductOffering>> listProductOffering(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductOffering>>(productOfferingDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductOffering>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductOffering>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOffering> patchProductOffering(@ApiParam(value = "Identifier of the ProductOffering",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductOffering to be updated" ,required=true )  @Valid @RequestBody ProductOfferingUpdate productOffering) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ProductOffering productofferingDb= productOfferingDao.findOne(id);
                if(Objects.nonNull(productOffering.getVersion())&& !"".equalsIgnoreCase(productOffering.getVersion())){
                    productofferingDb.setVersion(productOffering.getVersion());
                }
                if(Objects.nonNull(productOffering.getValidFor())&& !"".equalsIgnoreCase(productOffering.getValidFor().toString())){
                    productofferingDb.setValidFor(productOffering.getValidFor());
                }
                ProductOffering productOfferingResponse = productOfferingDao.findOne(id);
                return new ResponseEntity<ProductOffering>(productOfferingResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOffering>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOffering>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductOffering> retrieveProductOffering(@ApiParam(value = "Identifier of the ProductOffering",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductOffering>(productOfferingDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductOffering>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductOffering>(HttpStatus.NOT_IMPLEMENTED);
    }

}
