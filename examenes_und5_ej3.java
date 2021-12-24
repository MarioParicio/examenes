package programacion.examenUnd5;
import java.util.Scanner;

public class ej3exam_und5 {
    static Scanner sc = new Scanner(System.in);
    static String phrase = "";
    public static void main(String[] args) {
    System.out.println("Introduce una frase");
    phrase = sc.nextLine();
    phrase = phrase.trim().toLowerCase();
    System.out.println(firstLetterMayus(lettersThatContainsATwoTimesOrMore(phrase)));
    }

    static String firstLetterMayus(String mayus){
        String newPhrase = "";
        newPhrase += mayus.toUpperCase().charAt(0);
        for(int i=1; i < mayus.length(); i++){
            if (mayus.charAt(i) == ' ') {
                newPhrase += mayus.substring(i, i + 2).toUpperCase();
                i++;   
            } else {
                newPhrase += mayus.charAt(i);
            }
        }
        return newPhrase;
    }
    static String lettersThatContainsATwoTimesOrMore(String phrase){
            int j = 0;
            String aux = "";
            String finalPhrase = "";

            for(int i = 0; i < phrase.length(); i++){
                if (phrase.charAt(i) == ' ') {
                    if (j >= 2) {
                    finalPhrase += aux;
                    }
                    aux = " ";
                    j = 0;
                } else {
                    aux += phrase.charAt(i);
                    if (phrase.charAt(i) == 'a') {
                        j++;
                    }
                }

            }


        return finalPhrase;
    }
}
