package dataStructure.listChain;

public class Main {
    public static void main(String[] args){
        LinkedList liste = new LinkedList();
        liste.head = LinkedList.add(1, liste.head);
        liste.head = LinkedList.add(2, liste.head);
        liste.head = LinkedList.add(3, liste.head);
        LinkedList.display(liste.head);
        liste.head =LinkedList.remove(2, liste.head);
        LinkedList.display(liste.head);
    }
    
}
