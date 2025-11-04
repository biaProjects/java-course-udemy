package entities;  
  
public class Employee {  
  
    private int id;  
    private String name;  
    private double salary;  
  
    public Employee(int id, String name, double salary) {  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
  
    public int getId() {  
        return id;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setSalary(double salary) {  
        this.salary = salary;  
    }  
  
    public double getSalary() {  
        return salary;  
    }  
  
    public String toString() {  
        return id  
                + ", " + name  
                + ", " + String.format("%.2f", getSalary());  
    }  
}

/*
|                         Employee                        |
| ------------------------------------------------------- |
| - id : Interger<br>- name : String<br>- salary : Double |
|       + increaseSalary(percentage : Double) : void      |
*/