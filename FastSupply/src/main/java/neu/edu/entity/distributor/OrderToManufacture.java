package neu.edu.entity.distributor;
// Generated 2022年12月17日 上午3:40:48 by Hibernate Tools 4.3.6.Final

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
 * OrderToManufacture generated by hbm2java
 */
@Entity
@Table(name = "order_to_manufacture", catalog = "distributor")
public class OrderToManufacture implements java.io.Serializable {

	private Integer id;
	private Distributor distributor;
	private int productFromManufactureId;
	private int quantity;
	private Date orderDate;
	private String status;

	public OrderToManufacture() {
	}

	public OrderToManufacture(Distributor distributor, int productFromManufactureId, int quantity, Date orderDate,
			String status) {
		this.distributor = distributor;
		this.productFromManufactureId = productFromManufactureId;
		this.quantity = quantity;
		this.orderDate = orderDate;
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
	@JoinColumn(name = "distributor_id", nullable = false)
	public Distributor getDistributor() {
		return this.distributor;
	}

	public void setDistributor(Distributor distributor) {
		this.distributor = distributor;
	}

	@Column(name = "product_from_manufacture_id", nullable = false)
	public int getProductFromManufactureId() {
		return this.productFromManufactureId;
	}

	public void setProductFromManufactureId(int productFromManufactureId) {
		this.productFromManufactureId = productFromManufactureId;
	}

	@Column(name = "quantity", nullable = false)
	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "order_date", nullable = false, length = 19)
	public Date getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	@Column(name = "status", nullable = false, length = 9)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
