package neu.edu.entity;
// Generated 2022年12月17日 上午3:40:48 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Location generated by hbm2java
 */
@Entity
@JsonIgnoreProperties({"orderFromCustomers","distributors","shipments","distributorManagers"})
@Table(name = "location", catalog = "distributor", uniqueConstraints = @UniqueConstraint(columnNames = { "city",
		"state", "country" }))
public class Location implements java.io.Serializable {

	private Integer id;
	private String city;
	private String state;
	private String country;
	private Set<OrderFromCustomer> orderFromCustomers = new HashSet<OrderFromCustomer>(0);
	private Set<Distributor> distributors = new HashSet<Distributor>(0);
	private Set<Shipment> shipments = new HashSet<Shipment>(0);
	private Set<DistributorManager> distributorManagers = new HashSet<DistributorManager>(0);

	public Location() {
	}

	public Location(String city, String state, String country) {
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Location(String city, String state, String country, Set<OrderFromCustomer> orderFromCustomers,
			Set<Distributor> distributors, Set<Shipment> shipments, Set<DistributorManager> distributorManagers) {
		this.city = city;
		this.state = state;
		this.country = country;
		this.orderFromCustomers = orderFromCustomers;
		this.distributors = distributors;
		this.shipments = shipments;
		this.distributorManagers = distributorManagers;
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

	@Column(name = "city", nullable = false, length = 45)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "state", nullable = false, length = 45)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "country", nullable = false, length = 45)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<OrderFromCustomer> getOrderFromCustomers() {
		return this.orderFromCustomers;
	}

	public void setOrderFromCustomers(Set<OrderFromCustomer> orderFromCustomers) {
		this.orderFromCustomers = orderFromCustomers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<Distributor> getDistributors() {
		return this.distributors;
	}

	public void setDistributors(Set<Distributor> distributors) {
		this.distributors = distributors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<Shipment> getShipments() {
		return this.shipments;
	}

	public void setShipments(Set<Shipment> shipments) {
		this.shipments = shipments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "location")
	public Set<DistributorManager> getDistributorManagers() {
		return this.distributorManagers;
	}

	public void setDistributorManagers(Set<DistributorManager> distributorManagers) {
		this.distributorManagers = distributorManagers;
	}

}
