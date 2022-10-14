
public class Main {
    public static void main(String[] args) {
        Client Ewan = new Client("Ewan",20);
        if (Ewan.demandeNom("Star wars"))
            System.out.println("Votre film est disponible");
        else
            System.out.println("Votre film est indisponible");
    }


}
