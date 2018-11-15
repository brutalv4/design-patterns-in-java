package adapter.dao;

import adapter.adapter.EmployeeAdapterCSV;
import adapter.model.Employee;
import adapter.adapter.EmployeeAdapterLdap;
import adapter.model.EmployeeCSV;
import adapter.model.EmployeeDB;
import adapter.model.EmployeeLdap;
import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

  public List<Employee> getEmployeeList() {
    List<Employee> employees = new ArrayList<>();

    EmployeeDB employeeFromDB = new EmployeeDB("1234", "John", "Wick", "john@wick.com");

    employees.add(employeeFromDB);

    // This is where the adapter comes into play!
    EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "han@solo.com");

    employees.add(new EmployeeAdapterLdap(employeeFromLdap));

    EmployeeCSV employeeCSV = new EmployeeCSV("567,Sherlock,Holmes,sherlock@holmes.com");

    employees.add(new EmployeeAdapterCSV(employeeCSV));

    return employees;
  }


}
