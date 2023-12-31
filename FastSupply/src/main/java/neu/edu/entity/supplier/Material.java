package neu.edu.entity.supplier;
// Generated 2022年12月16日 上午3:37:45 by Hibernate Tools 4.3.6.Final

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
 * Material generated by hbm2java
 */
@Entity
@Table(name = "material", catalog = "supplier")
public class Material implements java.io.Serializable {

	private Integer id;
	private Supplier supplier;
	private String name;
	private String cost;
	private int quantity;
	private String status;
	private Date addedDate;
	private Set<ShippingMode> shippingModes = new HashSet<ShippingMode>(0);

	public Material() {
	}

	public Material(Supplier supplier, String name, String cost, int quantity, String status, Date addedDate) {
		this.supplier = supplier;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.status = status;
		this.addedDate = addedDate;
	}

	public Material(Supplier supplier, String name, String cost, int quantity, String status, Date addedDate,
			Set<ShippingMode> shippingModes) {
		this.supplier = supplier;
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
		this.status = status;
		this.addedDate = addedDate;
		this.shippingModes = shippingModes;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "material")
	public Set<ShippingMode> getShippingModes() {
		return this.shippingModes;
	}

	public void setShippingModes(Set<ShippingMode> shippingModes) {
		this.shippingModes = shippingModes;
	}

}
