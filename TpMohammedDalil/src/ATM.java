import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    private static Map<Integer, CompteBancaire> comptes = new HashMap<>();

    public static void main(String[] args) {
        // Création des comptes bancaires avec les noms, les codes PIN et les soldes initiaux
        comptes.put(1001, new CompteBancaire("John Doe", 1234, 1000.0));
        comptes.put(1002, new CompteBancaire("Jane Smith", 5678, 500.0));
        comptes.put(1003, new CompteBancaire("Alice Johnson", 4321, 2000.0));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans l'ATM !");

        boolean terminer = false;

        while (!terminer) {
            System.out.println("\nEntrez votre code PIN : ");
            int codePIN = scanner.nextInt();

            if (comptes.containsKey(codePIN)) { // Vérifie si le code PIN est valide
                CompteBancaire compte = comptes.get(codePIN); // Récupère le compte associé au code PIN

                System.out.println("Bienvenue, " + compte.getNom()); // Affiche le nom du titulaire du compte
                System.out.println("Votre solde actuel est de : " + compte.getSolde() + " euros"); // Affiche le solde du compte

                boolean quitter = false;

                while (!quitter) {
                    System.out.println("\nQue souhaitez-vous faire ?");
                    System.out.println("1. Retrait");
                    System.out.println("2. Dépôt");
                    System.out.println("3. Vérifier le solde");
                    System.out.println("4. Quitter le compte");

                    System.out.print("Entrez votre choix : ");
                    int choix = scanner.nextInt();
                }
            }
        }
    }
}