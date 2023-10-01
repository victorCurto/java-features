public record EmployeeRecord(String name, int employeeNumber) {

    public static final String DEFAULT_EMPLOYEE_NAME = "Vitor";

    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public EmployeeRecord {
        if(employeeNumber <0){
            throw new IllegalArgumentException("employeeNumber cannot be negative");
        }
    }

    public static void printWhatever(){
        System.out.println("Whatever");
    }
}
