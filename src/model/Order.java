package model;
import java.util.Random;


public class Order {


        public Long numeroDoPedido;
        public String products;
        public Integer quantidade;
        private Double price;



    public Order(Long numeroDoPedido, String products, Integer quantidade, Double price) {
        this.numeroDoPedido = numeroDoPedido;
        this.products = products;
        this.quantidade = quantidade;
        this.price = price;
    }

    public Long getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(Long numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
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




    public Long gerarNumeroPedido() {
        Random idAleatorios = new Random();
        numeroDoPedido = idAleatorios.nextLong();

        while (numeroDoPedido <= 0) {
            numeroDoPedido = idAleatorios.nextLong();
        }
        return numeroDoPedido;
    }
        public void OrderNumber(){
            Long orderNum = numeroDoPedido;
        }
    public static double Pagar(double price,int quantidade) {
        return price* quantidade;
    }

}




