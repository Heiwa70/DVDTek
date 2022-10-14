public class Client {
    private String nom;
    private int age;
    private String filmNom;
    private String filmGenre;

    private Agence agence;

    public Client(String nom,int age){
        this.nom = nom;
        this.age = age;

    }

    public boolean demandeNom(String filmNom){
        this.filmNom = filmNom;

        return true;
    }
    public void demandeGenre(String filmGenre){
        this.filmGenre = filmGenre;
    }
}
