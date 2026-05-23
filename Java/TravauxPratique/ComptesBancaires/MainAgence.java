package TravauxPratique.ComptesBancaires;

public class MainAgence {
    public static void main(String[] args){
        Agence agence1 = new Agence("BNP", 10);

        Courant compte1 = new Courant("Thomas");
        Securise compte2 = new Securise("Musk");
        Remunere compte3 = new Remunere("Trump");
        RemunereSecurise compte4 = new RemunereSecurise ("Bezoz");
        Courant compte5 = new Courant("Einstein");
        Securise compte6 = new Securise("Tesla");
        Remunere compte7 = new Remunere("Obama");
        RemunereSecurise compte8 = new RemunereSecurise ("Chirac");
        Courant compte9 = new Courant("Zemmour");
        Securise compte10 = new Securise("Cherfi");
        Securise compte11 = new Securise("Test");

        agence1.ajouter(compte1);
        agence1.ajouter(compte2);
        agence1.ajouter(compte3);
        agence1.ajouter(compte4);
        agence1.ajouter(compte5);
        agence1.ajouter(compte6);
        agence1.ajouter(compte7);
        agence1.ajouter(compte8);
        agence1.ajouter(compte9);
        agence1.ajouter(compte10);
        agence1.ajouter(compte11);

        
        

        System.out.println(agence1.getCompte(2));

    }
    
}
