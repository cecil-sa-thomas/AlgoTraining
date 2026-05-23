package dataStructure.listChain;

public class LinkedList {
    Node head;
    
    public static Node add(int value, Node head){
        Node newNode = new Node();
        newNode.value = value;
        newNode.next = null;

        if (head == null) {
            head = newNode;
            return head;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    public static Node remove(int target, Node head){
        if (head == null) {
            return head;
        }else if (head.value == target) {
            head = head.next;
            return head;
        }else{
            Node current = head;
            while (current.next != null) {
                if(current.next.value == target){
                    current.next = current.next.next;
                    return head;
                }else{
                    current = current.next;
                }
            }
            return head;
        }
    }

    public static void display(Node head){
        Node current = head;
        while (current.next != null) {
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println(current.value);
    }
}
