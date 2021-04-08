package domain.jpa;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SILHOUETTES")
public class SilhouetteImage {
	@Id
	@Column(name = "SILHOUETTEID")
	int silhouetteID;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "TYPE")
	private  int type;

	@Column(name = "INDEX")
	private int index;

	@Column(name = "SILHOUETTE")
	private String image;

	public int getSilhouetteID() {
		return silhouetteID;
	}

	public void setSilhouetteID(int silhouetteID) {
		this.silhouetteID = silhouetteID;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
}


