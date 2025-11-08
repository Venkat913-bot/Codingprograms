import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpTestClass {

    public static void main(String[] args) {

        List<Employee> employeeList =new ArrayList<>();

        employeeList.add(new Employee(1, "venkat", "UI Team", 20000.00));

        employeeList.add(new Employee(2, "Hari", "Dev Team", 40000.00));

        employeeList.add(new Employee(3, "sony", "QA Team", 30000.00));

        employeeList.add(new Employee(4, "ami", "Hr Team", 10000.00));

        Map<String, Double> salarySum = new HashMap<>();
        for (Employee e : employeeList) {
            salarySum.put(e.getDepartmentName(), salarySum.getOrDefault(e.getDepartmentName(), 0.0) + e.getEmpSalary());
        }

        System.out.println(salarySum);

    }
}
