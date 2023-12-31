package neu.edu.entity;
// Generated 2022年12月17日 上午12:42:48 by Hibernate Tools 4.3.6.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * OrderFromDistributor generated by hbm2java
 */
@Entity
@Table(name = "order_from_distributor", catalog = "manufacture")
public class OrderFromDistributor implements java.io.Serializable {

	private Integer id;
	private Location location;
	private Product product;
	private int distributorId;
	private String distributorName;
	private String distributorAddress;
	private int quantity;
	private int cost;
	private String shippingWay;
	private float shippingFee;
	private Date orderTime;
	private String status;

	public OrderFromDistributor() {
	}

	public OrderFromDistributor(Location location, Product product, int distributorId, String distributorAddress,
			int quantity, int cost, String shippingWay, float shippingFee, Date orderTime, String status) {
		this.location = location;
		this.product = product;
		this.distributorId = distributorId;
		this.distributorAddress = distributorAddress;
		this.quantity = quantity;
		this.cost = cost;
		this.shippingWay = shippingWay;
		this.shippingFee = shippingFee;
		this.orderTime = orderTime;
		this.status = status;
	}

	public OrderFromDistributor(Location location, Product product, int distributorId, String distributorName,
			String distributorAddress, int quantity, int cost, String shippingWay, float shippingFee, Date orderTime,
			String status) {
		this.location = location;
		this.product = product;
		this.distributorId = distributorId;
		this.distributorName = distributorName;
		this.distributorAddress = distributorAddress;
		this.quantity = quantity;
		this.cost = cost;
		this.shippingWay = shippingWay;
		this.shippingFee = shippingFee;
		this.orderTime = orderTime;
		this.status = status;
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
	@JoinColumn(name = "distributor_location_id", nullable = false)
	public Location getLocation() {
		return this.location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "distributor_id", nullable = false)
	public int getDistributorId() {
		return this.distributorId;
	}

	public void setDistributorId(int distributorId) {
		this.distributorId = distributorId;
	}

	@Column(name = "distributor_name", length = 45)
	public String getDistributorName() {
		return this.distributorName;
	}

	public void setDistributorName(String distributorName) {
		this.distributorName = distributorName;
	}

	@Column(name = "distributor_address", nullable = false, length = 45)
	public String getDistributorAddress() {
		return this.distributorAddress;
	}

	public void setDistributorAddress(String distributorAddress) {
		this.distributorAddress = distributorAddress;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name = "cost", nullable = false)
	public int getCost() {
		return this.cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Column(name = "shipping_way", nullable = false, length = 4)
	public String getShippingWay() {
		return this.shippingWay;
	}

	public void setShippingWay(String shippingWay) {
		this.shippingWay = shippingWay;
	}

	@Column(name = "shipping_fee", nullable = false, precision = 12, scale = 0)
	public float getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(float shippingFee) {
		this.shippingFee = shippingFee;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_time", nullable = false, length = 19)
	public Date getOrderTime() {
		return this.orderTime;
	}

	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}

	@Column(name = "status", nullable = false, length = 9)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
