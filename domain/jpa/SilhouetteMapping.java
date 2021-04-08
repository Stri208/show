package domain.jpa;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SILHOUETTE_MAPPING")
public class SilhouetteMapping {
	@Id
	@Column(name = "SILHOUETTE_MAP_ID")
	int silhouette_map_id;

	@Column(name = "BRAND")
	String brand;

	@Column(name = "CODE")
	String code;

	@Column(name = "TYPE")
	int type;

	public int getSilhouette_map_id() {
		return silhouette_map_id;
	}

	public void setSilhouette_map_id(int silhouette_map_id) {
		this.silhouette_map_id = silhouette_map_id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}
}
