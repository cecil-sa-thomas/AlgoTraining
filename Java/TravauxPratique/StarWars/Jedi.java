package TravauxPratique.StarWars;
import java.awt.Color;

public class Jedi extends Personnage {

    private Sabre sabreLaser;

    public Jedi(String nom, int posX, int posY, Color couleur){
        super(nom, 100, posX, posY,5, 10);
        this.sabreLaser = new Sabre(couleur);
    }

    public void allumeSabre(){
        System.out.println(this.getNom() + " allume son sabre");
        this.sabreLaser.allumer();
    }

    public void eteintSabre(){
        System.out.println(this.getNom() + " éteint son sabre");
        this.sabreLaser.eteindre();
    }

    public void coupSabre(Personnage victim){
        if(this.sabreLaser.getAllume()){ //bolean
            victim.seBlesse(this.sabreLaser, this);
        }else{
            System.out.println(this.getNom() + " : J'ai oublié d'allumer mon sabre !");
        }
    }

    public void parler(){
        System.out.println(this.getNom() + " : Que la force soit avec vous !");
    }
}
