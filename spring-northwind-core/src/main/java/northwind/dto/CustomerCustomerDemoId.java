package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

/**
 * CustomercustomerdemoId generated by hbm2java
 */
public class CustomerCustomerDemoId implements java.io.Serializable {

	private static final long serialVersionUID = 1099947457564217789L;

	private char customerId;
	private char customerTypeId;

	public CustomerCustomerDemoId() {
	}

	public CustomerCustomerDemoId(char customerId, char customerTypeId) {
		this.customerId = customerId;
		this.customerTypeId = customerTypeId;
	}

	public char getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(char customerId) {
		this.customerId = customerId;
	}

	public char getCustomerTypeId() {
		return this.customerTypeId;
	}

	public void setCustomerTypeId(char customerTypeId) {
		this.customerTypeId = customerTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CustomerCustomerDemoId))
			return false;
		CustomerCustomerDemoId castOther = (CustomerCustomerDemoId) other;

		return (this.getCustomerId() == castOther.getCustomerId())
				&& (this.getCustomerTypeId() == castOther.getCustomerTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCustomerId();
		result = 37 * result + this.getCustomerTypeId();
		return result;
	}
}