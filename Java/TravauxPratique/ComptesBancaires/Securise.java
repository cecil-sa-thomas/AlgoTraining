package TravauxPratique.ComptesBancaires;
public class Securise extends Compte{
    public Securise(String titulaire){
        super(titulaire);
        this.setTitre("Securise");
    }

    @Override
    public void debiter(double money){
        if(money > this.getSolde()) {
            System.out.println("-------ECHEC-----");
            System.out.print("Solde insuffisant");
            System.out.println("------------------");
        }
        else super.debiter(money);;
    }
}
