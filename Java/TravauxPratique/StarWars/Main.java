package TravauxPratique.StarWars;

import java.awt.Color;

public class Main {
    public static void main(String[]args){

        Jedi jedi = new Jedi("Obi-Wan", 0, 0, Color.BLUE );
        Jedi sith = new Jedi("Anakin", 0, 0, Color.RED);
        Clone rex = new Clone("Rex", 0, 0);

        System.out.println("\n");
        jedi.allumeSabre();
        sith.allumeSabre();
        rex.allumeBlaster();

        System.out.println("\n");
        jedi.eteintSabre();
        sith.eteintSabre();
        rex.eteintBlaster();

        System.out.println("\n");
        jedi.allumeSabre();
        jedi.eteintSabre();
        jedi.coupSabre(rex);

        System.out.println("\n");
        rex.allumeBlaster();
        rex.tireBlaster(jedi);
        rex.eteintBlaster();
        rex.tireBlaster(jedi);
    }
    
}
