package lab2;
import com.sun.javafx.scene.traversal.SubSceneTraversalEngine;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Date;
import java.util.regex.Pattern;
import  java.io.*;

/**
 * Created by Валентин on 27.09.2016.
 */
public class Employee implements Comparable<Employee> {
    private String Name;                              // імя
    private Date Pirthday;                             // день народження
    private String Name_department;                     // назва департамента
    private String Position;                             // посада
    private int Salary;                                   // заробітня плата
    private Date Data;                                     // дата прийому на роботу


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Date getPirthday() {

        return Pirthday;
    }

    public String getName_department() {
        return Name_department;
    }

    public void setName_department(String name_department) {
        this.Name_department = name_department;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        this.Position = position;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        this.Salary = salary;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }


    // дадавання працівника
    protected Employee Add(String Name, int Pirtday, String dapartament, String posision, int salaru ) {
        Employee t1 = new Employee();
        Scanner scan = new Scanner(System.in);

        t1.setName( Name);
        t1.setName_department(dapartament);
        t1.setPosition(posision);
        t1.setSalary(salaru);
        return t1;
    }

    // видалення працівника
    protected void Remov (ArrayList <Employee> List, String NameEmployee)
    {
        for (int i = 0; i< List.size(); ++i) {
         if (List.get(i).getName() == NameEmployee)
            List.remove(i);
        }
    }


   // переведення працівника в інший відділ
    protected void transver (ArrayList<Employee> L ,String Name_departamebt, String NameEmployee) {
        for (int i = 0; i < L.size(); ++i)
        {
           if (NameEmployee == L.get(i).getName())
           {
               L.get(i).setName_department(Name_departamebt);
               System.out.print("\n Працівник  переведений!");
               System.exit(0);

           }
        }
         System.out.print("\n Працівник НЕ переведений!");
    }


    @Override
    public int compareTo( Employee o)
    {
        return this.Name.compareTo(o.getName());
    }
}





