

public class Main {

    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.addEmployee(new Employee(1, "Иванов", "Иван", "Иванович", 60_000));
        employeeBook.addEmployee(new Employee(2, "Иванов", "Евгений", "Анатольевич", 65_000));
        employeeBook.addEmployee(new Employee(3, "Иванов", "Степан", "Сергеевич", 70_000));
        employeeBook.addEmployee(new Employee(4, "Иванов", "Игнат", "Андреевич", 75_000));
        employeeBook.addEmployee(new Employee(5, "Иванов", "Аркадий", "Семенович", 80_000));
        employeeBook.addEmployee(new Employee(1, "Иванов", "Станеслав", "Аркадьевич", 70_000));
        System.out.println(employeeBook.addEmployee(new Employee(1,"Грибов", "Альберт", "Евгеньевич", 95_000))); // Возвращает true если есть свободное место для сотрудника false если нет


        employeeBook.deletingAnEmployee(1); // удаление сотрудника по id

        System.out.println(employeeBook.employeeSearchById(2)); // поиск сотрудника по id
        employeeBook.printAllEmployees(); // печать всех сотрудников







    }




}