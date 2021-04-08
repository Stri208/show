package business.facade;

import java.util.List;

import domain.jpa.Silhouette;
import domain.jpa.SilhouetteBrandConfig;
import domain.jpa.SilhouetteImage;
import domain.jpa.SilhouetteMapping;

/**
 * Facade service for working with {@link Silhouette}s.
 */
 
public interface SilhouetteFacade {

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

	SilhouetteBrandConfig getBrandConfig(String brand);
}