package neu.edu.entity;
// Generated 2022年12月17日 上午3:40:48 by Hibernate Tools 4.3.6.Final

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
@JsonIgnoreProperties({"distributor"})
@Table(name = "shipment", catalog = "distributor", uniqueConstraints = @UniqueConstraint(columnNames = {
		"distributor_id", "customer_location_id" }))
public class Shipment implements java.io.Serializable {

	private Integer id;
	private Distributor distributor;
	private Location location;
	private float shippingFee;
	private int standardShippingTime;

	public Shipment() {
	}

	public Shipment(Distributor distributor, Location location, float shippingFee, int standardShippingTime) {
		this.distributor = distributor;
		this.location = location;
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
	@JoinColumn(name = "distributor_id", nullable = false)
	public Distributor getDistributor() {
		return this.distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_location_id", nullable = false)
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
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
