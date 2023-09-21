package io.swagger.api;

import io.swagger.dao.CatalogDao;
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
public class CatalogApiController implements CatalogApi {

    private static final Logger log = LoggerFactory.getLogger(CatalogApiController.class);

    private final ObjectMapper objectMapper;

    private final ModelMapper modelMapper;
    private final CatalogDao catalogDao;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CatalogApiController(ModelMapper modelMapper, CatalogDao catalogDao, ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.modelMapper = modelMapper;
        this.catalogDao = catalogDao;
    }

    public ResponseEntity<Catalog> createCatalog(@ApiParam(value = "The Catalog to be created" ,required=true )  @Valid @RequestBody CatalogCreate catalog) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Catalog catalogResponse = modelMapper.map(catalog, Catalog.class);
                catalogDao.save(catalogResponse);
                return new ResponseEntity<Catalog>(catalogResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<String> deleteCatalog(@ApiParam(value = "Identifier of the Catalog",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if(catalogDao.findOne(id) != null){
            catalogDao.delete(id);
            return new ResponseEntity<String>("deleted Successfully", HttpStatus.ACCEPTED);
        }
        return new ResponseEntity<String>("id not found",HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Catalog>> listCatalog(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Catalog>>(catalogDao.findAll(), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Catalog>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Catalog>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Catalog> patchCatalog(@ApiParam(value = "Identifier of the Catalog",required=true) @PathVariable("id") String id,@ApiParam(value = "The Catalog to be updated" ,required=true )  @Valid @RequestBody CatalogUpdate catalog) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                Catalog catalogDb= catalogDao.findOne(id);
                if(Objects.nonNull(catalog.getName())&& !"".equalsIgnoreCase(catalog.getName())){
                    catalogDb.setName(catalog.getName());
                }
                if(Objects.nonNull(catalog.getDescription())&& !"".equalsIgnoreCase(catalog.getDescription())){
                    catalogDb.setDescription(catalog.getDescription());
                }
                if(Objects.nonNull(catalog.getVersion())&& !"".equalsIgnoreCase(catalog.getVersion())){
                    catalogDb.setVersion(catalog.getVersion());
                }
                Catalog catalogResponse = catalogDao.findOne(id);
                catalogDao.save(catalogResponse);
                return new ResponseEntity<Catalog>(catalogResponse, HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Catalog> retrieveCatalog(@ApiParam(value = "Identifier of the Catalog",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Catalog>(catalogDao.findOne(id), HttpStatus.ACCEPTED);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

}
