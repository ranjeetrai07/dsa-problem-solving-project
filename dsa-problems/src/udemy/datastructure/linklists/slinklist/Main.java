package udemy.datastructure.linklists.slinklist;

public class Main {

    public static void main(String [] args) {

        LinkedList firstNode = new LinkedList(25);
        LinkedList secondNode = new LinkedList(45);

        firstNode.append(10);
        firstNode.prepand(36);

//        System.out.println(firstNode.removeFirst().value);
//        System.out.println(firstNode.removeLast().value);


        firstNode.printLinkedList();
        firstNode.getHead();
        firstNode.getTail();
        firstNode.getLength();
        System.out.println();
        firstNode.reverse();
        firstNode.printLinkedList();
        firstNode.getHead();
        firstNode.getTail();
        firstNode.getLength();
//        System.out.println(firstNode.get(0).value);
//        System.out.println(firstNode.set(0, 90));
//        System.out.println(firstNode.insert(2, 75));
//        System.out.println();
//        firstNode.printLinkedList();
//        System.out.println(firstNode.remove(2));
//        firstNode.printLinkedList();

//        secondNode.printLinkedList();
//        secondNode.getHead();
//        secondNode.getTail();
//        secondNode.getLength();

//        System.out.println(firstNode.removeLast().value);
//        System.out.println(firstNode.removeLast());
    }
}
