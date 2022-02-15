import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class questao2 {
    public static void main(String[] args) {
        System.out.println("---------Verificador de Senhas----------");
        System.out.println("insira a senha : ");
        Scanner input = new Scanner(System.in);
        String senha = input.next();
        checaSenha(senha);
    }

    public static void checaSenha(String senha){
        Pattern minuscula = Pattern.compile("[a-z]");//define o padrão de compilação para letras minúsculas entre a e z.
        Pattern maiuscula = Pattern.compile("[A-Z]");//define o padrão de compilação para letras maísculas entre A e Z.
        Pattern numero = Pattern.compile("[0-9]");//define o padrão de compilação para os algarismos.
        Pattern especial = Pattern.compile("[!@#$%^&*()--+]");// define o padrão do que é considerado caracter especial.
        Matcher temMinuscula = minuscula.matcher(senha);
        Matcher temMaiuscula = maiuscula.matcher(senha);
        Matcher temNumero = numero.matcher(senha);
        Matcher temEspecial = especial.matcher(senha);
        boolean checaMinuscula = temMinuscula.find();// a função find faz a procura do padrão de compilação escolhido dentro da String.
        boolean checaMaiuscula = temMaiuscula.find();
        boolean checaNumero = temNumero.find();
        boolean checaEspecial = temEspecial.find();
        if (senha.length()< 6) { // checa o tamanho da String.
            System.out.println("sua senha possui apenas " + senha.length() +
                    " caracteres, faltando " + (6 - senha.length()) + " caracteres para ser considerada uma senha segura.");
        }
        if(!checaEspecial){ // checa a presença de caracteres especiais.
            System.out.println("Adicione pelo menos um destes caracteres especiais: !@#$%^&*()-+");
        }
        if(!checaMinuscula){//checa a presença de letras minúsculas.
            System.out.println("Adicione uma letra minúscula a senha.");
        }
        if(!checaMinuscula){//checa a presença de letras maiúsculas.
            System.out.println("Adicione uma letra maiúscula a senha.");
        }
        if(!checaNumero){//checa a presença de números
            System.out.println("Adicione um número a senha.");
        }

        if(senha.length()>5 && checaEspecial && checaMaiuscula && checaMinuscula && checaNumero){ // checa se a senha pode ser considerada segura.
            System.out.println("A senha inserida é segura");
        }

    }
}
