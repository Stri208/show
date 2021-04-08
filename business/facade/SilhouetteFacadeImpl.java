package business.facade;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Service;

import business.service.SilhouetteService;
import domain.jpa.Silhouette;
import domain.jpa.Role;
import domain.jpa.SilhouetteBrandConfig;
import domain.jpa.SilhouetteImage;
import domain.jpa.SilhouetteMapping;

/**
 * Facade service implementation for working with {@link Silhouette}s.
 *
 */
@Service
public class SilhouetteFacadeImpl extends Pci3FacadeImpl implements SilhouetteFacade {

	@Autowired
	private SilhouetteService silhouetteService;

	@Override
	@Secured(Role.MOBILE_USER)
	public List<Silhouette> getSilhouettes(String vin, List<String> sectionCodes) {
		return silhouetteService.getSilhouettes(vin, sectionCodes);
	}

	@Override
	@Secured(Role.MOBILE_USER)
	public List<SilhouetteImage> getSilhouettesPaged(String brand, int page) {
		return silhouetteService.getSilhouettesPaged(brand,  page);
	}

	@Override
	@Secured(Role.MOBILE_USER)
	public List<SilhouetteImage> getSilhouettes(String brand, int type) {
		return silhouetteService.getSilhouettes(brand, type);
	}

	@Override
	@Secured(Role.MOBILE_USER)
	public SilhouetteMapping getMapping(String brand, String code) {
		return silhouetteService.getMapping(brand, code);
	}

	@Override
	@Secured(Role.MOBILE_USER)
	public SilhouetteBrandConfig getBrandConfig(String brand) {
		return silhouetteService.getConfig(brand);
	}
}
