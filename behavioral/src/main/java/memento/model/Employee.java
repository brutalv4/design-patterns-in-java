package memento.model;

import lombok.Data;

//originator
@Data
public class Employee {

  private String name;
  private String address;
  private String phone;

  EmployeeMemento save() {
    return new EmployeeMemento(name, phone);
  }

  void revert(EmployeeMemento memento) {
    name = memento.getName();
    phone = memento.getPhone();
  }
}

