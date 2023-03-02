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
    }

    public void setId(Long id) {
        this.id = id;
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