import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Exe3 {
    public static void main (String args[]) {
        String vogais[] = {"a", "e", "i", "o", "u"};
       
        List<String> vogaisList = Arrays.asList(vogais);
        
        FileReader reader = null;
        
        Integer vogal = 0;
        Integer espaco = 0;
        Integer total = 0;
        
        try{
            reader = new FileReader("entrada.txt");
            int resposta;
            while ((resposta = reader.read()) != -1) {
                if (resposta == 32){
                    espaco++;
                }
                for(int i = 0; i < resposta.length(); i++) {
                String caracter = String.valueOf((char)resposta.charAt(i));
                if (vogaisList.contains(caracter)){
                    vogal++;
                }
              total++;
            }
        }
        catch (IOException e) {   
        }
        System.out.println("Quantidade de vogais: " + vogal.toString());
        System.out.println("Quantidade de espaços: " + espaco.toString());
        System.out.println("Quantidade de caracteres: "+ total.toString());
    }
}
