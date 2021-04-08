package business.service;

import java.awt.print.Pageable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import business.dao.db.SilhouetteBrandConfigDao;
import business.dao.db.SilhouetteImageDao;
import business.dao.db.SilhouetteMappingDao;
import business.dao.integration.marvin.SilhouetteDao;
import core.service.Pci3ServiceImpl;
import domain.Silhouette;
import domain.jpa.SilhouetteBrandConfig;
import domain.jpa.SilhouetteImage;
import domain.jpa.SilhouetteMapping;

/**
 * Business service implementation for working with {@link Silhouette}s.
 */
@Service
public class SilhouetteServiceImpl extends Pci3ServiceImpl implements SilhouetteService {

	@Autowired
	private SilhouetteDao silhouetteDao;
    @Autowired
    private SilhouetteImageDao silhouetteImageDao;
    @Autowired
    private SilhouetteMappingDao silhouetteMappingDao;
	@Autowired
	private SilhouetteBrandConfigDao silhouetteBrandConfigDao;

	@Override
	public List<Silhouette> getSilhouettes(String vin, List<String> sectionCodes) {
		return silhouetteDao.getSilhouettes(vin, sectionCodes);
	}

    @Override
    public List<SilhouetteImage> getSilhouettesPaged(String brand, int page) {
	    Set<Integer> indexes = new HashSet<>(Arrays.asList(0,2));
	    return silhouetteImageDao.findByBrandAndIndexIsInOrderByTypeAscIndexAsc(brand, indexes,new PageRequest(page,20));

    }

    @Override
    public List<SilhouetteImage> getSilhouettes(String brand, int type) {
	    return silhouetteImageDao.findByBrandAndType(brand, type);
    }

	@Override
	public SilhouetteMapping getMapping(String brand, String code) {
		return silhouetteMappingDao.findByBrandAndCode(brand, code);
	}

	@Override
	public SilhouetteBrandConfig getConfig(String brand) {
		return silhouetteBrandConfigDao.findByBrand(brand);
	}
}
