package Application;

import model.Product;
import model.UserData;
import model.util.LeituraArquivo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static Object FileReader;



    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        //lista de prudutos Hamburguers


        ArrayList<String> burgers = new ArrayList<>();
        //String email
        List<UserData> cliente = new ArrayList<>(); //criando a lista do cliente.
      //  LeituraArquivo lerArquivo = new LeituraArquivo();
        //List<Product> burgerList=lerArquivo.Burgers ();

        System.out.println(" ----------------------------------------------------------------------------------------");
        System.out.println("|                                            My Burgin                                   |");
        System.out.println(" ----------------------------------------------------------------------------------------");


        System.out.println("        Funcionamento: Terça a Domingo das 9h às 23h | Segunda-feira: Fechado");

        System.out.println("          Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito");
        System.out.println("                           Pedido Mínimo: $ 45,00");
        System.out.println("         Taxa de Entrega: R$ 10,00 | Tempo Estimado: 30min - 90min\n\n");





 /*    System.out.println("Informe seu email: ");
        read.skip("\\R?");
        email=read.nextLine(); */





          /*  System.out.println("Selecione a Opção.");
            System.out.println("[1] Hamburguers");
            System.out.println("[2] Combos");
            System.out.println("[3] Drinks");
            System.out.println("[4] completment");

            */


            System.out.println("Selecione a Opção.");
            System.out.println("[1]cadastro ");
            System.out.println("[2]fazer pedido ");
            System.out.println("[3] consulrar pedido ");
            System.out.println("[4] cancelar pedido ");
            System.out.println("[5]Sair ");
        int option=0;
         option = read.nextInt();

   /*     try {

        }catch(InputMismatchException e){
            System.out.println("Digite valores Inteiros.");
            option = read.nextInt();

        }
*/




            if (option==5) {
                System.out.println("Thanks for comming <3 ");
                read.close();
                System.exit(05);

            }

            switch (option){


                case 1  :
                    System.out.println("Cadastro");

                    break;
                case 2  :


                    System.out.println("Pedido");
                    System.out.println("Selecione a Opção.");
                    System.out.println("[1] Burger");
                    System.out.println("[2] Combos");
                    System.out.println("[3] Drinks");
                    System.out.println("[4] completment");
                    option = read.nextInt();

                    //int optionFood = 0;
                    switch (option){




                        case 1 -> {
                            System.out.println("Burguer");

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


