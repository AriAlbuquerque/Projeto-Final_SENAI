package model;
import java.util.Random;

import java.util.random.RandomGenerator;
import java.time.LocalDateTime;

public class Order {
    private Long id;
    private String products;
    private Integer quantidade;
    private Double price;

import java.util.List;
public class Order {


        public Long id;
        public String products;
        public Integer quantidade;
        private Double price;


    public Order(Long id, String products, Integer quantidade, Double price) {
     //   String.List< [1]>






    }




    public Long gerarNumeroPedido() {
        Random idAleatorios = new Random();
        id = idAleatorios.nextLong();

        while (id <= 0) {
            id = idAleatorios.nextLong();
        }
        return id;
    }


}

   }

