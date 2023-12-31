package neu.edu.entity.supplier;
// Generated 2022年12月16日 上午3:37:45 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Supplier generated by hbm2java
 */
@Entity
@Table(name = "supplier", catalog = "supplier")
public class Supplier implements java.io.Serializable {

	private Integer id;
	private String name;
	private String phone;
	private String email;
	private String address;
	private int locationId;
	private String description;
	private Set<Material> materials = new HashSet<Material>(0);
	private SupplyChainIssue supplyChainIssue;
	private Set<Shipment> shipments = new HashSet<Shipment>(0);
	private Set<SupplierManager> supplierManagers = new HashSet<SupplierManager>(0);

	public Supplier() {
	}

	public Supplier(String name, String phone, String email, String address, int locationId) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.locationId = locationId;
	}

	public Supplier(String name, String phone, String email, String address, int locationId, String description,
			Set<Material> materials, SupplyChainIssue supplyChainIssue, Set<Shipment> shipments,
			Set<SupplierManager> supplierManagers) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.locationId = locationId;
		this.description = description;
		this.materials = materials;
		this.supplyChainIssue = supplyChainIssue;
		this.shipments = shipments;
		this.supplierManagers = supplierManagers;
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

	@Column(name = "name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "phone", nullable = false, length = 10)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email", nullable = false, length = 20)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "address", nullable = false, length = 45)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "location_id", nullable = false)
	public int getLocationId() {
		return this.locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	@Column(name = "description", length = 45)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
	public Set<Material> getMaterials() {
		return this.materials;
	}

	public void setMaterials(Set<Material> materials) {
		this.materials = materials;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "supplier")
	public SupplyChainIssue getSupplyChainIssue() {
		return this.supplyChainIssue;
	}

	public void setSupplyChainIssue(SupplyChainIssue supplyChainIssue) {
		this.supplyChainIssue = supplyChainIssue;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
	public Set<Shipment> getShipments() {
		return this.shipments;
	}

	public void setShipments(Set<Shipment> shipments) {
		this.shipments = shipments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "supplier")
	public Set<SupplierManager> getSupplierManagers() {
		return this.supplierManagers;
	}

	public void setSupplierManagers(Set<SupplierManager> supplierManagers) {
		this.supplierManagers = supplierManagers;
	}

}
