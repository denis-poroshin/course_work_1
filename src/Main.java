import org.w3c.dom.ls.LSOutput;

public class Main {


    public static Employee[] employee = new Employee[10];


    public static void main(String[] args) {
        employee[0] = new Employee(1, "Иванов", "Иван", "Иванович", 60_000);
        employee[1] = new Employee(2, "Иванов", "Евгений", "Анатольевич", 65_000);
        employee[2] = new Employee(3, "Иванов", "Степан", "Сергеевич", 70_000);
        employee[3] = new Employee(4, "Иванов", "Игнат", "Андреевич", 75_000);
        employee[4] = new Employee(5, "Иванов", "Аркадий", "Семенович", 80_000);
        employee[5] = new Employee(1, "Иванов", "Станеслав", "Аркадьевич", 70_000);


        printAllEmployees(); // Получить список всех сотрудников
        System.out.println();

        System.out.println("Сумма затрат на ЗП в месяц: " + salaryPerMonth() + " рублей"); // Сумма затрат на ЗП в месяц

        System.out.println(minimumSalaryCalculation()); // Сотрудних с менимальной ЗП:

        System.out.println(maximumSalaryCalculation()); // Сотрудних с максимальной ЗП:
        System.out.println();

        System.out.println("Средняя заработная плата: " + calculationOfAverageSalary() + " рублей");
        System.out.println();

       printFullnamesOfEmployees(); // ФИО всех сотрудников


        indexingSalary(10); // Индексации ЗП
        printAllEmployees(); //Индексации ЗП
        System.out.println();





        System.out.println("Сотрудник с минимальной заработной палатой в отделе: " + minSalaryForTheDepartment(1) + " рублей"); // Минимальная зп по отдулу

        System.out.println("Сотрудник с максимальной заработной палатой в отделе: " + maxSalaryForTheDepartment(1) +  " рублей"); // Максимальная зп по отдулу
        System.out.println();




        System.out.println("Сумму затрат на заработная плата по отделу: " + calculationOfSalaryCostsInTheDepartment(1) + " рублей"); // Сумму затрат на заработная плата по отделу
        System.out.println();
        System.out.println("Средняя заработная плата по отделу: " + calculationOfTheAverageSalaryForTheDepartment(1) + " рублей"); //Средняя заработная плата по отделу
        salaryIndexationInTheDepartment(1, 10); // Индексация зп



        printAllEmployeesAndSalaryIncrease(1); // Печать сотрудников по отделу



        printAllEmployeesAreLessThanTheNumber(80_000); // Печать сотруников меньше числа
        printAllEmployeesAreGreaterThanTheNumber(80_000); // Печать сотруников больше или равно числа





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



    ///////////////////// Повышенная сложность
    public static void indexingSalary(int percent){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            int amountIndexingField = employee[i].getSalary() * percent / 100 + employee[i].getSalary();
            employee[i].setSalary(amountIndexingField);
        }

    }
    public static Employee minSalaryForTheDepartment(int department){
        int minSalary = Integer.MAX_VALUE;
        int minIdentifier = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (department == employee[i].getDepartment()) {
                if (employee[i].getSalary() < minSalary) {
                    minSalary = employee[i].getSalary();
                    minIdentifier = i;
                }
            }
        }
        return employee[minIdentifier];
    }
    public static Employee maxSalaryForTheDepartment(int department){
        int maxSalary = 0;
        int maxIdentifier = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (department == employee[i].getDepartment()) {
                if (employee[i].getSalary() > maxSalary) {
                    maxSalary = employee[i].getSalary();
                    maxIdentifier = i;

                }

            }
        }
        return employee[maxIdentifier];
    }
    public static int calculationOfSalaryCostsInTheDepartment(int department){
        int salaryAmountByDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (department == employee[i].getDepartment()) {
                salaryAmountByDepartment += employee[i].getSalary();

            }
        }
        return salaryAmountByDepartment;
    }
    public static int calculationOfTheAverageSalaryForTheDepartment(int department){
        int salaryAmountByDepartment = 0;
        int numOfPeopleInTheDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (department == employee[i].getDepartment()) {
                salaryAmountByDepartment += employee[i].getSalary();
                numOfPeopleInTheDepartment++;
            }
        }
        return salaryAmountByDepartment / numOfPeopleInTheDepartment;
    }
    public static void salaryIndexationInTheDepartment(int department, int percent){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            if (employee[i].getDepartment() == department){
                int amountIndexingField = employee[i].getSalary() * percent / 100 + employee[i].getSalary();
                employee[i].setSalary(amountIndexingField);
            }
        }
    }

    public static void printAllEmployeesAndSalaryIncrease(int department){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                break;
            }
            if (employee[i].getDepartment() == department) {
                System.out.println("\n" + "id: " + employee[i].getId() + "\n" + "ФИО: " + employee[i].getFamilName() + " "
                        + employee[i].getName() + " " + employee[i].getSurname() + "\n" + "Зарплата: " + employee[i].getSalary());
            }
        }
    }
    public static void printAllEmployeesAreLessThanTheNumber(int num){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if (employee[i].getSalary() < num) {

                System.out.println("\n" + "Сотрудник с зп меньше вводимого числа: " + "\n" + "id: " + employee[i].getId() + "\n" + "ФИО: " + employee[i].getFamilName() + " "
                        + employee[i].getName() + " " + employee[i].getSurname() + "\n" + "Зарплата: " + employee[i].getSalary());
            }
        }

    }
    public static void printAllEmployeesAreGreaterThanTheNumber(int num){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                break;
            }
            if(employee[i].getSalary() >= num){
                System.out.println("\n" + "Сотрудник с зп больше вводимого числа: " + "\n" + "id: " + employee[i].getId() + "\n" + "ФИО: " + employee[i].getFamilName() + " "
                        + employee[i].getName() + " " + employee[i].getSurname() + "\n" + "Зарплата: " + employee[i].getSalary());

            }

        }
    }



}