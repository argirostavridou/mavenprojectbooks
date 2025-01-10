package com.example.demo.all;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
// prepei pleon na vazw empty constructors, den peirazei na exw duo constructors
@Entity
@Table(name = "theme")
public class Theme {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	// @JsonIgnore
	@Column(name = "theme_id", nullable = false)
	private Integer id;
	
	@Column(name = "name", nullable = false)
	private String name;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@ManyToMany (mappedBy = "themes")
	@JsonIgnore
	private Set<Book> books;
	
	public Theme(int id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
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
	@Override
	public String toString() {
		return "Theme [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
    
}
