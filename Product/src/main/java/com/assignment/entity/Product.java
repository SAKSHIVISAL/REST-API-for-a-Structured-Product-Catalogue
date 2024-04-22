package com.assignment.entity;


	import java.util.List;
	import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="product")

	public class Product {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	 
    private String id;
    private String name;
    private String description;
    private double price;
    private List<String> categories;
    private List<Attribute> attributes;
    private Availability availability;
    private List<Rating> ratings;

 
   
    public static class Attribute {
        private String key;
        private String value;

       
    }

   
    public static class Availability {
        private boolean inStock;
        private int quantity;

       
    }

   
    public static class Rating {
        private String userId;
        private double rating;
        private String comment;

      
    }
}

