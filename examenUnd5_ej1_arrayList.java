package programacion.examenUnd5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class examenUnd5_ej1_arrayList {
    static Scanner sc = new Scanner(System.in);
    static String phrase = "";
    static ArrayList<String> phraseSplit = new ArrayList<String>();
    public static void main(String[] args) {
        System.out.println("Introduce una frase");
        phrase = sc.nextLine().trim();
        String[] words = phrase.split(" ");
        for (String s : words) {
            phraseSplit.add(s);
        }
        for (String s : phraseSplit){
            System.out.print(lettersThatContainsATwoTimesOrMore(s)); 
            
        }
    }
    static String lettersThatContainsATwoTimesOrMore(String phrase){
        int j = 0;  
        String aux = "";
        String finalPhrase = "";
    

        for(int i = 0; i < phrase.length(); i++){
                if (i >= 1) {
                aux += phrase.charAt(i);   
                }

                if (phrase.charAt(i) == 'a') {
                    j++;
                }
        }
        if (j >= 2) {
            finalPhrase += phrase.substring(0,1).toUpperCase() + aux;
            }
    
    
    return finalPhrase + " ";
    }
}   


 