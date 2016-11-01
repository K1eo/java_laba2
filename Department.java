package lab2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Валентин on 04.10.2016.
 */
public class Department
{
  private String NameDepartment;
    private List<Employee> employees = new ArrayList<>();
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    public boolean addEmployee(Employee employee, String Name){
        //TODO if employee is exists
        setNameDepartment( Name);
        return  employees.add(employee);
    }
  public String getNameDepartment (){return this.NameDepartment;}
  public void setNameDepartment (String name){this.NameDepartment = name;}

  // зарплата на відділення
    protected double SalaruDepartament ( ArrayList<Employee> List1, String NameDepartament) {
        double sum = 0;
        for (int i = 0; i < List1.size(); ++i) {
            if (List1.get(i).getName_department() == NameDepartament)
                sum += List1.get(i).getSalary();
        }
            return sum;

    }

    // середня зарплата відділення
    protected double SalaruAverage (ArrayList<Employee> List1,String NameDepartament)
    {
        return  SalaruDepartament(List1,NameDepartament)/ List1.size();
    }

    // працівник з найменшою заробітньою платою
    protected Employee minSalary (ArrayList <Employee> L) {
        Employee employee = new Employee();
        employee.setSalary(L.get(0).getSalary());
        for (int i = 1 ;i < L.size(); ++i) {
            if (employee.getSalary() > L.get(i).getSalary())
                employee = L.get(i);
        }
        return employee;
    }

    // працівник з найбільшою заробітньою платою
    protected Employee maxSalary (ArrayList <Employee> L) {
        Employee emplpoyee = new Employee();
        emplpoyee.setSalary(0);
        for (int i = 0; i < L.size(); ++i) {
            if (emplpoyee.getSalary() < L.get(i).getSalary())
                emplpoyee =L.get(i);
        }
        return emplpoyee;
    }




}

