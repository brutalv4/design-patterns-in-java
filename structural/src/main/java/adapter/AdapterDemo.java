package adapter;

import adapter.dao.EmployeeClient;
import adapter.model.Employee;
import java.util.List;

public class AdapterDemo {

  public static void main(String[] args) {

    List<Employee> employees = new EmployeeClient().getEmployeeList();

    System.out.println(employees);
  }
}
