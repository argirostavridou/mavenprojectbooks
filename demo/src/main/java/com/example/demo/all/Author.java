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

@Entity
@Table(name = "author")
public class Author {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "author_id", nullable = false)
	 private Integer id;
	 
	 @Column(name = "first_name", nullable = false)
	 private String firstName1;

	 @Column(name = "last_name", nullable = false)
	  private String lastName1;

	 @Column(name = "date_of_birth")
	  private String dateOfBirth1;

	 @ManyToMany(mappedBy = "authors")
	 @JsonIgnore
	 private Set<Book> books;

	 // Κενός constructor για JPA
	 public Author() {}
	 
	 
     public Author(int id, String firstName, String lastName, String dateOfBirth) {
		super();
		this.id = id;
		this.firstName1 = firstName;
		this.lastName1 = lastName;
		this.dateOfBirth1 = dateOfBirth;
	}
	public String firstName;
    public String lastName;
    public String dateOfBirth;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName1;
	}
	public void setFirstName(String firstName) {
		this.firstName1 = firstName;
	}
	public String getLastName() {
		return lastName1;
	}
	public void setLastName(String lastName) {
		this.lastName1 = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth1;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth1 = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName1 + ", lastName=" + lastName1 + ", dateOfBirth="
				+ dateOfBirth1 + "]";
	}
	
}
