import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int nombre1 = random.nextInt(1001); // Génère un nombre aléatoire entre 0 et 1000 (inclus)
        int nombre2 = random.nextInt(1001);
        int nombre3 = random.nextInt(1001);

        System.out.println("Nombre 1 : " + nombre1);
        System.out.println("Nombre 2 : " + nombre2);
        System.out.println("Nombre 3 : " + nombre3);

        // Vérification du motif : deux nombres pairs suivis par un nombre impair
        int essais = 1; // Variable de comptage des essais
        while (!(nombre1 % 2 == 0 && nombre2 % 2 == 0 && nombre3 % 2 != 0)) {
            // Si la condition n'est pas vérifiée, générer de nouveaux nombres aléatoires
            nombre1 = random.nextInt(1001);
            nombre2 = random.nextInt(1001);
            nombre3 = random.nextInt(1001);

            System.out.println("Nombre 1 : " + nombre1);
            System.out.println("Nombre 2 : " + nombre2);
            System.out.println("Nombre 3 : " + nombre3);

            essais++; // Incrémenter le nombre d'essais
        }

        // Si la condition est vérifiée, afficher le message correspondant
        System.out.println("Le motif 'deux nombres pairs suivis par un nombre impair' est respecté.");
        System.out.println("Nombre d'essais nécessaires : " + essais);
    }
}
