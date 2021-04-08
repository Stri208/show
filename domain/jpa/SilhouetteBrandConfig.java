package domain.jpa;

import javax.persistence.*;

@Entity
@Table(name = "Brand_Silhouette_Config")
public class SilhouetteBrandConfig {

	@Id
	@Column(name = "SBCONFIG_ID")
	int silhouetteID;

	@Column(name = "BRAND")
	private String brand;

	@Column(name = "BEGIN_INDEX")
	private  int beginIndex;

	@Column(name = "END_INDEX")
	private int endIndex;

	@Column(name = "STATE")
	private boolean state;

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

	public int getBeginIndex() {
		return beginIndex;
	}

	public void setBeginIndex(int beginIndex) {
		this.beginIndex = beginIndex;
	}

	public int getEndIndex() {
		return endIndex;
	}

	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}
}
