package test.model.entity;
// Generated 2018/2/4 �U�� 03:34:56 by Hibernate Tools 5.1.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * OrdersTaxStatus generated by hbm2java
 */
@Entity
@Table(name = "orders_tax_status", catalog = "northwind")
public class OrdersTaxStatus implements java.io.Serializable {

	private byte id;
	private String taxStatusName;
	private Set<Orders> orderses = new HashSet<Orders>(0);

	public OrdersTaxStatus() {
	}

	public OrdersTaxStatus(byte id, String taxStatusName) {
		this.id = id;
		this.taxStatusName = taxStatusName;
	}

	public OrdersTaxStatus(byte id, String taxStatusName, Set<Orders> orderses) {
		this.id = id;
		this.taxStatusName = taxStatusName;
		this.orderses = orderses;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	@Column(name = "tax_status_name", nullable = false, length = 50)
	public String getTaxStatusName() {
		return this.taxStatusName;
	}

	public void setTaxStatusName(String taxStatusName) {
		this.taxStatusName = taxStatusName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ordersTaxStatus")
	public Set<Orders> getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set<Orders> orderses) {
		this.orderses = orderses;
	}

}