package test.model.entity;
// Generated 2018/2/4 �U�� 03:34:56 by Hibernate Tools 5.1.6.Final

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Orders generated by hbm2java
 */
@Entity
@Table(name = "orders", catalog = "northwind")
public class Orders implements java.io.Serializable {

	private Integer id;
	private Customers customers;
	private Employees employees;
	private OrdersStatus ordersStatus;
	private OrdersTaxStatus ordersTaxStatus;
	private Shippers shippers;
	private Date orderDate;
	private Date shippedDate;
	private String shipName;
	private String shipAddress;
	private String shipCity;
	private String shipStateProvince;
	private String shipZipPostalCode;
	private String shipCountryRegion;
	private BigDecimal shippingFee;
	private BigDecimal taxes;
	private String paymentType;
	private Date paidDate;
	private String notes;
	private Double taxRate;
	private Set<Invoices> invoiceses = new HashSet<Invoices>(0);
	private Set<InventoryTransactions> inventoryTransactionses = new HashSet<InventoryTransactions>(0);
	private Set<OrderDetails> orderDetailses = new HashSet<OrderDetails>(0);

	public Orders() {
	}

	public Orders(Customers customers, Employees employees, OrdersStatus ordersStatus, OrdersTaxStatus ordersTaxStatus,
			Shippers shippers, Date orderDate, Date shippedDate, String shipName, String shipAddress, String shipCity,
			String shipStateProvince, String shipZipPostalCode, String shipCountryRegion, BigDecimal shippingFee,
			BigDecimal taxes, String paymentType, Date paidDate, String notes, Double taxRate, Set<Invoices> invoiceses,
			Set<InventoryTransactions> inventoryTransactionses, Set<OrderDetails> orderDetailses) {
		this.customers = customers;
		this.employees = employees;
		this.ordersStatus = ordersStatus;
		this.ordersTaxStatus = ordersTaxStatus;
		this.shippers = shippers;
		this.orderDate = orderDate;
		this.shippedDate = shippedDate;
		this.shipName = shipName;
		this.shipAddress = shipAddress;
		this.shipCity = shipCity;
		this.shipStateProvince = shipStateProvince;
		this.shipZipPostalCode = shipZipPostalCode;
		this.shipCountryRegion = shipCountryRegion;
		this.shippingFee = shippingFee;
		this.taxes = taxes;
		this.paymentType = paymentType;
		this.paidDate = paidDate;
		this.notes = notes;
		this.taxRate = taxRate;
		this.invoiceses = invoiceses;
		this.inventoryTransactionses = inventoryTransactionses;
		this.orderDetailses = orderDetailses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customer_id")
	public Customers getCustomers() {
		return this.customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employee_id")
	public Employees getEmployees() {
		return this.employees;
	}

	public void setEmployees(Employees employees) {
		this.employees = employees;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "status_id")
	public OrdersStatus getOrdersStatus() {
		return this.ordersStatus;
	}

	public void setOrdersStatus(OrdersStatus ordersStatus) {
		this.ordersStatus = ordersStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tax_status_id")
	public OrdersTaxStatus getOrdersTaxStatus() {
		return this.ordersTaxStatus;
	}

	public void setOrdersTaxStatus(OrdersTaxStatus ordersTaxStatus) {
		this.ordersTaxStatus = ordersTaxStatus;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "shipper_id")
	public Shippers getShippers() {
		return this.shippers;
	}

	public void setShippers(Shippers shippers) {
		this.shippers = shippers;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "shipped_date", length = 19)
	public Date getShippedDate() {
		return this.shippedDate;
	}

	public void setShippedDate(Date shippedDate) {
		this.shippedDate = shippedDate;
	}

	@Column(name = "ship_name", length = 50)
	public String getShipName() {
		return this.shipName;
	}

	public void setShipName(String shipName) {
		this.shipName = shipName;
	}

	@Column(name = "ship_address")
	public String getShipAddress() {
		return this.shipAddress;
	}

	public void setShipAddress(String shipAddress) {
		this.shipAddress = shipAddress;
	}

	@Column(name = "ship_city", length = 50)
	public String getShipCity() {
		return this.shipCity;
	}

	public void setShipCity(String shipCity) {
		this.shipCity = shipCity;
	}

	@Column(name = "ship_state_province", length = 50)
	public String getShipStateProvince() {
		return this.shipStateProvince;
	}

	public void setShipStateProvince(String shipStateProvince) {
		this.shipStateProvince = shipStateProvince;
	}

	@Column(name = "ship_zip_postal_code", length = 50)
	public String getShipZipPostalCode() {
		return this.shipZipPostalCode;
	}

	public void setShipZipPostalCode(String shipZipPostalCode) {
		this.shipZipPostalCode = shipZipPostalCode;
	}

	@Column(name = "ship_country_region", length = 50)
	public String getShipCountryRegion() {
		return this.shipCountryRegion;
	}

	public void setShipCountryRegion(String shipCountryRegion) {
		this.shipCountryRegion = shipCountryRegion;
	}

	@Column(name = "shipping_fee", scale = 4)
	public BigDecimal getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(BigDecimal shippingFee) {
		this.shippingFee = shippingFee;
	}

	@Column(name = "taxes", scale = 4)
	public BigDecimal getTaxes() {
		return this.taxes;
	}

	public void setTaxes(BigDecimal taxes) {
		this.taxes = taxes;
	}

	@Column(name = "payment_type", length = 50)
	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "paid_date", length = 19)
	public Date getPaidDate() {
		return this.paidDate;
	}

	public void setPaidDate(Date paidDate) {
		this.paidDate = paidDate;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "tax_rate", precision = 22, scale = 0)
	public Double getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<Invoices> getInvoiceses() {
		return this.invoiceses;
	}

	public void setInvoiceses(Set<Invoices> invoiceses) {
		this.invoiceses = invoiceses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<InventoryTransactions> getInventoryTransactionses() {
		return this.inventoryTransactionses;
	}

	public void setInventoryTransactionses(Set<InventoryTransactions> inventoryTransactionses) {
		this.inventoryTransactionses = inventoryTransactionses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "orders")
	public Set<OrderDetails> getOrderDetailses() {
		return this.orderDetailses;
	}

	public void setOrderDetailses(Set<OrderDetails> orderDetailses) {
		this.orderDetailses = orderDetailses;
	}

}
