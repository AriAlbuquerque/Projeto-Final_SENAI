package model;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Order {


        private Long id;
        private String products;
        private Integer quantidade;
        private Double price;

    public Order(Long id, String products, Integer quantidade, Double price) {
        this.id = id;
        this.products = products;
        this.quantidade = quantidade;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

}