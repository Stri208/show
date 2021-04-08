package full.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import business.facade.SilhouetteFacade;
import domain.jpa.Silhouette;
import domain.jpa.SilhouetteImage;
import full.rest.converter.SilhouetteConverter;
import full.rest.model.SilhouetteDto;
import full.rest.model.SilhouetteImageDto;

@RestController("fullSilhouettesApiController")
public class SilhouettesApiController extends Pci3FullController implements SilhouettesApi {

	@Autowired
	private SilhouetteFacade silhouetteFacade;
	@Autowired
	private SilhouetteConverter silhouetteConverter;

	@Override
	public ResponseEntity<List<SilhouetteDto>> getSilhouettes(@RequestParam(value = "vin", required = true) String vin,
			@RequestParam(value = "section", required = true) List<String> sectionCodes) {
		List<Silhouette> result = silhouetteFacade.getSilhouettes(vin, sectionCodes);
		return new ResponseEntity<List<SilhouetteDto>>(silhouetteConverter.fromDomain(result), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<List<SilhouetteImageDto>>> getSilhouettesPagedPreview(String brand, Integer page) {
		List<SilhouetteImage> images = silhouetteFacade.getSilhouettesPaged(brand, page);
		return new ResponseEntity<List<List<SilhouetteImageDto>>>(silhouetteConverter.fromDomains(images), HttpStatus.OK);

	}

	@Override
	public ResponseEntity<List<SilhouetteImageDto>> getSilhouettesCar(String brand, Integer type) {
		List<SilhouetteImage> result = silhouetteFacade.getSilhouettes(brand, type);
		return new ResponseEntity<List<SilhouetteImageDto>>(silhouetteConverter.fromDomain(result), HttpStatus.OK);
	}
}
