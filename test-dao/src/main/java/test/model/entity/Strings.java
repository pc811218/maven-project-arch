package test.model.entity;
// Generated 2018/2/4 �U�� 03:34:56 by Hibernate Tools 5.1.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Strings generated by hbm2java
 */
@Entity
@Table(name = "strings", catalog = "northwind")
public class Strings implements java.io.Serializable {

	private Integer stringId;
	private String stringData;

	public Strings() {
	}

	public Strings(String stringData) {
		this.stringData = stringData;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "string_id", unique = true, nullable = false)
	public Integer getStringId() {
		return this.stringId;
	}

	public void setStringId(Integer stringId) {
		this.stringId = stringId;
	}

	@Column(name = "string_data")
	public String getStringData() {
		return this.stringData;
	}

	public void setStringData(String stringData) {
		this.stringData = stringData;
	}

}
