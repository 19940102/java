public class Adherent  extends Personne{

    private int numAdherent;

    public Adherent() {
    }

    public Adherent(String nom, String prenom, String tel, String age, int numAdherent) {
        super(nom, prenom, tel, age);
        this.numAdherent = numAdherent;
    }

    public int getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(int numAdherent) {
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return super.toString()+" numAdherant=" + numAdherent;
    }
}


