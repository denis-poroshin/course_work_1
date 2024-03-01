import java.util.Objects;

public class Employee {

    private int department; // Отдел
    private String name; // Имя
    private String familName; // Фамилия
    private String surname; // Отчество
    private int salary; // Зарплата
    public static int id = 0; // id - счетчик
    public Employee (int department, String name, String familName, String surname, int salary){
        this.department = department; // Отдел
        this.name = name; // Имя
        this.familName = familName; // Фамилия
        this.surname = surname; // Отчество
        this.salary = salary; // Зарплата



    }
    public static int sumId(){
        id++;

        return id;
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
        return id;
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
    public void printAllEmployees(){
        for (int i = 0; i < id; i++){
            System.out.println(getName());
        }
    }




    @Override
    public String toString() {
        return "\n" + "Номер отдела: " + department + "\n" + "ФИО: " +  familName + " "
                + name + " " + surname + "\n" + "Зарплата: " + salary;
    }


}

