public class Worker extends Person {
    private int salary;
    private int workTime;
    public Worker(String name, String lastName, String pesel) {
        super(name, lastName, pesel);
    }

    public Worker(String name, String lastName, String pesel, int salary, int workTime) {
        super(name, lastName, pesel);
        this.salary = salary;
        this.workTime = workTime;
    }



    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    @Override
    public String toString() {
        return "Klasa Worker " +
                " imie=" + getName() +
                " nazwisko=" +getLastName()+
                " pesel=" + getPesel() +
                " zarobki=" + salary +
                ", czas pracy=" + workTime;
    }
}
