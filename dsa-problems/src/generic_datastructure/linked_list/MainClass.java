package generic_datastructure.linked_list;

import use_case_impl.model.Employe;

public class MainClass {

    // main driver method
    public static void main(String[] args){

        //Integer  List

        //Creating new empty Integer linked list
        List<Integer> list1 = new List<>();
        System.out.println("Integer LinkedList created as list1 : ");

        //Adding elements to the above List object
        list1.add(100);
        list1.add(200);
        list1.add(300);

        System.out.println("List1 after adding value : ");
        System.out.println(list1);

        List<Employe> employeList = new List<>();
        Employe employe = new Employe("ranjeet", 10, "998776655");
        employeList.add(employe);
        System.out.println(employeList);
    }
}
































