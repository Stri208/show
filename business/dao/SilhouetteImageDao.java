package business.dao.db;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import domain.jpa.SilhouetteImage;

import java.util.List;
import java.util.Set;


public interface SilhouetteImageDao extends JpaRepository<SilhouetteImage, String> {

	List<SilhouetteImage> findByBrandAndType(String brand,int type);

	List<SilhouetteImage> findByBrandAndIndexIsInOrderByTypeAscIndexAsc(String brand, Set<Integer> ids, Pageable pageable);

}
