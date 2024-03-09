package generic_datastructure.linked_list;


import use_case_impl.model.Employe;

//Helper class (Generic LinkedList class)
public class List <T>{

    // Generic node instance
    public Node<T> head;

    //Data member to store length of list
    public int length = 0;

    //Default constructor
    public List(){this.head = null;}

    //Method
    //To add node at the end of list
    public  void add(T data){

        //Creating a new node with given value
        Node<T> temp = new Node<>(data);

        //Checking if list is empty
        //and assiging new value to head node
        if(this.head == null){
            head = temp;
        }// If list already exists
        else {
            //Temporary node for traversal
            Node<T> X = head;

            //Iterating till end of this list
            while(X.next != null){
                X = X.next;
            }

            //Adding new value node at the end of list
            X.next = temp;
        }
        //Increase length after adding new node
        length++;
    }

    @Override
    public String toString() {
        String S = "[";
        Node<T> X = head;

        if (X == null)
            return S + "]";

        while (X.next != null) {
            S += String.valueOf(X.data) + ",";
            X = X.next;
        }

        S += String.valueOf(X.data);
        return S+ "]";
    }

}






















