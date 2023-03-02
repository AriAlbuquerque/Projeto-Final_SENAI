package model;

public class Product {
    private Long id;
    private String nome;
    private Double valor;
    private String tipo;
    public Product(Long id, String nome, Double valor, String tipo) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.tipo = tipo;
    }
    public Long getId() {
        return id;

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


    public String getNome() {
        return nome;
    }



    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public void visualizar() {




        System.out.println(id + "\t    " + nome + "\t  " + valor + " \t   " + tipo);


    }
}