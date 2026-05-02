package dataStructure;

import java.util.HashMap;

public class occurencesMots {
    public static void main(String[]arg){

        String phrase = "bonjour je suis je bonjour bonjour";
        String[] mots = phrase.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0 ; i < mots.length ; i++ ){
            if(map.get(mots[i]) != null){
                map.put(mots[i], map.get(mots[i]) + 1);
            }else {
                map.put(mots[i],1);
            }
        }
        
            System.out.println(map);
    }
}
