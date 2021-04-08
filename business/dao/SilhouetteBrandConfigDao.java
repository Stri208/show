package business.dao.db;

import org.springframework.data.jpa.repository.JpaRepository;
import domain.jpa.SilhouetteBrandConfig;

public interface SilhouetteBrandConfigDao extends JpaRepository<SilhouetteBrandConfig, String> {

	SilhouetteBrandConfig findByBrand(String Brand);
}
