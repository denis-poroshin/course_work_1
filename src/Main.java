

public class Main {


    public static Employee[] employee = new Employee[10];


    public static void main(String[] args) {
        employee[0] = new Employee(1, "Иванов", "Иван", "Иванович", 60_000);
        employee[1] = new Employee(2, "Иванов", "Евгений", "Анатольевич", 65_000);
        employee[2] = new Employee(3, "Иванов", "Степан", "Сергеевич", 70_000);
        employee[3] = new Employee(4, "Иванов", "Игнат", "Андреевич", 75_000);
        employee[4] = new Employee(5, "Иванов", "Аркадий", "Семенович", 80_000);


        printAllEmployees(); // Получить список всех сотрудников
        System.out.println();

        System.out.println("Сумма затрат на ЗП в месяц: " + salaryPerMonth()); // Сумма затрат на ЗП в месяц

        System.out.println(minimumSalaryCalculation()); // Сотрудних с менимальной ЗП:

        System.out.println(maximumSalaryCalculation()); // Сотрудних с максимальной ЗП:
        System.out.println();

        System.out.println("Средняя заработная плата: " + calculationOfAverageSalary());
        System.out.println();

       printFullnamesOfEmployees(); // ФИО всех сотрудников

    }
    public static void printAllEmployees(){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            System.out.println(employee[i]);
        }
    }
    public static int salaryPerMonth(){
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            total += employee[i].getSalary();
        }
        return total;
    }
    public static Employee minimumSalaryCalculation(){
        int minSalary = Integer.MAX_VALUE;
        int identifier = 0;
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null){
                break;
            }

            if (minSalary > employee[i].getSalary()){
                minSalary = employee[i].getSalary();
                identifier = i;
            }


        }
        return employee[identifier];


    }
    public static Employee maximumSalaryCalculation(){
        int maxSalary = 0;
        int identifier = 0;
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null){
                break;
            }

            if (maxSalary < employee[i].getSalary()){
                maxSalary = employee[i].getSalary();
                identifier = i;
            }

        }
        return employee[identifier];

    }
    public static int calculationOfAverageSalary(){
        int monthlyEmployeeSalary = 0;
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            total++;
            monthlyEmployeeSalary += employee[i].getSalary();

        }
        if(monthlyEmployeeSalary == 0 || total == 0){
            return 0;
        }else{
            return monthlyEmployeeSalary / total;
        }

    }
    public static void printFullnamesOfEmployees(){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            System.out.println(employee[i].getFamilName() + " " + employee[i].getName() + " " + employee[i].getSurname());

        }

    }



}