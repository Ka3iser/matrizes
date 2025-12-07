import java.util.Scanner;

public class matrizes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantidade de linhas que você deseja: ");
        int linhas = sc.nextInt();

        System.out.println("digite a quantidade de colunas que você deseja: ");
        int colunas = sc.nextInt();

        int[][] numeros = new int[linhas][colunas];

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("digite o valore da matriz " + " [" + i + "]" + "[" + j + "]");
                numeros[i][j] = sc.nextInt();
            }
        }


        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("soma dos valores da matriz");

        int somaMatriz = 0;
        for (int[] linha : numeros) {
            for (int valorColuna : linha){
                somaMatriz += valorColuna;
            }
        }

        System.out.println(somaMatriz);

        System.out.println();

        System.out.println("valores da matriz multiplicados por 2");

        for (int[] linha : numeros) {
            for (int valorColuna : linha){
                int resultado = valorColuna * 2;
                System.out.print(resultado + " ");
            }
        }

        System.out.println();



    }
}
