package com.cognizant.truyum.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author AKSHITA SRIVASTAVA
 * entity class for menu item
 * @Entity indicates Spring Data JPA that it is an entity class for the
 *         application
 * @Table helps in defining the mapping database table 
 *
 */
@Entity
@Table(name="user")
public class User {
	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 * @Column helps in defining the mapping table column
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="us_id")
	private int userId;
	@Column(name="us_name")
	private String name;
	@OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
	private List<Cart> carts;
	/**
	 * getters and setters
	 *
	 */
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
}