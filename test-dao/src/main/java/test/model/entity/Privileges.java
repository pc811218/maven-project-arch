package test.model.entity;
// Generated 2018/2/4 �U�� 03:34:56 by Hibernate Tools 5.1.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Privileges generated by hbm2java
 */
@Entity
@Table(name = "privileges", catalog = "northwind")
public class Privileges implements java.io.Serializable {

	private Integer id;
	private String privilegeName;
	private Set<Employees> employeeses = new HashSet<Employees>(0);

	public Privileges() {
	}

	public Privileges(String privilegeName, Set<Employees> employeeses) {
		this.privilegeName = privilegeName;
		this.employeeses = employeeses;
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

	@Column(name = "privilege_name", length = 50)
	public String getPrivilegeName() {
		return this.privilegeName;
	}

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "employee_privileges", catalog = "northwind", joinColumns = {
			@JoinColumn(name = "privilege_id", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "employee_id", nullable = false, updatable = false) })
	public Set<Employees> getEmployeeses() {
		return this.employeeses;
	}

	public void setEmployeeses(Set<Employees> employeeses) {
		this.employeeses = employeeses;
	}

}
