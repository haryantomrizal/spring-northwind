package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * CustomerDemographics generated by hbm2java
 */
public class CustomerDemographics implements java.io.Serializable {

	private static final long serialVersionUID = 5118759435668061069L;

	private char customerTypeId;
	private String customerDesc;

	public CustomerDemographics() {
	}

	public CustomerDemographics(char customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public CustomerDemographics(char customerTypeId, String customerDesc) {
		this.customerTypeId = customerTypeId;
		this.customerDesc = customerDesc;
	}

	public char getCustomerTypeId() {
		return this.customerTypeId;
	}

	public void setCustomerTypeId(char customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public String getCustomerDesc() {
		return this.customerDesc;
	}

	public void setCustomerDesc(String customerDesc) {
		this.customerDesc = customerDesc;
	}
}