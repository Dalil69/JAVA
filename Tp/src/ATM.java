import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, CompteBancaire> comptes = new HashMap<>();

    public static void main(String[] args) {
        // Création des comptes bancaires avec les noms, les codes PIN et les soldes initiaux
        comptes.put(1001, new CompteBancaire("John Doe", 1234, 1000.0));
        comptes.put(1002, new CompteBancaire("Jane Smith", 5678, 500.0));
        comptes.put(1003, new CompteBancaire("Alice Johnson", 4321, 2000.0));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans l'ATM !");
    }
}
