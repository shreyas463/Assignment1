public class EmployeeTest {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700);
        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);
        CommissionEmployee commissionEmployee1 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
        CommissionEmployee commissionEmployee2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);
        BaseEmployee baseEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);

        // Output the details of each employee - Salaried type
        System.out.println("------------------------------------------------------------------------------------------------------------");
        System.out.println("Salaried Employee 1: " + salariedEmployee1.getFirstName() + " " +
                salariedEmployee1.getLastName() + ", SSN: " + salariedEmployee1.getSocialSecurityNumber() +
                ", Weekly Salary: $" + salariedEmployee1.getWeeklySalary());

        System.out.println("Salaried Employee 2: " + salariedEmployee2.getFirstName() + " " +
                salariedEmployee2.getLastName() + ", SSN: " + salariedEmployee2.getSocialSecurityNumber() +
                ", Weekly Salary: $" + salariedEmployee2.getWeeklySalary());

        System.out.println("------------------------------------------------------------------------------------------------------------");
        // Output the details of each employee - Hourly type
        System.out.println("Hourly Employee 1: " + hourlyEmployee1.getFirstName() + " " +
                hourlyEmployee1.getLastName() + ", SSN: " + hourlyEmployee1.getSocialSecurityNumber() +
                ", Wage: $" + hourlyEmployee1.getWage() + ", Hours Worked: " + hourlyEmployee1.getHoursWorked());

        System.out.println("Hourly Employee 2: " + hourlyEmployee2.getFirstName() + " " +
                hourlyEmployee2.getLastName() + ", SSN: " + hourlyEmployee2.getSocialSecurityNumber() +
                ", Wage: $" + hourlyEmployee2.getWage() + ", Hours Worked: " + hourlyEmployee2.getHoursWorked());

        System.out.println("------------------------------------------------------------------------------------");

        // Output the details of each employee - Commission type
        System.out.println("Commission Employee 1: " + commissionEmployee1.getFirstName() + " " +
                commissionEmployee1.getLastName() + ", SSN: " + commissionEmployee1.getSocialSecurityNumber() +
                ", Commission Rate: " + (commissionEmployee1.getCommissionRate() * 100) + "%, Gross Sales: $" +
                commissionEmployee1.getGrossSales());

        System.out.println("Commission Employee 2: " + commissionEmployee2.getFirstName() + " " +
                commissionEmployee2.getLastName() + ", SSN: " + commissionEmployee2.getSocialSecurityNumber() +
                ", Commission Rate: " + (commissionEmployee2.getCommissionRate() * 100) + "%, Gross Sales: $" +
                commissionEmployee2.getGrossSales());

        System.out.println("------------------------------------------------------------------------------------------------------------");
        // Output the details of each employee - Base type
        System.out.println("Base Employee: " + baseEmployee.getFirstName() + " " +
                baseEmployee.getLastName() + ", SSN: " + baseEmployee.getSocialSecurityNumber() +
                ", Base Salary: $" + baseEmployee.getBaseSalary());

        System.out.println("------------------------------------------------------------------------------------------------------------");
    }
}
