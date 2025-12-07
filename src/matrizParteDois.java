import java.util.Scanner;

public class matrizParteDois {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] produtos = new String[3][3];
        produtos[0][0] = "110";
        produtos[0][1] = "tv";
        produtos[0][2] = "5.300";

        produtos[1][0] = "335";
        produtos[1][1] = "computador";
        produtos[1][2] = "3.200";

        produtos[2][0] = "545";
        produtos[2][1] = "camiseta";
        produtos[2][2] = "20";

        for (String[] produto : produtos) {
            for (String codigo : produto){
                System.out.println(codigo + " ");
            }
        }

        System.out.println("Digite o código do produto que deseja buscar");
        String codigoProduto = sc.nextLine();

        boolean produtoEncontrado;

        for (String[] produto : produtos){
           if (produto[0].equals(codigoProduto)){
               produtoEncontrado = true;
               System.out.println("produto encontrado");
               System.out.println("código: " + produto[0] + " nome: " + produto[1] + " preço: " + produto[2]);
               break;
           }
        }
        if (produtoEncontrado = false){
            System.out.println("produto não encontrado!");
        }
    }
}
