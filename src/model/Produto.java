package model;

public class Product {
    private Long id;
    private String produto;
    private String valor;
    private String tipo;
    private String quantidade;


    public void Produto(Long id, String produto, Double valor, String tipo) {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
        this.tipo = tipo;
    }

   /** @Override
    public String toString(){
        return Produto = [id=" + id + "Nome" + produto + "Preco: " + valor + "Quantidade: " + quantidade;]
   }*/


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
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

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public void visualizar() {
    }

    public class  CalcularProduto{
        double total =0;

        public double getTotal() {
            return total;
        }

        public void setTotal(double total) {
            this.total = total;
        }
    }
}
