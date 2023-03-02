package Application;

import model.Product;
import model.UserData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Object FileReader;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //lista de prudutos Hamburguers

        ArrayList lanches =new ArrayList();
        ArrayList lanchesVeg =new ArrayList();


        //String email
        List<UserData> cliente = new ArrayList<>(); //criando a lista do cliente.
      //  LeituraArquivo lerArquivo = new LeituraArquivo();
        //List<Product> burgerList=lerArquivo.Burgers ();

        System.out.println(" ----------------------------------------------------------------------------------------");
        System.out.println("|                                            My Burgin                                  |");
        System.out.println(" ----------------------------------------------------------------------------------------");


        System.out.println("      Funcionamento: Terça a Domingo das 9h às 23h | Segunda-feira: Fechado  ");
        System.out.println("        Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito      ");
        System.out.println("                         Pedido Mínimo: $ 45,00                              ");
        System.out.println("       Taxa de Entrega: R$ 10,00 | Tempo Estimado: 30min - 90min             ");


            System.out.println("\nSelecione a opção abaixo:");
            System.out.println("[1] |Cadastro|");
            System.out.println("[2] |Fazer pedido|");
            System.out.println("[3] |Consulrar pedido|");
            System.out.println("[4] |Cancelar pedido|");
            System.out.println("[5] |Sair|");

            int option=0;
            option = read.nextInt();




            if (option==5) {
                System.out.println("Thanks for comming <3");
                read.close();
                System.exit(05);

            }

            switch (option){


                case 1  :
                    System.out.println("Cadastro");

                    break;
                case 2  :
                    System.out.println("Selecione uma opção abaixo:");
                    System.out.println("[1] |Burger|");
                    System.out.println("[2] |Combos|");
                    System.out.println("[3] |Drinks|");
                    System.out.println("[4] |Complement|");
                    option = read.nextInt();

                    //int optionFood = 0;
                    switch (option){




                        case 1 -> {
                            System.out.println("Escolha:\n[1] |Lanches com Carne|\n[2] |Lanches Veganos|");
                            option = read.nextInt();
                            switch (option){

                                case 1 -> {
                                    Product lanche = new Product(1L, "X-Burger", 10.00,"Carne");
                                    Product lanche1 = new Product(2L, "X-Egg      ", 13.00,"Carne");
                                    Product lanche2 = new Product(3L, "X-Baccon", 20.00,"Carne");
                                    Product lanche3 = new Product(4L, "X-Salada", 22.00,"Carne");
                                    System.out.println("____________________________________");
                                    System.out.println("ID      LANCHES      VALOR      TIPO");
                                    System.out.println("____________________________________");
                                    lanche.visualizar();
                                    lanche1.visualizar();
                                    lanche2.visualizar();
                                    lanche3.visualizar();
                                }
                                case 2 -> {
                                    Product lancheveg = new Product(5L, "Veg X-Shimeji           ", 20.00, "Vegano");
                                    Product lancheveg1 = new Product(6L, "Veg X-Lentilha          ",30.00, "Vegano");
                                    Product lancheveg2 = new Product(7L, "Veg X-Castanha-de-Caju  ",50.00, "Vegano");
                                    Product lancheveg3 = new Product(8L, "Veg X-Grão-de-Bico      ",15.00, "Vegano");
                                    System.out.println("_____________________________________________________");
                                    System.out.println("ID          LANCHES                  VALOR       TIPO");
                                    System.out.println("_____________________________________________________");
                                    lancheveg.visualizar();
                                    lancheveg1.visualizar();
                                    lancheveg2.visualizar();
                                    lancheveg3.visualizar();
                                }
                            }
                        }
                        case 2 -> {
                            System.out.println("Combos");

                        }
                        case 3 ->{
                            System.out.println("Drinks");

                        }
                        case 4 -> {
                            System.out.println("Complement");
                        }

                    }
                    break;
                case 3  :
                    System.out.println("Consultar pedido: ");

                    break;
                case 4  :
                    System.out.println("Cancelar pedido");

                    break;

                default:
                    System.out.println("Entrada incorreta.");
                    break;








                }
            }


}


