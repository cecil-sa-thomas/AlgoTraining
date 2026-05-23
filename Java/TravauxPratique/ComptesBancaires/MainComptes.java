package TravauxPratique.ComptesBancaires;

public class MainComptes {
    public static void main(String[]args){
        Courant compte1 = new Courant("Thomas");
        Securise compte2 = new Securise("Musk");
        Remunere compte3 = new Remunere("Trump");
        RemunereSecurise compte4 = new RemunereSecurise ("Bezoz");

        System.out.println(compte1.toString());
        System.out.println(compte2.toString());
        System.out.println(compte3.toString());
        System.out.println(compte4.toString());

        System.out.println("******************************************************************************************");
        System.out.println("**********************                                                      **************");
        System.out.println("**********************                                                      **************");
        System.out.println("******************************************************************************************");

        System.out.println("Compte 1 : ");
        compte1.crediter(2500);
        compte1.debiter(7000);
        System.out.println(compte1.toString());

        System.out.println("Compte 2 : ");
        compte2.crediter(100);
        compte2.debiter(150);
        System.out.println(compte2.toString());

        System.out.println("Compte 3 : ");
        compte3.crediter(2500);
        compte3.calculInteret();
        System.out.println(compte3.toString());

        System.out.println("Compte 4 : ");
        compte4.crediter(15000);
        compte4.calculInteret();
        compte4.debiter(1500);
        compte4.debiter(35000);
        System.out.println(compte4.toString());
    }
    
}
