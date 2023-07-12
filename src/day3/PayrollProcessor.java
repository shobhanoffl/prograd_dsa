/*
You are asked to create a payroll system for a company. The company has two types of employees: SalariedEmployee and HourlyEmployee. The calculatePay() method is common for both the types
The SalariedEmployee class has the following attributes:
name (string)
salary (double)
The HourlyEmployee class has the following attributes:
name (string)
hourlyRate (double)
hoursWorked (double)
The calculatePay() method for SalariedEmployee should calculate the monthly salary, while the calculatePay() method for HourlyEmployee should calculate the weekly pay based on the hourly rate and hours worked. Write a java code snippet to demonstrate the usage of these classes.
*/
package day3;

class Employee{
    int id;
    String name;

    public void calculatePay(String name, int id, double salary){
        System.out.println("Monthly Salary of "+name+" with ID "+id+" is Rs."+salary+"/-");
    }

    public void calculatePay(String name, int id, double hourlyRate, double hoursWorked){
        System.out.println("Weekly Salary of "+name+" with ID "+id+" is Rs."+(hourlyRate*hoursWorked)+"/-");
    }
}

class SalariedEmployee extends Employee{
    double salary;
}

class HourlyEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;
}
public class PayrollProcessor {
    public static void main(String[] args) {
        SalariedEmployee newEmp1 = new SalariedEmployee();
        newEmp1.id=1;
        newEmp1.name="Kumar";
        newEmp1.salary=50000;
        newEmp1.calculatePay(newEmp1.name, newEmp1.id, newEmp1.salary);

        HourlyEmployee newEmp2 = new HourlyEmployee();
        newEmp2.id=1;
        newEmp2.name="Tom";
        newEmp2.hourlyRate=300;
        newEmp2.hoursWorked=90;
        newEmp1.calculatePay(newEmp2.name, newEmp2.id, newEmp2.hourlyRate, newEmp2.hoursWorked);

    }
}
