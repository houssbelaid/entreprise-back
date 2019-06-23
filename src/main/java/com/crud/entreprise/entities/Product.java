package com.crud.entreprise.entities;


import javax.persistence.*;

@Entity
@Table(name = "T_PRODUCT")
public class Product {

    private Long id;
    private String productName;
    private String productCode;
    private String realeaseDate;
    private float price;
    private float starRating;
    private String imageUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getRealeaseDate() {
        return realeaseDate;
    }

    public float getPrice() {
        return price;
    }

    public float getStarRating() {
        return starRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setRealeaseDate(String realeaseDate) {
        this.realeaseDate = realeaseDate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setStarRating(float starRating) {
        this.starRating = starRating;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
