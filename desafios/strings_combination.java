import java.io.IOException;
import java.util.Scanner;

public class StringsCombination {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        String n1,n2,resultado = "";

        int N = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < N; i++) {

            resultado = "";
            n1 = leitor.next();
            n2 = leitor.next();

            var tam_maior =  ( n1.length() > n2.length()) ? n1.length() : n2.length();
            var tam_menor =  ( n1.length() > n2.length()) ? n2.length() : n1.length();
            var partefinal =  ( n1.length() > n2.length()) ?
                    n1.substring(tam_menor, tam_maior) : n2.substring(tam_menor, tam_maior);

            for (int j = 0; j < tam_menor; j++) {
                resultado += n1.charAt(j);
                resultado += n2.charAt(j);
            }

            System.out.printf(resultado + partefinal + "\n");
            leitor.nextLine();
        }
    }
}