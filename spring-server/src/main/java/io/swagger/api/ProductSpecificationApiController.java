package io.swagger.api;

import io.swagger.dao.ProductSpecificationDao;
import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import io.swagger.model.Error;
import io.swagger.models.Model;
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
public class ProductSpecificationApiController implements ProductSpecificationApi {

    private static final Logger log = LoggerFactory.getLogger(ProductSpecificationApiController.class);

    private final ObjectMapper objectMapper;

    private final ModelMapper modelMapper;
    private final ProductSpecificationDao productSpecificationDao;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProductSpecificationApiController(ModelMapper modelMapper,ProductSpecificationDao productSpecificationDao,ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.productSpecificationDao = productSpecificationDao;
    }

    public ResponseEntity<ProductSpecification> createProductSpecification(@ApiParam(value = "The ProductSpecification to be created" ,required=true )  @Valid @RequestBody ProductSpecificationCreate productSpecification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ProductSpecification productSpecificationRequest = modelMapper.map(productSpecification,ProductSpecification.class);
                //System.out.println(productSpecificationRequest);
                productSpecificationDao.save(productSpecificationRequest);

                return new ResponseEntity<ProductSpecification>(productSpecificationRequest, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if(productSpecificationDao.findOne(id) == null) {
            productSpecificationDao.delete(id);
            return new ResponseEntity<String>("Deleted Successfully", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<String>("id not found",HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ProductSpecification>> listProductSpecification(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ProductSpecification>>(productSpecificationDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ProductSpecification>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ProductSpecification>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductSpecification> patchProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "The ProductSpecification to be updated" ,required=true )  @Valid @RequestBody ProductSpecificationUpdate productSpecification) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                ProductSpecification productSpecificationDb= productSpecificationDao.findOne(id);
                if(Objects.nonNull(productSpecification.getName())&& !"".equalsIgnoreCase(productSpecification.getName())){
                    productSpecificationDb.setName(productSpecification.getName());
                }
                if(Objects.nonNull(productSpecification.getDescription())&& !"".equalsIgnoreCase(productSpecification.getDescription())){
                    productSpecificationDb.setDescription(productSpecification.getDescription());
                }
                if(Objects.nonNull(productSpecification.getVersion())&& !"".equalsIgnoreCase(productSpecification.getVersion())){
                    productSpecificationDb.setVersion(productSpecification.getVersion());
                }
                ProductSpecification productSpecificationResponse = productSpecificationDao.findOne(id);
                productSpecificationDao.save(productSpecificationResponse);
                return new ResponseEntity<ProductSpecification>(productSpecificationResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ProductSpecification> retrieveProductSpecification(@ApiParam(value = "Identifier of the ProductSpecification",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ProductSpecification>(productSpecificationDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ProductSpecification>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ProductSpecification>(HttpStatus.NOT_IMPLEMENTED);
    }

}
