package udemy.datastructure.linklists.leetcode.singly_link_list;

public class FindMiddleNode {

    private Node head;
    private Node tail;
    class Node{
        int value;
        int next;

        Node(int Value){
            this.value =  value;
        }
    }

    public FindMiddleNode(int value){
        Node newNode = new Node(value);
        head =  newNode;
        tail = newNode;
    }

    public Node getHeada(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    
}
