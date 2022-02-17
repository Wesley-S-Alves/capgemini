import java.util.InputMismatchException;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        System.out.println("--------Criador de Escadas---------");
        System.out.println("insira o número de degraus: ");
        Scanner sc = new Scanner(System.in); // le o input do usuário.
        try{//tenta converter e caso converta, chama a função criaEscada
           int n = sc.nextInt();
           criaEscada(n);
        }catch(InputMismatchException e){// caso o valor inserido seja diferente de um inteiro
            System.out.println("insira um número válido."); 
        }
    }    
    public static String criaEscada(int n){    
    StringBuilder escada = new StringBuilder();//cria uma String mutável
    for (int i = n; i > 0; i--) { // loop definindo o tamanho da escada.
        for (int j = 1; j <= n; j++) { // loop para desenho da escada com os * e os espaços.
            if (j >= i) {
                escada.append("*");
            } else {
                escada.append(" ");
            }
        }
        if (i>1){escada.append(System.lineSeparator());}// adiciona uma nova linha
        }
    System.out.println(escada);
    return escada.toString();
    }
}

