public class Employee {

    private int empId;

    private String empName;

    private String departmentName;

    private double empSalary;

    public Employee() {
    }

    public Employee(int empId, String empName, String departmentName, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.departmentName = departmentName;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }
}
