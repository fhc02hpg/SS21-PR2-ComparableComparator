package live.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortEmployees {

    public static void main(String[] args) {

        Employee[] employees = {
            new Employee(123,"Emma",6_700.00,"Research"),
            new Employee(901,"John",5_500.00,"Sales"),
            new Employee(768, "Bruce",3_500.00,"Office"),
        };

        System.out.println(Arrays.toString(employees));

        Arrays.sort(employees);

        System.out.println(Arrays.toString(employees));

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee(123,"Emma",6_700.00,"Research"));
        employeesList.add(new Employee(901,"John",5_500.00,"Sales"));
        employeesList.add(new Employee(768, "Bruce",3_500.00,"Office"));


        System.out.println(employeesList);

        Collections.sort(employeesList);

        System.out.println(employeesList);

    }

}
