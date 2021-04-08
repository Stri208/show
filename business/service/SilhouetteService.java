package business.service;

import java.util.List;

import domain.jpa.Silhouette;
import domain.jpa.SilhouetteBrandConfig;
import domain.jpa.SilhouetteImage;
import domain.jpa.SilhouetteMapping;

/**
 * Business service for working with {@link Silhouette}s.
 *
 */
public interface SilhouetteService {

	/**
	 * Retrieves {@link Silhouette}s based on a vin and section codes.
	 * @param vin Vin
	 * @param sectionCodes Section codes
	 * @return Collection of {@link Silhouette}s
	 */
	List<Silhouette> getSilhouettes(String vin, List<String> sectionCodes);

	/**
	 * Retrieves {@link Silhouette}s based on a brand, type and page.
	 * @param brand Brand of vehicle
	 * @param page Zero represents first page with first ten records (pages are indexed from the zero).  Return only 10 results on one page
	 * @return Collection of {@link Silhouette}s
	 */
	List<SilhouetteImage> getSilhouettesPaged(String brand, int page);

	/**
	 * Retrieves {@link Silhouette}s based on a brand, type and page.
	 * @param brand Brand of vehicle
	 * @param type Type of vehicle
	 * @return Collection of {@link Silhouette}s
	 */
	List<SilhouetteImage> getSilhouettes(String brand, int type);

	SilhouetteMapping getMapping(String brand, String code);

	SilhouetteBrandConfig getConfig(String brand);
}
