package pepcoding.level1.llinklistcode;

public class AddLast {

    public static class Node{

        int data;
        Node next;
    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        void addList(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;
            if(size == 0){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        @Override
        public String toString() {
            String S = "[";
            Node X = head;

            if (X == null)
                return S + "]";

            while (X.next != null) {
                S += X.data + ",";
                X = X.next;
            }

            S += X.data;
            return S+ "]";
        }
    }

    public static void main(String [] args){
        LinkedList newLinkedList = new LinkedList();
        newLinkedList.addList(10);
        newLinkedList.addList(20);
        System.out.println(newLinkedList);
    }
}
