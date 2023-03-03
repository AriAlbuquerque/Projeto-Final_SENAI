package model;

import model.util.Metodos;

public class Delivery extends UserData {

    UserData userData = new UserData();
    Order order = new Order();
    Metodos metodos = new Metodos();

    private Delivery(String Pagamento) {

        System.out.printf("Pedido: " + order + "\n" + "Cliente: " + nome + "Endereco: " + endereco + "\n" + "Telefone: " + telefone);
        System.out.println("Valor Total do pedido: " + new Metodos.TotalPedidos());
        System.out.println("Metodo de pagamento: " + Pagamento);


    }


    public void visualizar() {

        super.Visualizar();


    }
}












