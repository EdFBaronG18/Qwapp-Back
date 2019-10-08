package entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "product_id")
	private Long id;
	
	@Column(nullable = false)
	@Length(min = 4) 
	private String name;
	
	@Column
	private String description;
	
	@Column(nullable = false)
	private Date creation_date;
	
	@ManyToOne
	@JsonIgnore
	private User owner;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(
		name = "product_category",
		joinColumns = {@JoinColumn (name = "product_id")},
		inverseJoinColumns = {@JoinColumn(name = "category_id")}
		)
	Set<Category> categories = new HashSet<>();
	
	//******************************************************************************

	public Product() {}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Date getCreation_date() {
		return creation_date;
	}


	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}


	public Long getId() {
		return id;
	}
	
	
	

}
