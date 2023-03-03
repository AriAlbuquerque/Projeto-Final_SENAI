package model;

public class Product {
    private Long id;
    private String product;
    private Double valor;
    private String type;


    public Product(Long id, String product, Double valor, String type) {
        this.id = id;
        this.product = product;
        this.valor = valor;
        this.type = type;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void visualizar(){
        System.out.println(id+ "\t    "+ product+"\t  "+ "$"+ valor+" \t   "+type);
    }
}



