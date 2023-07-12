import java.util.Scanner;

public class ATM {
    private static double solde = 1000.0; // Solde initial du compte

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans l'ATM !");
        System.out.println("Votre solde actuel est de : " + solde + " euros");
    }
}