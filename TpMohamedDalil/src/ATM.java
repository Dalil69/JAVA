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
                    switch (choix) {
                        case 1:
                            effectuerRetrait(scanner, compte); // Appelle la méthode pour effectuer un retrait
                            break;
                        case 2:
                            effectuerDepot(scanner, compte); // Appelle la méthode pour effectuer un dépôt
                            break;
                        case 3:
                            afficherSolde(compte); // Appelle la méthode pour afficher le solde
                            break;
                        case 4:
                            quitter = true; // Quitte le compte
                            break;
                        default:
                            System.out.println("Choix invalide !");
                    }
                }
            } else {
                System.out.println("Code PIN incorrect !");
            }

            System.out.println("Voulez-vous effectuer une autre opération ? (Oui/Non)");
            String reponse = scanner.next();

            if (reponse.equalsIgnoreCase("Non")) {
                terminer = true;
            }
        }

        System.out.println("Merci d'avoir utilisé notre ATM !");
        scanner.close();
    }
    private static void effectuerDepot(Scanner scanner, CompteBancaire compte) {
        System.out.print("Entrez le montant à déposer : ");
        double montant = scanner.nextDouble();

        compte.deposer(montant); // Appelle la méthode pour déposer le montant spécifié
        System.out.println("Dépôt de " + montant + " euros effectué avec succès !");
    }

    private static void afficherSolde(CompteBancaire compte) {
        System.out.println("Votre solde actuel est de : " + compte.getSolde() + " euros");
    }
}

                }