import java.util.Scanner;

public class Percentual_Eleitores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int habitantes = sc.nextInt();
        int brancos = sc.nextInt();
        int nulos = sc.nextInt();
        int validos = sc.nextInt();


        int pBrancos = (brancos * 100) / habitantes;
        int pNulos = (nulos * 100) / habitantes;
        int pValidos = (validos * 100) / habitantes;


        System.out.println("Brancos: " + pBrancos + "%");

        System.out.println("Nulos: " + pNulos + "%");

        System.out.println("Validos: " + pValidos + "%");

        sc.close();
    }
}