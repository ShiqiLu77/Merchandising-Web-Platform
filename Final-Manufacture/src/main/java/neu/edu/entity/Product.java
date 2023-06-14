package neu.edu.entity;
// Generated 2022年12月17日 上午12:42:48 by Hibernate Tools 4.3.6.Final

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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Product generated by hbm2java
 */
@Entity
@JsonIgnoreProperties({"manufacture","OrderFromDistributor","ProductFormulation"})
@Table(name = "product", catalog = "manufacture")
public class Product implements java.io.Serializable {

	private Integer id;
	private Manufacture manufacture;
	private String name;
	private String cost;
	private int quantity;
	private String status;
	private Date addedDate;
	private Set<OrderFromDistributor> orderFromDistributors = new HashSet<OrderFromDistributor>(0);
	private Set<ShippingMode> shippingModes = new HashSet<ShippingMode>(0);
	private Set<ProductFormulation> productFormulations = new HashSet<ProductFormulation>(0);

	public Product() {
	}

	public Product(Manufacture manufacture, String name, String cost, int quantity, String status, Date addedDate) {
		this.manufacture = manufacture;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.status = status;
		this.addedDate = addedDate;
	}

	public Product(Manufacture manufacture, String name, String cost, int quantity, String status, Date addedDate,
			Set<OrderFromDistributor> orderFromDistributors, Set<ShippingMode> shippingModes,
			Set<ProductFormulation> productFormulations) {
		this.manufacture = manufacture;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.status = status;
		this.addedDate = addedDate;
		this.orderFromDistributors = orderFromDistributors;
		this.shippingModes = shippingModes;
		this.productFormulations = productFormulations;
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
	@JoinColumn(name = "manufacture_id", nullable = false)
	public Manufacture getManufacture() {
		return this.manufacture;
	}

	public void setManufacture(Manufacture manufacture) {
		this.manufacture = manufacture;
	}

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cost", nullable = false, length = 45)
	public String getCost() {
		return this.cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "status", nullable = false, length = 8)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "added_date", nullable = false, length = 10)
	public Date getAddedDate() {
		return this.addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<OrderFromDistributor> getOrderFromDistributors() {
		return this.orderFromDistributors;
	}

	public void setOrderFromDistributors(Set<OrderFromDistributor> orderFromDistributors) {
		this.orderFromDistributors = orderFromDistributors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<ShippingMode> getShippingModes() {
		return this.shippingModes;
	}

	public void setShippingModes(Set<ShippingMode> shippingModes) {
		this.shippingModes = shippingModes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<ProductFormulation> getProductFormulations() {
		return this.productFormulations;
	}

	public void setProductFormulations(Set<ProductFormulation> productFormulations) {
		this.productFormulations = productFormulations;
	}

}