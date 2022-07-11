import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            nomes[i] = sc.nextLine();
        }
        int pos = sc.nextInt();
        System.out.println(nomes[pos]);
    }
}








