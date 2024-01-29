public class Auteur extends Personne {
    private int numAuteur;

    public Auteur() {
    }

    public Auteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }

    public Auteur(String nom, String prenom, String tel, String age, int numAuteur) {
        super(nom, prenom, tel, age);
        this.numAuteur = numAuteur;
    }

    public int getNumAuteur() {
        return numAuteur;
    }

    public void setNumAuteur(int numAuteur) {
        this.numAuteur = numAuteur;
    }

    @Override
    public String toString() {
        return super.toString() + " +numAuteur=" + numAuteur;
    }
}




