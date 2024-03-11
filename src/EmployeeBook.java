public class EmployeeBook {
    private Employee[] employee;


    public EmployeeBook(){
        this.employee = new Employee[10];

    }

    public void printAllEmployees(){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
            }
            System.out.println(employee[i]);
        }
    }

    public int salaryPerMonth(){
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
            }
            total += employee[i].getSalary();
        }
        return total;
    }
    public Employee minimumSalaryCalculation(){
        int minSalary = Integer.MAX_VALUE;
        int identifier = 0;
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null){
                continue;
            }

            if (minSalary > employee[i].getSalary()){
                minSalary = employee[i].getSalary();
                identifier = i;
            }


        }
        return employee[identifier];
    }
    public Employee maximumSalaryCalculation(){
        int maxSalary = 0;
        int identifier = 0;
        for (int i = 0; i < employee.length; i++) {

            if (employee[i] == null){
                continue;
            }

            if (maxSalary < employee[i].getSalary()){
                maxSalary = employee[i].getSalary();
                identifier = i;
            }

        }
        return employee[identifier];
    }
    public int calculationOfAverageSalary(){
        int monthlyEmployeeSalary = 0;
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
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
    public void printFullnamesOfEmployees(){
        System.out.println("ФИО всех сотрудников: ");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
            }
            System.out.println(employee[i].getFamilName() + " " + employee[i].getName() + " " + employee[i].getSurname());

        }

    }
    ///////////////////// Повышенная сложность
    public void indexingSalary(int percent){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
            }
            int amountIndexingField = employee[i].getSalary() * percent / 100 + employee[i].getSalary();
            employee[i].setSalary(amountIndexingField);
        }
    }
    public Employee minSalaryForTheDepartment(int department){
        int minSalary = Integer.MAX_VALUE;
        int minIdentifier = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (department == employee[i].getDepartment() && employee[i].getSalary() < minSalary) {
                minSalary = employee[i].getSalary();
                minIdentifier = i;

            }
        }
        return employee[minIdentifier];
    }
    public Employee maxSalaryForTheDepartment(int department){
        int maxSalary = 0;
        int maxIdentifier = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (department == employee[i].getDepartment() && employee[i].getSalary() > maxSalary) {
                maxSalary = employee[i].getSalary();
                maxIdentifier = i;


            }
        }
        return employee[maxIdentifier];
    }
    public int calculationOfSalaryCostsInTheDepartment(int department){
        int salaryAmountByDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (department == employee[i].getDepartment()) {
                salaryAmountByDepartment += employee[i].getSalary();

            }
        }
        return salaryAmountByDepartment;
    }
    public int calculationOfTheAverageSalaryForTheDepartment(int department){
        int salaryAmountByDepartment = 0;
        int numOfPeopleInTheDepartment = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (department == employee[i].getDepartment()) {
                salaryAmountByDepartment += employee[i].getSalary();
                numOfPeopleInTheDepartment++;
            }
        }
        if (salaryAmountByDepartment == 0 || numOfPeopleInTheDepartment == 0){
            return 0;
        }else {
            return salaryAmountByDepartment / numOfPeopleInTheDepartment;
        }
    }
    public void salaryIndexationInTheDepartment(int department, int percent){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
            }
            if (employee[i].getDepartment() == department){
                int amountIndexingField = employee[i].getSalary() * percent / 100 + employee[i].getSalary();
                employee[i].setSalary(amountIndexingField);
            }
        }
    }
    public void printAllEmployeesAndSalaryIncrease(int department){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null){
                continue;
            }
            if (employee[i].getDepartment() == department) {
                System.out.println("\n" + "id: " + employee[i].getId() + "\n" + "ФИО: " + employee[i].getFamilName() + " "
                        + employee[i].getName() + " " + employee[i].getSurname() + "\n" + "Зарплата: " + employee[i].getSalary());
            }
        }
    }
    public void printAllEmployeesAreLessThanTheNumber(int num){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() < num) {

                System.out.println("\n" + "Сотрудник с зп меньше вводимого числа: " + "\n" + "id: " + employee[i].getId() + "\n" + "ФИО: " + employee[i].getFamilName() + " "
                        + employee[i].getName() + " " + employee[i].getSurname() + "\n" + "Зарплата: " + employee[i].getSalary());
            }
        }
    }
    public void printAllEmployeesAreGreaterThanTheNumber(int num){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if(employee[i].getSalary() >= num){
                System.out.println("\n" + "Сотрудник с зп больше вводимого числа: " + "\n" + "id: " + employee[i].getId() + "\n" + "ФИО: " + employee[i].getFamilName() + " "
                        + employee[i].getName() + " " + employee[i].getSurname() + "\n" + "Зарплата: " + employee[i].getSalary());

            }
        }
    }
    public boolean addEmployee(Employee newEmployee){
        boolean flag = false;
        for (int i = 0; i < employee.length; i++) {
            if(employee[i] == null){
                employee[i] = newEmployee;
                flag = true;
                break;
            }

        }
        if(flag){
            return flag;
        }else {
            System.out.println("Мест для сотрудника не нашлось");
            return flag;
        }

    }
    public void deletingAnEmployee(int id){
        for (int i = 0; i < employee.length; i++) {

            if (id == employee[i].getId()){
                employee[i] = null;
                System.out.println("Сотрудник с id " + id + " удален");
                break;

            }
        }
    }
    public Employee employeeSearchById(int id){
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getId() == id) {
                return employee[i];
            }
        }
        return null;



    }
    
}
