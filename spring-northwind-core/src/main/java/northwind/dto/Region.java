package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * Region generated by hbm2java
 */
public class Region implements java.io.Serializable {

	private static final long serialVersionUID = -1559273470954723250L;

	private short regionId;
	private char regionDescription;

	public Region() {
	}

	public Region(short regionId, char regionDescription) {
		this.regionId = regionId;
		this.regionDescription = regionDescription;
	}

	public short getRegionId() {
		return this.regionId;
	}

	public void setRegionId(short regionId) {
		this.regionId = regionId;
	}

	public char getRegionDescription() {
		return this.regionDescription;
	}

	public void setRegionDescription(char regionDescription) {
		this.regionDescription = regionDescription;
	}
}