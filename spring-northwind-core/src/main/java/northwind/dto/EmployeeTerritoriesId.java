package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * EmployeeTerritoriesId generated by hbm2java
 */
public class EmployeeTerritoriesId implements java.io.Serializable {

	private static final long serialVersionUID = 6754827640231222262L;

	private short employeeId;
	private String territoryId;

	public EmployeeTerritoriesId() {
	}

	public EmployeeTerritoriesId(short employeeId, String territoryId) {
		this.employeeId = employeeId;
		this.territoryId = territoryId;
	}

	public short getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(short employeeId) {
		this.employeeId = employeeId;
	}

	public String getTerritoryId() {
		return this.territoryId;
	}

	public void setTerritoryId(String territoryId) {
		this.territoryId = territoryId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmployeeTerritoriesId))
			return false;
		EmployeeTerritoriesId castOther = (EmployeeTerritoriesId) other;

		return (this.getEmployeeId() == castOther.getEmployeeId())
				&& ((this.getTerritoryId() == castOther.getTerritoryId())
						|| (this.getTerritoryId() != null && castOther.getTerritoryId() != null
								&& this.getTerritoryId().equals(castOther.getTerritoryId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getEmployeeId();
		result = 37 * result + (getTerritoryId() == null ? 0 : this.getTerritoryId().hashCode());
		return result;
	}
}