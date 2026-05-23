package TravauxPratique.StarWars;

public class Clone extends Personnage {

    private Blaster blast;

    public Clone(String nom, int posX, int posY){
        super(nom, 100, posX, posY, 4, 2);
        this.blast = new Blaster();
    }

    public void allumeBlaster(){
        System.out.println(this.getNom() + " allume son blaster");
        this.blast.allumer();
    }

    public void eteintBlaster(){
        System.out.println(this.getNom() + " éteint son blaster");
        this.blast.eteindre();
    }

    public void tireBlaster(Personnage victim){
        if(this.blast.getAllume()){ //bolean
            victim.seBlesse(this.blast, this);
        }else{
            System.out.println(this.getNom() + " : J'ai oublié d'allumer mon blaster !");
        }
    }

    public void parler(){
        System.out.println(this.getNom() + " : Je m'appelle " + this.getNom());
    }
}
