package neu.edu.entity;
// Generated 2022年12月17日 上午12:41:39 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Shipment generated by hbm2java
 */
@Entity
@JsonIgnoreProperties({"supplier"})
@Table(name = "shipment", catalog = "supplier", uniqueConstraints = @UniqueConstraint(columnNames = { "supplier_id",
		"manufacture_id" }))
public class Shipment implements java.io.Serializable {

	private Integer id;
	private Supplier supplier;
	private int manufactureId;
	private float shippingFee;
	private int standardShippingTime;

	public Shipment() {
	}

	public Shipment(Supplier supplier, int manufactureId, float shippingFee, int standardShippingTime) {
		this.supplier = supplier;
		this.manufactureId = manufactureId;
		this.shippingFee = shippingFee;
		this.standardShippingTime = standardShippingTime;
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
	@JoinColumn(name = "supplier_id", nullable = false)
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Column(name = "manufacture_id", nullable = false)
	public int getManufactureId() {
		return this.manufactureId;
	}

	public void setManufactureId(int manufactureId) {
		this.manufactureId = manufactureId;
	}

	@Column(name = "shipping_fee", nullable = false, precision = 12, scale = 0)
	public float getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(float shippingFee) {
		this.shippingFee = shippingFee;
	}

	@Column(name = "standard_shipping_time", nullable = false)
	public int getStandardShippingTime() {
		return this.standardShippingTime;
	}

	public void setStandardShippingTime(int standardShippingTime) {
		this.standardShippingTime = standardShippingTime;
	}

}
