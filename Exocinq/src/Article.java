public class Article {
    private String reference;
    private String designation;
    private double prix;

    public Article(String reference, String designation, double prix) {
        this.reference = reference;
        this.designation = designation;
        this.prix = prix;
    }

    public String getReference() {
        return reference;
    }

    public String getDesignation() {
        return designation;
    }

    public double getPrix() {
        return prix;
    }

    public void afficherDetails() {
        System.out.println("Article : " + designation);
        System.out.println("Référence : " + reference);
        System.out.println("Prix : " + prix + "€");
    }

    public static void main(String[] args) {
        // Création d'une instance de la classe Article
        Article article = new Article("REF123", "Ordinateur portable", 999.99);

        // Accéder aux valeurs des variables membres et les afficher
        String reference = article.getReference();
        String designation = article.getDesignation();
        double prix = article.getPrix();
        System.out.println("Référence : " + reference);
        System.out.println("Désignation : " + designation);
        System.out.println("Prix : " + prix + "€");

        // Appeler la méthode afficherDetails() pour afficher les caractéristiques de l'article
        article.afficherDetails();
    }
}
