import java.util.Scanner;
import java.util.Random;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        Scanner jesaispasfrr = new Scanner(System.in);
        Random pif = new Random();
        int essais = 0;
        LocalTime debutJeu = LocalTime.now();

        int nombreADeviner = pif.nextInt(100) + 1; // Choisir un nombre entre 1 et 100

        System.out.println("=== Jeu du Juste Prix ===");
        System.out.println("Devinez le nombre entre 1 et 100.");

        int nombreSaisi;
        do {
            System.out.print("Entrez un nombre : ");
            nombreSaisi = jesaispasfrr.nextInt();
            essais++;

            if (nombreSaisi < nombreADeviner) {
                System.out.println("Plus haut !");
            } else if (nombreSaisi > nombreADeviner) {
                System.out.println("Plus bas !");
            } else {
                System.out.println("Bravo, vous avez trouvé le bon nombre !");
            }
        } while (nombreSaisi != nombreADeviner);

        LocalTime finJeu = LocalTime.now();
        long duree = finJeu.toSecondOfDay() - debutJeu.toSecondOfDay();

        System.out.println("Nombre d'essais : " + essais);
        System.out.println("Durée du jeu : " + duree + " secondes");

        jesaispasfrr.close();
    }
}
