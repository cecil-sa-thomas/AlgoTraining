package string;

public class Palindrome {
    public static void main(String[] args){

        String test1 = "coloc";
        String test2 = "elle";
        String test3 = "il";
        String test4 = "syndrôme";
        String test5 = "rotor";
        
        System.out.println("?" + test1 + " : " + palindrome(test1));
        System.out.println("?" + test1 + " : " + palindrome(test2));
        System.out.println("?" + test1 + " : " + palindrome(test3));
        System.out.println("?" + test1 + " : " + palindrome(test4));
        System.out.println("?" + test1 + " : " + palindrome(test5));
        
    }
    
    public static boolean palindrome(String str){
        int i = 0;
        while(i < str.length()/ 2){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }else{ i++;}
        }
        return true;
    }
}
