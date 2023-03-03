package Application;
import model.Product;
import model.UserData;
import model.Order;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    private static Object FileReader;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int potato =0;
        int lanchinho;
        int quantidade;
        String nome;
        String endereco;
        String telefone;
        String cpf = " ";
        String email;
        //lista de prudutos pedido
        List<Product> lanches = new ArrayList<>();
        //String email
        List<UserData> cliente = new ArrayList<>(); //criando a lista do cliente.
        ArrayList User = new ArrayList();
        double price = 0;


        //  LeituraArquivo lerArquivo = new LeituraArquivo();
        //List<Product> burgerList=lerA2rquivo.Burgers ();


        // System.out.println(lanches);

        char resp;
/*
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("|                                   My Burgin                               |");
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("|                  Segunda-feira  a Domingo das 12h às 23h                   |");
        System.out.println("|     Formas de Pagamento: Dinheiro, Pix | Cartão de Débito e Crédito       |");
        System.out.println("|         Taxa de Entrega: R$ 10,00 | Tempo Estimado: 30min - 90min         |");
        System.out.println(" --------------------------------------------------------------------------- ");

        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("|                      Olá, vamos fazer o seu cadastro!!                    |");
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("| Digite seu nome completo:                                                 |");
        System.out.println(" --------------------------------------------------------------------------- ");
        read.skip("\\R?");
        nome = read.nextLine();
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("| Digite seu endereco com número:                                           |");
        System.out.println(" --------------------------------------------------------------------------- ");
        endereco = read.nextLine();
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("| Digite seu telefone:                                                      |");
        System.out.println(" --------------------------------------------------------------------------- ");
        telefone = read.nextLine();
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("| Digite seu E-mail:                                                        |");
        System.out.println(" --------------------------------------------------------------------------- ");
        email = read.nextLine();

        UserData user1 = new UserData(nome, endereco, telefone, cpf, email);
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("| Cliente cadastrado com sucesso!!                                          |");
        System.out.println(" --------------------------------------------------------------------------- ");
*/




        do {
        System.out.println(" --------------------------------------------------------------------------- ");
        System.out.println("|                                                                           |");
        System.out.println("|                   Selecione a opção abaixo:                               |");
        System.out.println("|                                                                           |");
        System.out.println("|                                                                           |");
        System.out.println("|                    [1]    Fazer pedido                                    |");
        System.out.println("|                    [2]    Consultar pedido                                |");
        System.out.println("|                    [3]    Cancelar pedido                                 |");
        System.out.println("|                    [4]    Sair                                            |");
        System.out.println("|                                                                           |");
        System.out.println(" --------------------------------------------------------------------------- ");


        int option = 0;
        option = read.nextInt();


        if (option == 4) {
            System.out.println("Thanks for comming <3");
            read.close();
            System.exit(04);

        }

        switch (option) {


            case 1:
                List<Order> Pedido = new ArrayList<>();

                do {
                    //user1.VisualizarNome();
                    System.out.println("Selecione uma opção abaixo:");
                    System.out.println("[1] Burger");
                    System.out.println("[2] Kombos");
                    System.out.println("[3] Drinks");
                    System.out.println("[4] Complement");
                    option = read.nextInt();
                }while(option != 1 && option != 2 && option !=3 && option!=4);
                //int optionFood = 0;
                switch (option) {


                    case 1 -> {
                        System.out.println("Escolha: [1] Lanches com Carne  [2] Lanches Veganos");
                        option = read.nextInt();
                        switch (option) {

                            case 1 -> {

                                Product lanche = new Product(1L, "X-Burger", 10.00, "Carne");
                                Product lanche1 = new Product(2L, "X-Egg      ", 13.00, "Carne");
                                Product lanche2 = new Product(3L, "X-Baccon", 20.00, "Carne");
                                Product lanche3 = new Product(4L, "X-Salada", 22.00, "Carne");
                                System.out.println("________________________________________");
                                System.out.println("ID      BURGERS       PRICE         TYPE");
                                System.out.println("________________________________________");
                                lanche.visualizar();
                                lanche1.visualizar();
                                lanche2.visualizar();
                                lanche3.visualizar();

                                System.out.println("Selecione pelo ID");
                                lanchinho= read.nextInt();

                                System.out.println("Quantidade? ");
                                quantidade= read.nextInt();


                           ;

                                double preco=lanche3.getValor()*quantidade;
                                   System.out.println(preco);

                            }
                            case 2 -> {
                                Product lanche4 = new Product(5L, "Veg X-Shimeji           ", 20.00, "Vegano");
                                Product lanche5 = new Product(6L, "Veg X-Lentilha          ", 30.00, "Vegano");
                                Product lanche6 = new Product(7L, "Veg X-Castanha-de-Caju  ", 50.00, "Vegano");
                                Product lanche7 = new Product(8L, "Veg X-Grão-de-Bico      ", 15.00, "Vegano");
                                System.out.println("_________________________________________________________");
                                System.out.println("ID      VEG BURGERS                   PRICE          TYPE");
                                System.out.println("_________________________________________________________");
                                lanche4.visualizar();
                                lanche5.visualizar();
                                lanche6.visualizar();
                                lanche7.visualizar();
                                System.out.println("Selecione pelo ID");
                                lanchinho= read.nextInt();
                                System.out.println("Quantidade? ");
                                quantidade= read.nextInt();
                            }

                        }
                    }
                    case 2 -> {
                        System.out.println("Select your kombo: ");
                        System.out.println("[1] Vegans [2] Non-Vegans");
                        option = read.nextInt();
                        switch (option) {

                            case 1 -> {
                                System.out.println("Combos com Batata ou Onion Ring?");
                                System.out.println("[1] Batata [2] Onion Ring ");

                                potato= read.nextInt();


                                if( potato==1) {
                                    System.out.println("_____________________________________________________________________________________");
                                    System.out.println("ID      VEGAN KOMBOS                                                 VALOR     2 TIPO");
                                    System.out.println("_____________________________________________________________________________________");
                                    Product lanche9 = new Product( 9L,   "Veg X-Shimeji + Batata Frita + Refrigerante             ", 20.00, "Vegano");
                                    Product lanche10 = new Product(10L, "Veg X-Lentilha + OBatata Frita + Refrigerante            ", 30.00, "Vegano");
                                    Product lanche11 = new Product(11L, "Veg X-Castanha-de-Caju + Batata Frita + Refrigerante     ", 50.00, "Vegano");
                                    Product lanche12 = new Product(12L, "Veg X-Grão-de-Bico + Batata Frita + Refrigerante         ", 15.00, "Vegano");
                                    lanche9.visualizar();
                                    lanche10.visualizar();
                                    lanche11.visualizar();
                                    lanche12.visualizar();
                                    System.out.println("Selecione pelo ID");
                                    lanchinho= read.nextInt();
                                    System.out.println("Quantidade? ");
                                    quantidade= read.nextInt();

                                } else {
                                    System.out.println("_____________________________________________________________________________________");
                                    System.out.println("ID      VEGAN KOMBOS                                                 VALOR     2 TIPO");
                                    System.out.println("_____________________________________________________________________________________");
                                    Product lanche13 = new Product(13L, "Veg X-Shimeji + Onion Ring + Refrigerante          ", 20.00, "Vegano");
                                    Product lanche14 = new Product(14L, "Veg X-Lentilha + Onion Ring + Refrigerante         ", 30.00, "Vegano");
                                    Product lanche15 = new Product(15L, "Veg X-Castanha-de-Caju +Onion Ring+ Refrigerante   ", 50.00, "Vegano");
                                    Product lanche16 = new Product(16L, "Veg X-Grão-de-Bico + Onion Ring + Refrigerante     ", 15.00, "Vegano");
                                    lanche13.visualizar();
                                    lanche14.visualizar();
                                    lanche15.visualizar();
                                    lanche16.visualizar();
                                    System.out.println("Selecione pelo ID");
                                    lanchinho= read.nextInt();
                                    System.out.println("Quantidade? ");
                                    quantidade= read.nextInt();
                                }

                            }
                            case 2 -> {

                                System.out.println("Combos com Batata ou Onion Ring?");
                                System.out.println("[1] Batata [2] Onion Ring ");

                                potato= read.nextInt();
                                if( potato==1) {
                                    System.out.println("_____________________________________________________________________________________");
                                    System.out.println("ID      MEAT KOMBOS                                                  VALOR     2 TIPO");
                                    System.out.println("_____________________________________________________________________________________");

                                    Product lanche17 = new Product(17L, "X-Burger + Batata Frita + Refrigerante ", 10.00, "Carne");
                                    Product lanche18 = new Product(18L, "X-Salada + Batata Frita + Refrigerante ", 10.00, "Carne");
                                    Product lanche19 = new Product(19L, "X-Baccon + Batata Frita + Refrigerante ", 10.00, "Carne");
                                    Product lanche20 = new Product(20L, "X-Egg    + Batata Frita + Refrigerante ", 10.00, "Carne");
                                    lanche17.visualizar();
                                    lanche18.visualizar();
                                    lanche19.visualizar();
                                    lanche20.visualizar();
                                    System.out.println("Selecione pelo ID");
                                    lanchinho= read.nextInt();
                                    System.out.println("Quantidade? ");
                                    quantidade= read.nextInt();
                                }else
                                {  System.out.println("________________________________________________________________");
                                    System.out.println("ID      MEAT KOMBOS                              VALOR     TIPO");
                                    System.out.println("_______________________________________________________________");
                                    Product lanche21 = new Product(21L, "X-Burger + Onion Ring + Refrigerante ", 10.00, "Carne");
                                    Product lanche22 = new Product(22L, "X-Salada + Onion Ring + Refrigerante ", 10.00, "Carne");
                                    Product lanche23 = new Product(23L, "X-Baccon + Onion Ring + Refrigerante ", 10.00, "Carne");
                                    Product lanche24 = new Product(24L, "X-Egg    + Onion Ring + Refrigerante ", 10.00, "Carne");
                                    lanche21.visualizar();
                                    lanche22.visualizar();
                                    lanche23.visualizar();
                                    lanche24.visualizar();
                                    System.out.println("Selecione pelo ID");
                                    lanchinho= read.nextInt();
                                    System.out.println("Quantidade? ");
                                    quantidade= read.nextInt();





                                }



                            }


                        }
                    }
                    case 3 -> {
                        System.out.println("Drinks");
                        System.out.println("[1] Sem Alcool  [2] Com Alcool");
                        option= read.nextInt();


                        if (option==1) {
                            System.out.println("_____________________________________________________________");
                            System.out.println("ID      DRINKS               PRYCE            TYPE");
                            System.out.println("_____________________________________________________________");
                            Product bebida =  new Product(25L, "Água              ", 3.00, "      Sem-gás");
                            Product bebida1 = new Product(26L, "Água com gás      ", 5.00, "      Com-Gás");
                            Product bebida2 = new Product(28L, "Fanta Laranja Lata", 6.00, "      Refrigerante");
                            Product bebida3 = new Product(28L, "Fanta Uva Lata    ", 6.00, "      Refrigerante");
                            Product bebida4 = new Product(28L, "Pepsi Lata        ", 6.00, "      Refrigerante");
                            Product bebida5 = new Product(28L, "H20               ", 6.00, "      Refrigerante");
                            Product bebida6 = new Product(28L, "Coca-cola Lata    ", 6.00, "      Refrigerante");
                            Product bebida7 = new Product(27L, "Coca-Cola 1L      ", 10.00, "   Refrigerante");
                            bebida.visualizar();
                            bebida1.visualizar();
                            bebida2.visualizar();
                            bebida3.visualizar();
                            bebida4.visualizar();
                            bebida5.visualizar();
                            bebida6.visualizar();
                            bebida7.visualizar();

                            System.out.println("Selecione pelo ID");
                            lanchinho = read.nextInt();
                            System.out.println("Quantidade? ");
                            quantidade= read.nextInt();
                        } else{
                            System.out.println("_____________________________________________________________________________________");
                            System.out.println("ID      ALCOOLICS                                                 PRICE     TYPE");
                            System.out.println("_____________________________________________________________________________________");
                            Product bebida8 =  new Product(28L, "Cerveja Brhama 250 ml ", 5.00, "Alcoolica.");
                            Product bebida9 =  new Product(29L, "Cerveja Império 300ml", 7.00, "Alcoolica");
                            Product bebida10 =  new Product(30L, "Cerveja Hineken 250 ml ", 20.00, "Alcoolica");
                            Product bebida11 =  new Product(31L, "Litrão Skol  ", 15.00, "Alcoolica");

                            bebida8.visualizar();
                            bebida9.visualizar();
                            bebida10.visualizar();
                            bebida11.visualizar();
                            System.out.println("Quantidade? ");
                            quantidade= read.nextInt();
                        }
                    }
                    case 4 -> {
                        System.out.println("Complement");
                        System.out.println("_________________________________________________________");
                        System.out.println("ID      COMPLEMENTS                  PRICE     TYPE");
                        System.out.println("_________________________________________________________");
                        Product bebida8 =  new Product(28L, "Fries                      ", 5.00, "Complement");
                        Product bebida9 =  new Product(29L, "Onion ring                 ", 7.00, "Complement");
                        Product bebida10 =  new Product(30L, "Fries with cheddar        ", 20.00, "Complement");
                        Product bebida11 =  new Product(31L, "Onion ring with chease    ", 15.00, "Complement");

                        bebida8.visualizar();
                        bebida9.visualizar();
                        bebida10.visualizar();
                        bebida11.visualizar();
                        System.out.println("Quantidade? ");
                        quantidade= read.nextInt();

                    }

                }

                break;
            case 2:
                System.out.println("Consultar pedido: ");

                break;
            case 3:
                System.out.println("Cancelar pedido");
                break;
            case 4:
                break;

            default:
                System.out.println("Entrada incorreta.");
                break;


        }
            System.out.print("\n" + " Deseja inserir mais um produto? Digite S ou N: ");
            read.skip("\\R?");
            resp = read.next().toUpperCase().charAt(0);
        } while (resp == 'S');
    }



}


