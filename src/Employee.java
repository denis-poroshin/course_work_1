import java.util.Objects;

public class Employee {


    private int department; // Отдел
    private String name; // Имя
    private String familName; // Фамилия
    private String surname; // Отчество
    private int salary; // Зарплата
    private int id; // id - счетчик
    private static int total;
    public Employee (int department, String familName, String name, String surname, int salary){
        this.department = department; // Отдел
        this.name = name; // Имя
        this.familName = familName; // Фамилия
        this.surname = surname; // Отчество
        this.salary = salary; // Зарплата
        this.id = ++total; // di

    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getFamilName() {
        return familName;
    }

    public String getSurname() {
        return surname;
    }


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getId() {
        return total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(name, employee.name) && Objects.equals(familName, employee.familName) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, name, familName, surname, salary);
    }

    @Override
    public String toString() {
        return "\n" + "id: " + id + "\n" + "Номер отдела: " + department + "\n" + "ФИО: " +  familName + " "
                + name + " " + surname + "\n" + "Зарплата: " + salary;
    }


}

