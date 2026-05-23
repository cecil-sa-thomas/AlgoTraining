package TravauxPratique.ComptesBancaires;

public class Remunere extends Compte{
    private double taux;

    public Remunere(String titulaire){
        super(titulaire);
        this.taux = 0.05;
        this.setTitre("Remunere");
    }
    
    public void calculInteret(){
        if(getSolde() > 0){
            System.out.println("-------SUCCES-----");
            System.out.println("Calcul des intérêts : " + this.taux );
            System.out.println("------------------");
            super.crediter(getSolde() * this.taux);
        } else {
            System.out.println("-------ECHEC------");
            System.out.println("Solde insuffisant pour calculer les intérêts");
            System.out.println("------------------");
        }
    }

    public double getTaux(){
        return this.taux;
    }

    protected void setTaux(double taux){
        this.taux = taux;
    }

    @Override
    protected String toStringContent() {
        return super.toStringContent() + "\ntaux : " + this.taux;
    }
}
