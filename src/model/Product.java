package model;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public class Product {
    private AtomicReference<Long> id = new AtomicReference<Long>();
    private String name;
    private String tipe;
    private Double price;

    public Product(Long id, String name, String tipe, Double price) {
        this.id.set(id);
        this.name = name;
        this.tipe = tipe;
        this.price = price;
    }


    private static AtomicLong counter = new AtomicLong(0);
    public long nextId() {
        this.id.set(nextId());
        return counter.incrementAndGet();

    }

    public void setId(Long id) {
        this.id.set(id);
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


}


