package generic_datastructure.linked_list;

//Generic node class for linked list
public class Node<T>{

    //Data member

    //1.Storing value of node
    public T data;
    //2.Storing next node address
    public Node<T> next;

    //Parameterized constructor to assign vslue
    public Node (T data){
        //this keyword refers to current object itself
        this.data = data;
        this.next = null;
    }
}






















