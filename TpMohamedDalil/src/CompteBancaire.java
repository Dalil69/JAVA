public class CompteBancaire {
    private String nom; // Nom du titulaire du compte
    private int codePIN; // Code PIN du compte
    private double solde; // Solde du compte

    public CompteBancaire(String nom, int codePIN, double soldeInitial) {
        this.nom = nom; // Initialise le nom du titulaire du compte
        this.codePIN = codePIN; // Initialise le code PIN du compte
        this.solde = soldeInitial; // Initialise le solde initial du compte
    }

    public String getNom() {
        return nom; // Renvoie le nom du titulaire du compte
    }

    public int getCodePIN() {
        return codePIN; // Renvoie le code PIN du compte
    }

    public double getSolde() {
        return solde; // Renvoie le solde du compte
    }

    public void retirer(double montant) {
        solde -= montant; // Réduit le solde du compte de la valeur du montant spécifié
    }

    public void deposer(double montant) {
        solde += montant; // Augmente le solde du compte de la valeur du montant spécifié
    }
}
