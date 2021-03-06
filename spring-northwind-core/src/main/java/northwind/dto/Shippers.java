package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * Shippers generated by hbm2java
 */
public class Shippers implements java.io.Serializable {

	private static final long serialVersionUID = -6025527189042321001L;

	private short shipperId;
	private String companyName;
	private String phone;

	public Shippers() {
	}

	public Shippers(short shipperId, String companyName) {
		this.shipperId = shipperId;
		this.companyName = companyName;
	}

	public Shippers(short shipperId, String companyName, String phone) {
		this.shipperId = shipperId;
		this.companyName = companyName;
		this.phone = phone;
	}

	public short getShipperId() {
		return this.shipperId;
	}

	public void setShipperId(short shipperId) {
		this.shipperId = shipperId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}