package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class grapheGare {
    public static void main(String [] args){

        HashMap<String,List<String>> mapGare = new HashMap<>();

        mapGare.put("Gare du nord", new ArrayList<>(List.of("Châtelet", "Plaine Stade de France")));
        mapGare.put("Châtelet", new ArrayList<>(List.of("Gare du nord", "Saint Michel Notre Dame", "Hôtel de Ville")));
        mapGare.put("Plaine Stade de France", new ArrayList<>(List.of("Gare du nord", "Saint Denis")));
        mapGare.put("Saint Michel Notre Dame", new ArrayList<>(List.of("Châtelet", "Denfert Rochereau")));
        mapGare.put("Hôtel de Ville", new ArrayList<>(List.of("Châtelet", "Bastille")));
        mapGare.put("Saint Denis", new ArrayList<>(List.of("Plaine Stade de France")));
        mapGare.put("Denfert Rochereau", new ArrayList<>(List.of("Saint Michel Notre Dame", "Montrouge")));
        mapGare.put("Bastille", new ArrayList<>(List.of("Hôtel de Ville", "Nation")));
        mapGare.put("Nation", new ArrayList<>(List.of("Bastille")));
        mapGare.put("Montrouge", new ArrayList<>(List.of("Denfert Rochereau")));

        String depart = "Gare du nord";
        String arrivee = "Nation";

        Queue<String> file = new LinkedList<>();
        Set<String> dejaVu = new HashSet<>();
        Map<String, String> parents = new HashMap<>();
        Stack<String> chemin = new Stack<>();


        file.add(depart);
        dejaVu.add(depart);

        while(!file.isEmpty()){
            String current = file.poll();
            System.out.println("J'explore : " + current);

            if(current.equals(arrivee)){
                System.out.println("Gare trouvée !");

                String etape = arrivee;
                while(!etape.equals(depart)){
                    chemin.push(etape);
                    etape = parents.get(etape);
                }
                chemin.push(depart);
                break;
            }
            List<String> voisins = mapGare.get(current);
            for(int i = 0; i < voisins.size(); i++){
                if(!dejaVu.contains(voisins.get(i))){
                    file.add(voisins.get(i));
                    dejaVu.add(voisins.get(i));
                    parents.put(voisins.get(i),current);
                }
            }
        }
        while(!chemin.isEmpty()){
            System.out.print(chemin.pop());
            if(!chemin.isEmpty()) System.out.print(" -> ");
        }
    }
}
