package northwind.dto;
// Generated Jan 22, 2016 12:15:57 AM by Hibernate Tools 4.0.0

import java.util.Date;

/**
 * Orders generated by hbm2java
 */
public class Orders implements java.io.Serializable {

	private static final long serialVersionUID = 586675952348443675L;

	private short orderId;
	private Character customerId;
	private Short employeeId;
	private Date orderDate;
	private Date requiredDate;
	private Date shippedDate;
	private Short shipVia;
	private Float freight;
	private String shipName;
	private String shipAddress;
	private String shipCity;
	private String shipRegion;
	private String shipPostalCode;
	private String shipCountry;

	public Orders() {
	}

	public Orders(short orderId) {
		this.orderId = orderId;
	}

	public Orders(short orderId, Character customerId, Short employeeId, Date orderDate, Date requiredDate,
			Date shippedDate, Short shipVia, Float freight, String shipName, String shipAddress, String shipCity,
			String shipRegion, String shipPostalCode, String shipCountry) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.employeeId = employeeId;
		this.orderDate = orderDate;
		this.requiredDate = requiredDate;
		this.shippedDate = shippedDate;
		this.shipVia = shipVia;
		this.freight = freight;
		this.shipName = shipName;
		this.shipAddress = shipAddress;
		this.shipCity = shipCity;
		this.shipRegion = shipRegion;
		this.shipPostalCode = shipPostalCode;
		this.shipCountry = shipCountry;
	}

	public short getOrderId() {
		return this.orderId;
	}

	public void setOrderId(short orderId) {
		this.orderId = orderId;
	}

	public Character getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Character customerId) {
		this.customerId = customerId;
	}

	public Short getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(Short employeeId) {
		this.employeeId = employeeId;
	}

	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getRequiredDate() {
		return this.requiredDate;
	}

	public void setRequiredDate(Date requiredDate) {
		this.requiredDate = requiredDate;
	}

	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	public Short getShipVia() {
		return this.shipVia;
	}

	public void setShipVia(Short shipVia) {
		this.shipVia = shipVia;
	}

	public Float getFreight() {
		return this.freight;
	}

	public void setFreight(Float freight) {
		this.freight = freight;
	}

	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	public String getShipAddress() {
		return this.shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	public String getShipCity() {
		return this.shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	public String getShipRegion() {
		return this.shipRegion;
	}

	public void setShipRegion(String shipRegion) {
		this.shipRegion = shipRegion;
	}

	public String getShipPostalCode() {
		return this.shipPostalCode;
	}

	public void setShipPostalCode(String shipPostalCode) {
		this.shipPostalCode = shipPostalCode;
	}

	public String getShipCountry() {
		return this.shipCountry;
	}

	public void setShipCountry(String shipCountry) {
		this.shipCountry = shipCountry;
	}
}