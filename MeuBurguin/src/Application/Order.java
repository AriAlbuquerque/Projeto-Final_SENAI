package Application;
import java.util.Random;
import java.util.random.RandomGenerator;

public class Order {
    public class Dellivery {	

        private Long id;
        private String products;
        private Integer quantidade;
        private Double price;

        public Dellivery(Integer quantidade) {
            this.quantidade = quantidade;
        }


        public void Order() {
        }

        public void Order(long id, String products, double price, Integer quantidade) {
            this.id = id;
            this.products = products;
            this.price = price;
            this.quantidade = quantidade;
        }

        public void Products() {

        }

        public void products(long id, double price, String products) {
            this.id = id;
            this.price = price;
            this.products = products;
        }

        public void Quantity() {

        }

        public void Quantity(long id, double price) {
            this.id = id;
            this.price = price;

            //*
            //
            // */
        }

        public Long generateOrderNumber() {

            Random idRandomGenerator;
            idRandomGenerator = new Random();
            id = RandomGenerator.getDefault().nextLong();

            while (id <= 0) {
                id = RandomGenerator.getDefault().nextLong();
            }
            return id;
        }}}

        
       

