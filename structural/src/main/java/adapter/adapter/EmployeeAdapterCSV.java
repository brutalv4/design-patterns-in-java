package adapter.adapter;

import adapter.model.Employee;
import adapter.model.EmployeeCSV;

public class EmployeeAdapterCSV implements Employee {

  private final EmployeeCSV instance;

  public EmployeeAdapterCSV(EmployeeCSV instance) {
    this.instance = instance;
  }

  @Override
  public String getId() {
    return Integer.toString(instance.getId());
  }

  @Override
  public String getFirstName() {
    return instance.getFirstname();
  }

  @Override
  public String getLastName() {
    return instance.getLastname();
  }

  @Override
  public String getEmail() {
    return instance.getEmailAddress();
  }

  @Override
  public String toString() {
    return String.format("%s{ID: %s}", "Employee", getId());
  }
}
