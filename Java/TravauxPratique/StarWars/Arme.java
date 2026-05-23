package TravauxPratique.StarWars;

public class Arme {

    private boolean allume;
    private int puissance;

    public Arme(int puissance){
        this.puissance = puissance;
        this.allume = false;
    }

    public boolean getAllume(){
        return this.allume;
    }

    public int getPuissance(){
        return this.puissance;
    }

    public void allumer(){
        this.allume = true;
    }

    public void eteindre(){
        this.allume = false;
    }

    
}
