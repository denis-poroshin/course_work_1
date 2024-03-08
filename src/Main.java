

public class Main {


    //public static Employee[] employee = new Employee[10];


    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();

        System.out.println(employeeBook.addEmployee(1,"Грибов", "Альберт", "Евгеньевич", 95_000)); // Возвращает true если есть свободное место для сотрудника false если нет

        System.out.println();
        employeeBook.deletingAnEmployee(1); // удаление сотрудника по id

        System.out.println(employeeBook.employeeSearchById(2)); // поиск сотрудника по id
        employeeBook.printAllEmployees(); // печать всех сотрудников







    }




}