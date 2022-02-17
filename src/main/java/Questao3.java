import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        System.out.println("-----------Contador de Anagramas--------------");
        System.out.println("insira a palavra para análise: ");
        Scanner sc = new Scanner(System.in);
        String anagrama = sc.next();
        calculaAnagrama(anagrama);
    }

    static int calculaAnagrama(String s){
        HashMap<String, Integer> map= new HashMap<>();
        s = s.toLowerCase();//força todas as letras pra letras minúsculas
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valC = s.substring(i, j+1).toCharArray();// cria arrays de char para verificação de anagramas
                Arrays.sort(valC); // coloca em ordem crescente as letras do array
                String val = new String(valC);// transforma o array char[] em uma String
                if (map.containsKey(val)) {//verifica se já existe a String dentro do hash map
                    map.put(val, map.get(val) + 1);
                } else {
                    map.put(val, 1);
                }
            }
        }
        int contAnagrama = 0;
        for(String key: map.keySet()){// calculo para contagem dos anagramas
            int n = map.get(key);
            contAnagrama += (n * (n-1))/2;
        }
        System.out.println(contAnagrama);
        return contAnagrama;
    }
}
