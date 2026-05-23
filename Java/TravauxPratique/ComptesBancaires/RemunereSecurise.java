package TravauxPratique.ComptesBancaires;

public class RemunereSecurise extends Remunere{
    public RemunereSecurise(String titulaire){
        super(titulaire);
        this.setTitre("Remunere et Securise");
        this.setTaux(0.03);
    }
    @Override
    public void debiter(double money){
        if(money > this.getSolde()) {
            System.out.println("------- ECHEC ------");
            System.out.print("Solde insuffisant");
            System.out.println("--------------------");
        }
        else super.debiter(money);;
    }
}
