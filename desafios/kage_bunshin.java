import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext())
        {
            var N = sc.nextInt();

            System.out.println((int)Math.ceil(Math.log(N)));
        }

        sc.close();
    }
}