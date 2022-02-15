import java.util.InputMismatchException;
import java.util.Scanner;

public class questao1 {
    public static void main(String[] args) {
        System.out.println("--------Criador de Escadas---------");
        System.out.println("insira o número de degraus: ");
        Scanner sc = new Scanner(System.in); // le o input do usuário.
        try{ // tenta a criação da escada.
            int n = sc.nextInt(); // tenta a conversão para tipo inteiro.
            for (int i = 0; i < n; i++) { // loop definindo o tamanho da escada.
                for (int j = n; j > -1; j--) { // loop para desenho da escada com os * e os espaços.
                    if (j > i) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }catch (InputMismatchException e){ //Caso o input não seja do tipo inteiro, mostra uma mensagem de erro.
            System.out.println("Insira um número válido./n erro: " + e);
        }
    }
}
