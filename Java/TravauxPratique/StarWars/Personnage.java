package TravauxPratique.StarWars;

public class Personnage {
    private String nom;
    private int vie;
    private int posX;
    private int posY;
    private int vitesse;
    private int force;

    public Personnage(String nom,int vie, int posX, int posY, int vitesse, int force){
        this.nom = nom;
        this.vie = vie;
        this.posX = posX;
        this.posY = posY;
        this.vitesse = vitesse;
        this.force = force;
    }
    
    public int getForce(){
        return this.force;
    }

    public String getNom(){
        return this.nom;
    }

    public void seDeplace(int dX, int dY, int dT){
        this.posX += dX * this.vitesse * dT;
        this.posY += dY * this.vitesse * dT;
    }

    public void seBlesse(Arme attackerWP, Personnage attacker){
        int damage = attacker.getForce() * attackerWP.getPuissance();
        this.vie -= damage;
        System.out.println(this.nom + " a subit " + damage + " de dégâts, infligés par " + attacker.getNom());
        if(this.vie < 0 || this.vie == 0) {
            this.vie = 0;
            System.out.println(this.nom + " est mort, il a été tuer par " + attacker.getNom() + " ...............");
        }
    }
}
