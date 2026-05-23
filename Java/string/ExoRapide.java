package string;

import java.util.HashMap;
import java.util.Map;

public class ExoRapide {
    public void main(String[] args){
        String s = " Bonjour";
        System.out.println(s.trim().toLowerCase().replace("frere", "salut"));

        s = "Java est cool";
        System.out.println(s.substring(5, 8));

        s = "Bonjour le monde";
        String[] mots = s.split(" ");
        System.out.println(mots[1]);

        s = "Bonjour";
        System.out.println(s.charAt(3));

        s = "Bonjour";
        System.out.println(s.indexOf("z"));
        
        String s1 = "Bonjour";
        String s2 = "bonjour";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        String s3 = "palap";
        String s4 = "antithèse";
        System.out.println(palindrome(s4));
        System.out.println(palindrome(s3));

        s = "aBraCAdaBRA";
        System.out.println(nbVoyelles(s));

        s = "Boonjour le monde des enfer";
        System.out.println(inverseMots(s));

        s2 = "Boonjour le monde des enfer DOOOOOOOOOOOOOOOOOOOOOOE";
        System.out.println(longest(s));
        System.out.println(longest2(s2));

        s3 ="XDXD";
        System.out.println(doublon(s3));
        s3 = "bcdfg";
        System.out.println(doublon(s3));

        s4 = "bcbg";
        System.out.println(frequence(s4));

    }

    public boolean palindrome(String s){
        //return s.equals(new StringBuilder(s).reverse().toString()); // ça fait le café 
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int nbVoyelles(String s){
        int compteur = 0;
        String voyelles = "aeiouyAEIOUY";

        for(int i = 0 ; i < s.length() ; i++){
            if (voyelles.contains(String.valueOf(s.charAt(i)))) {
                compteur++;
            }
        }
        return compteur;
    }

    public String inverseMots(String s){
        /*
            List<String> mots = new ArrayList<>(Arrays.asList(s.split(" ")));
            Collections.reverse(mots);
            return String.join(" ", mots);
        */

        String [] sTab = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < sTab.length / 2 ; i++){
            String temp = sTab[i];
            sTab[i] = sTab[sTab.length - 1 - i ];
            sTab[sTab.length - 1 - i ] = temp;
        }

        for(int i = 0; i < sTab.length ; i++){
            if(i != sTab.length - 1) sb.append(sTab[i] + " ");
            else sb.append(sTab[i]);
        }
        String resultat = sb.toString();

        return resultat;
    }

    public String longest(String s ){
        /*
        String plusLong = ""; 
        for (String mot : s.split(" ")) {
            if (mot.length() > plusLong.length()) {
                plusLong = mot;
            }
        }
        return plusLong;
        */
        int longest = 0;
        String [] sTab = s.split(" ");

        for(int i = 0; i < sTab.length - 1 ; i++){
            if(sTab[longest].length() < sTab[i + 1].length()){
                longest = i + 1;
            }
        }

        return sTab[longest];
    }

    public String longest2(String s){
        String longest = "";
        for(String mot : s.split(" ")){
            if(mot.length() > longest.length()) longest = mot;
        }
        return longest;
    }

    public boolean doublon(String s){
        /*
            Set<Character> chars = new HashSet<>();
            for (char c : s.toCharArray()) {
                if (!chars.add(c)) return false; // add() retourne false si doublon
            }
            return true;
         */
        for(int i = 0; i < s.length() - 1 ; i++){
            for(int j = i + 1; j < s.length() ; j++){
                if(s.charAt(i) == (s.charAt(j))){
                    return false;
                }
            }
        }
        return true;
    }

    public char frequence(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length() ; i++){
            if(map.get(s.charAt(i)) == null){
                map.put(s.charAt(i), 1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }
        }

        char plusFrequent = ' ' ;
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                plusFrequent = entry.getKey();
            }
        }
        return plusFrequent;
    }
}
