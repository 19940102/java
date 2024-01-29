public class Personne {
private  String nom ;
private  String prenom;
private  String tel;
private  String age;

    public Personne() {
    }

    public Personne(String nom, String prenom, String tel, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}




