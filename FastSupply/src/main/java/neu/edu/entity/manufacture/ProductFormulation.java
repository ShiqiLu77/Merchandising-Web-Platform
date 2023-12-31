package neu.edu.entity.manufacture;
// Generated 2022年12月17日 上午12:42:48 by Hibernate Tools 4.3.6.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ProductFormulation generated by hbm2java
 */
@Entity
@Table(name = "product_formulation", catalog = "manufacture")
public class ProductFormulation implements java.io.Serializable {

	private Integer id;
	private Product product;
	private int rawMaterialId;
	private int rawMaterialQuantity;

	public ProductFormulation() {
	}

	public ProductFormulation(Product product, int rawMaterialId, int rawMaterialQuantity) {
		this.product = product;
		this.rawMaterialId = rawMaterialId;
		this.rawMaterialQuantity = rawMaterialQuantity;
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
	@JoinColumn(name = "product_id", nullable = false)
	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Column(name = "raw_material_id", nullable = false)
	public int getRawMaterialId() {
		return this.rawMaterialId;
	}

	public void setRawMaterialId(int rawMaterialId) {
		this.rawMaterialId = rawMaterialId;
	}

	@Column(name = "raw_material_quantity", nullable = false)
	public int getRawMaterialQuantity() {
		return this.rawMaterialQuantity;
	}

	public void setRawMaterialQuantity(int rawMaterialQuantity) {
		this.rawMaterialQuantity = rawMaterialQuantity;
	}

}
