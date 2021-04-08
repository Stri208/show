package full.rest.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import full.rest.model.SilhouetteDto;
import full.rest.model.SilhouetteImageDto;

import javax.validation.constraints.NotNull;


@Api(value = "silhouettes", description = "the silhouettes API")
public interface SilhouettesApi {

    @ApiOperation(value = "For requested sections, provides URLs on silhouettes", notes = "Provides list URLs on silhouettes generated for given vehicle. Silhouettes are generated for list of sections which is provided at input of the service", response = SilhouetteDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "List of silhouettes for given vehicle (VIN)", response = SilhouetteDto.class) })
    @RequestMapping(value = "/silhouettes",
        produces = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<List<SilhouetteDto>> getSilhouettes(@ApiParam(value = "vehicle VIN, used for rendering of silhouettes", required = true) @RequestParam(value = "vin", required = true) String vin,
        @ApiParam(value = "List of sections for which should be the silhouettes rendered", required = true) @RequestParam(value = "section", required = true) List<String> section) {
        // do some magic!
        return new ResponseEntity<List<SilhouetteDto>>(HttpStatus.OK);
    }

    @ApiOperation(value = "For requested sections, provides URLs on silhouettes", notes = "Provides list URLs on silhouettes generated for given vehicle. Silhouettes are generated for list of sections which is provided at input of the service", response = SilhouetteDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of silhouettes for given vehicle (VIN)", response = SilhouetteDto.class) })
    @RequestMapping(value = "/silhouettesPagedPreview",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<List<List<SilhouetteImageDto>>> getSilhouettesPagedPreview(@NotNull @ApiParam(value = "Brand of vehicle", required = true) @RequestParam(value = "brand", required = true) String brand,
                                                                               @NotNull @ApiParam(value = "Zero represents first page with first ten records (pages are indexed from the zero)", required = true) @RequestParam(value = "page", required = true) Integer page) {
        // do some magic!
       return new ResponseEntity<List<List<SilhouetteImageDto>>>(HttpStatus.OK);
    }

    @ApiOperation(value = "Provides images", notes = "Provides list of images", response = SilhouetteDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of silhouettes ", response = SilhouetteDto.class) })
    @RequestMapping(value = "/silhouettesCar",
            produces = { "application/json" },
            method = RequestMethod.GET)
    default ResponseEntity<List<SilhouetteImageDto>> getSilhouettesCar(@NotNull @ApiParam(value = "Brand of vehicle", required = true) @RequestParam(value = "brand", required = true) String brand,
                                                                           @NotNull @ApiParam(value = "Type of vehicle", required = true) @RequestParam(value = "type", required = true) Integer type) {
        // do some magic!
        return new ResponseEntity<List<SilhouetteImageDto>>(HttpStatus.OK);
    }
}
