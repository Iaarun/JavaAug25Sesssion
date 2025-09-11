package oopsConcepts.encapsulationDemo;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e1 = new Employee();
       /* e1.name="John Doe";
        e1.age=800;
        e1.salary=194194619;
        e1.department="IT";

        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.name);
        System.out.println("Age: " + e1.age);
        System.out.println("Salary: " + e1.salary);
        System.out.println("Department: " + e1.department);
        */
        e1.setName("John Doe");
        e1.setAge(50);
        e1.setSalary(75000);
     //   e1.setDepartment("IT");
        System.out.println("Employee Details:");
        System.out.println("Name: " + e1.getName());
        System.out.println("Age: " + e1.getAge());
        System.out.println("Salary: " + e1.getSalary());
        System.out.println("Department: " + e1.getDepartment());





    }
}
