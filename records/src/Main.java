public class Main {

    public static void main(String[] args) {

        //Records
        EmployeeClass employee = new EmployeeClass("Jerry", 1245);
        System.out.println(employee.getName());
        System.out.println(employee);

        EmployeeRecord employeeRecord = new EmployeeRecord("Vitor", 54321);
        System.out.println(employeeRecord.name());
        System.out.println(employeeRecord.nameInUpperCase());
        EmployeeRecord.printWhatever();
        System.out.println(employeeRecord);
    }
}