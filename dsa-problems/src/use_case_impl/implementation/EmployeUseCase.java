package use_case_impl.implementation;

import generic_datastructure.linked_list.List;
import use_case_impl.model.Employe;

public class EmployeUseCase{

    public static void main(String[] args) {
        List<Employe> employeList = new List<>();
        Employe employe = new Employe("ranjeet", 24, "998776655");
        Employe employe1 = new Employe("gopal", 25, "1122334455");
        Employe employe2 = new Employe("aman", 24, "998776655");
        employeList.add(employe);
        employeList.add(employe1);
        employeList.add(employe2);

        System.out.println(employeList);
    }
}
