public class CompteBancaire {
    private String nom;
    private int codePIN;
    private double solde;

    public CompteBancaire(String nom, int codePIN, double soldeInitial) {
        this.nom = nom;
        this.codePIN = codePIN;
        this.solde = soldeInitial;
    }

    public String getNom() {
        return nom;
    }

    public int getCodePIN() {
        return codePIN;
    }

    public double getSolde() {
        return solde;
    }

    public void retirer(double montant) {
        solde -= montant;
    }

    public void deposer(double montant) {
        solde += montant;
    }
}
