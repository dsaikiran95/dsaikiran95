class Member {
     String name;
     int age;
     String phoneNumber;
     String address;
     double salary;

    Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    void printSalary() {
        System.out.println("Salary " + salary);
    }
}

class Employee extends Member {
     String specialization;

     Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
}

 class Manager extends Member{
     String department;

     Manager(String name, int age, String phoneNumber,
                    String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
}

class main27 {
    public static void main(String[] args) {
        Employee employee = new Employee("SAI", 30, "9542XXXX", "AMBERPET", 250000, "PHARMA");
        Manager manager = new Manager("PRASHANTH", 28, "73820XXXX", "MEDCHAL", 350000, "PHARMA");
       
        employee.printSalary();
        manager.printSalary();
    }
}
