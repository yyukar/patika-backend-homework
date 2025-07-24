package week2.salaryCalculator;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public int bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        final int year = 2021;
        int calcYear = year - hireYear;
        if (calcYear < 10) {
            return  salary * 0.05;
        } else if (calcYear > 9 && calcYear < 20) {
            return salary * 0.10;
        } else{
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {

        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();

        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raiseSalary + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + (salary - tax + bonus) + "\n" +
                "Toplam Maaş : " + (salary - tax + bonus + raiseSalary);
    }
}
