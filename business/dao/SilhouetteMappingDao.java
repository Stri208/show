package business.dao.db;

import org.springframework.data.jpa.repository.JpaRepository;
import domain.jpa.SilhouetteMapping;

public interface SilhouetteMappingDao extends JpaRepository<SilhouetteMapping, String> {

	SilhouetteMapping findByBrandAndCode(String brand, String code);
}
