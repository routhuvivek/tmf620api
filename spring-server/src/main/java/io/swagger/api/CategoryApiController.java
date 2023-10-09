package io.swagger.api;

import io.swagger.dao.CateogryDao;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2023-08-21T06:57:56.020Z")

@Controller
public class CategoryApiController implements CategoryApi {

    private static final Logger log = LoggerFactory.getLogger(CategoryApiController.class);

    private final ObjectMapper objectMapper;

    private final ModelMapper modelMapper;
    private final CateogryDao categoryDao;
    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CategoryApiController(ModelMapper modelMapper, CateogryDao categoryDao, ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.categoryDao = categoryDao;
    }

    public ResponseEntity<Category> createCategory(@ApiParam(value = "The Category to be created" ,required=true )  @Valid @RequestBody CategoryCreate category) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Category categoryResponse = modelMapper.map(category, Category.class);
                categoryDao.save(categoryResponse);
                String id = categoryResponse.getId();
                String href = "http://localhost:8080/tmf-api/productCatalogManagement/v4/category/"+id;
                categoryResponse.setHref(href);
                Category category1 = categoryDao.findOne(id);
                categoryDao.save(category1);
                return new ResponseEntity<Category>(categoryResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Category>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteCategory(@ApiParam(value = "Identifier of the Category",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if(categoryDao.findOne(id) != null){
            categoryDao.delete(id);
            return new ResponseEntity<String>("deleted successfully", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<String>("id not found",HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Category>> listCategory(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Category>>(categoryDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Category>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Category>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Category> patchCategory(@ApiParam(value = "Identifier of the Category",required=true) @PathVariable("id") String id,@ApiParam(value = "The Category to be updated" ,required=true )  @Valid @RequestBody CategoryUpdate category) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Category categoryDb= categoryDao.findOne(id);
                if(Objects.nonNull(category.getName())&& !"".equalsIgnoreCase(category.getName())){
                    categoryDb.setName(category.getName());
                }
                if(Objects.nonNull(category.getDescription())&& !"".equalsIgnoreCase(category.getDescription())){
                    categoryDb.setDescription(category.getDescription());
                }
                if(Objects.nonNull(category.getVersion())&& !"".equalsIgnoreCase(category.getVersion())){
                    categoryDb.setVersion(category.getVersion());
                }
                Category serviceCategoryResponse = categoryDao.findOne(id);
                categoryDao.save(serviceCategoryResponse);
                return new ResponseEntity<Category>(serviceCategoryResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Category>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Category> retrieveCategory(@ApiParam(value = "Identifier of the Category",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Category>(categoryDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Category>(HttpStatus.NOT_IMPLEMENTED);
    }

}
