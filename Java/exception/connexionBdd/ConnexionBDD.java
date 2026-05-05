import java.sql.SQLException;

public class ConnexionBDD {
    public static void connexionBDD(String serveur) throws SQLException {
        if(serveur == null || serveur.equals("")) throw new IllegalArgumentException("Connexion avec la base de donnée a échoué");
        if(serveur.equals("serveur_mort")) throw new SQLException("L'adresse du serveur est invalide");
    }
    public static void main(String[] args) {
        try{
            connexionBDD(null);
        }catch(IllegalArgumentException  e){
            System.out.println(e);
        }catch(SQLException e){
            System.out.println(e);
        }
        
        try{
            connexionBDD("");
        }catch(IllegalArgumentException  e){
            System.out.println(e);
        }catch(SQLException e){
            System.out.println(e);
        }
        try{
            connexionBDD("serveur_mort");
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
