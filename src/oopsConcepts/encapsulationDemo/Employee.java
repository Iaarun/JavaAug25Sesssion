package oopsConcepts.encapsulationDemo;

public class Employee {
    //all data memebers should be private
 private    String name;
  private   int age;
  private   double salary;
  private   String department = "IT";

//getter and setter methods for each data member


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=18 && age<=100){
            this.age = age;
        }else{
            System.out.println("Invalid age. Age should be between 18 and 100.");
        }

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }
/*
    public void setDepartment(String department) {
        this.department = department;
    }

 */
}
