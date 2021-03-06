package com.cognizant.truyum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="cart")
public class Cart {	
	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 * @Column helps in defining the mapping table column
	 * 
	 */
	@Id
	@Column(name="ct_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn(name="ct_us_id")
	private User user;
	@ManyToOne
	@JoinColumn(name="ct_pr_id")
	private MenuItem menuItem;
	/**
	 * getters and setters
	 *
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
}