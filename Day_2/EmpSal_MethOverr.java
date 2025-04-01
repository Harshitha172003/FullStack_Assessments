package Day2_Day3;

class Employee {
    public int calculateSalary() {
        return 50000;
    }
}

class Manager extends Employee {
    @Override
    public int calculateSalary() {
        return super.calculateSalary() + 10000;
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();
        System.out.println(emp.calculateSalary()); // 50000
        System.out.println(mgr.calculateSalary()); // 60000
    }
}
