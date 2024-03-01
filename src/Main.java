

public class Main {

    //Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];


        employees[0] = new Employee(1, "Иванов", "Иван", "Иванович", 60_000);
        employees[1] = new Employee(2, "Иванов", "Евгений", "Анатольевич", 65_000);
        employees[2] = new Employee(3, "Иванов", "Степан", "Сергеевич", 70_000);
        employees[3] = new Employee(4, "Иванов", "Игнат", "Андреевич", 75_000);
        employees[4] = new Employee(5, "Иванов", "Аркадий", "Семенович", 80_000);

        printAllEmployees(employees); // Получить список всех сотрудников
        System.out.println();

        System.out.println("Сумма затрат на ЗП в месяц: " + salaryPerMonth(employees)); // Сумма затрат на ЗП в месяц
        System.out.println();
        minimumSalaryCalculation(employees); // Сотрудних с менимальной ЗП:
        System.out.println();
        maximumSalaryCalculation(employees); // Сотрудних с максимальной ЗП:
        System.out.println();
        System.out.println("Средняя заработная плата: " + calculationOfAverageSalary(employees));
        System.out.println();
        printFullnamesOfEmployees(employees); // ФИО всех сотрудников



    }
    public static void printAllEmployees(Employee[] employees){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                break;
            }
            System.out.print("id: " + Employee.sumId());
            System.out.println(employees[i]);

        }
    }
    public static int salaryPerMonth(Employee[]employees){
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                break;
            }
            total += employees[i].getSalary();

        }
        return total;
    }
    public static void minimumSalaryCalculation(Employee[]employees){
        int minSalary = salaryPerMonth(employees);
        int identifier = 0;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] == null){
                break;
            }

            if (minSalary > employees[i].getSalary()){
                minSalary = employees[i].getSalary();
                identifier = i;
            }

        }
        System.out.println("Сотрудних с менимальной ЗП: " + employees[identifier]);

    }
    public static void maximumSalaryCalculation(Employee[]employees){
        int maxSalary = 0;
        int identifier = 0;
        for (int i = 0; i < employees.length; i++) {

            if (employees[i] == null){
                break;
            }

            if (maxSalary < employees[i].getSalary()){
                maxSalary = employees[i].getSalary();
                identifier = i;
            }

        }
        System.out.println("Сотрудних с максимальной ЗП: " + employees[identifier]);

    }
    public static int calculationOfAverageSalary(Employee[]employees){
        int monthlyEmployeeSalary = salaryPerMonth(employees);
        int total = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                break;
            }
            total++;

        }
        return  (monthlyEmployeeSalary / total);


    }
    public static void printFullnamesOfEmployees(Employee[]employees){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                break;
            }
            System.out.println(employees[i].getFamilName() + " " + employees[i].getName() + " " + employees[i].getSurname());

        }

    }



}