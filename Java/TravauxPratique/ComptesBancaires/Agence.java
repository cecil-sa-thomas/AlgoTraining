package TravauxPratique.ComptesBancaires;

public class Agence {
    private String nom;
    private Compte[] comptes;
    private int capacite;
    private int nbComptes;
    private int indexCompte;
    
    public Agence(String nom, int capacite){
        this.nom = nom;
        this.capacite = capacite;
        this.comptes = new Compte[capacite];
        this.nbComptes = 0;
        this.indexCompte = 0;
    }

    public void ajouter(Compte c){
        this.comptes[indexCompte] = c;
        this.nbComptes++;
        this.indexCompte++;
    }

    public void supprimer(long numero){
        boolean exist = false;
        for(int i = 0; i < this.comptes.length ; i++){
            if(this.comptes[i] != null && this.comptes[i].getNumero() == numero){
                exist = true;
                this.comptes[i] = null;
                System.out.println("Le compte correspondant au numero " + numero + " a été supprimer");
                this.nbComptes--;
                break;
            }
        }
        if(!exist) System.out.println("Le compte correspondant au numero " + numero + " n'existe pas");
    }

    public Compte getCompte(long numero){
        boolean exist = false;
        for(int i = 0; i < this.comptes.length ; i++){
            if(this.comptes[i] != null && this.comptes[i].getNumero() == numero ){
                exist = true;
                System.out.println("Le compte correspondant au numero " + numero + " a été trouvé");
                return this.comptes[i];
            }
        }
        if(!exist) System.out.println("Le compte correspondant au numero " + numero + " n'existe pas");
        return null;
    }

    public String toString(){
        String  listeComptes = "";
        for(int i = 0; i < this.comptes.length ; i++){
            if(this.comptes[i] != null ){
                listeComptes += this.comptes[i].toString() + "\n";
            }
        }
        return "Nom : " + this.nom + "\n" +
            "Capacité : " + this.capacite + "\n" +
            "Nombre de compte : " + this.nbComptes + "\n" +
            "Comptes : \n" + listeComptes;
    }
}
