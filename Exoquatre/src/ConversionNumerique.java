import java.util.Scanner;

public class ConversionNumerique {
    public static void main(String[] args) {
        // Création de l'objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur de saisir un nombre entier
        System.out.print("Entrez un nombre entier : ");
        int nombre = scanner.nextInt();

        // Conversion du nombre en binaire, octal et hexadécimal
        String binaire = Integer.toBinaryString(nombre); // Conversion en binaire
        String octal = Integer.toOctalString(nombre); // Conversion en octal
        String hexa = Integer.toHexString(nombre); // Conversion en hexadécimal

        // Affichage des résultats des conversions
        System.out.println("Conversion en binaire : " + binaire);
        System.out.println("Conversion en octal : " + octal);
        System.out.println("Conversion en hexadécimal : " + hexa);

        // Fermeture de l'objet Scanner
        scanner.close();
    }
}
