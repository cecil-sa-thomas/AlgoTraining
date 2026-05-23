package TravauxPratique.ComptesBancaires;
public class Compte {
    
    public static int nbTotalCompte = 0;
    private String titulaire;
    private double solde;
    private long numero;
    private String titre;

    public  Compte(String titulaire ){
        nbTotalCompte++;
        this.numero = nbTotalCompte;
        this.titulaire = titulaire;
        this.solde = 0;
    }
    
    public void crediter(double money){
        this.solde += money;
        System.out.println("------- SUCCES -----");
        System.out.println("Créditer de : " + money);
        System.out.println("--------------------");
    }

    public void debiter(double money){
        this.solde -= money;
        System.out.println("------- SUCCES -----");
        System.out.println("Débité de : " + money);
        System.out.println("--------------------");
    }

    public double getSolde(){
        return this.solde;
    }

    public String getTitre(){
        return this.titre;
    }

    public long getNumero(){
        return this.numero;
    }

    protected void setTitre(String titre){
        this.titre = titre;
    }

    public String toString(){
        return "*************************\n" +
            toStringContent() + "\n" +
            "*************************";
    }

    protected  String toStringContent(){
        return "compte n : " + this.numero + "\n" +
            "titulaire : " + this.titulaire + "\n" +
            "solde : " + this.solde + " euro\n" +
            "type : " + this.titre;
    }
}
