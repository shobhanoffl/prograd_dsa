package solvedprobs;

class Employee{
    int id;
    String name;
}

class SalariedEmployee extends Employee{
    double salary;

    public void calculatePay(){
        System.out.println("Monthly Salary of "+name+" with ID "+id+" is Rs."+salary+"/-");
    }
}

class HourlyEmployee extends Employee{
    double hourlyRate;
    double hoursWorked;

    public void calculatePay(){
        System.out.println("Weekly Salary of "+name+" with ID "+id+" is Rs."+(hourlyRate*hoursWorked)+"/-");
    }
}
public class PayrollProcessor {
    public static void main(String[] args) {
        SalariedEmployee newEmp1 = new SalariedEmployee();
        newEmp1.id=1;
        newEmp1.name="Kumar";
        newEmp1.salary=50000;
        newEmp1.calculatePay();

        HourlyEmployee newEmp2 = new HourlyEmployee();
        newEmp2.id=1;
        newEmp2.name="Tom";
        newEmp2.hourlyRate=300;
        newEmp2.hoursWorked=90;
        newEmp2.calculatePay();

    }
}
