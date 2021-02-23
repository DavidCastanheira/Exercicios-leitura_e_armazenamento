import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exe2{

    public static void main(String[] args) {

        FileWriter outv = null;
        FileWriter outc = null;
       
        Scanner sc = new Scanner(System.in);

        String v [] = {"a", "e", "i", "o", "u"};
        List<String> vogais = Arrays.asList(v);

        String c [] = {"b", "c", "d", "f", "g", "h", "j", "k", "l", "m", "n", "p", "q", "r", "s", "t", "v", "w", "x", "y", "z"};
        
        List<String> consoantes = Arrays.asList(c);

        try {
            outv = new FileWriter ("Vogais.txt");
            outc = new FileWriter ("Consoantes.txt");

            System.out.println ("Digite uma palavra ou frase: ");
            String resposta = sc.nextLine();

            for(int i = 0; i < resposta.length(); i++) {
                String caracter = String.valueOf((char)resposta.charAt(i));
                
                if (vogais.contains(caracter)) {
                    outv.write(caracter);
                }
                
                else if (consoantes.contains(caracter)) {
                    outc.write(caracter);
                }
            }

        }

        catch(IOException e) {
            e.printStackTrace();
        }

        finally {
            try {
                outv.close();
                outc.close();
            }
            catch(IOException e){
                e.printStackTrace();
            }
        }

    System.out.println("Objetivo concluído, retorne ao início:");

    sc.close();
    }
}
