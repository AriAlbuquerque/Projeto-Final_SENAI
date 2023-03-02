package model;

public class Product {
    private Long id;
    private String name;
    private String tipe;
    private Double price;

    public Product(Long id, String name, String tipe, Double price) {
        this.id = id;
        this.name = name;
        this.tipe = tipe;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format( " %.2f ------------ ",price) + " " + id + " " + name + " " + tipe  ;
    }

}


