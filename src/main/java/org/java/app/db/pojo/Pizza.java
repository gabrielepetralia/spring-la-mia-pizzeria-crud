package org.java.app.db.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pizza {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false, unique = true)
	private String name;
	
	private String description;
	private String imgUrl;
	private double price;
	
	public Pizza() { }
	
	public Pizza(String name, String description, String imgUrl, double price) {
		setName(name);
		setDescription(description);
		setImgUrl(imgUrl);
		setPrice(price);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String img) {
		this.imgUrl = img;
	}

	public double getPrice() {
		return price;
	}
	
	public String getFormattedPrice() {
		return String.format("%.2f", price);
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
