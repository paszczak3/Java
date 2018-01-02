import java.util.InputMismatchException;
import java.util.Scanner;

public class DataReader {
    Scanner sc = new Scanner(System.in);

    public int getInt() throws NumberFormatException{
        int x = 0;
        try {
            x = sc.nextInt();
        } catch (InputMismatchException e) {
            throw new NumberFormatException("Liczba wproawdzona w niepoprawnej formie");
        } finally {
            sc.nextLine();
        }
        return x;
    }

    public Worker createWorker() throws InputMismatchException {
        System.out.println("IMIE");
        String name = sc.nextLine();
        System.out.println("Nazwisko");
        String lastName = sc.nextLine();
        System.out.println("PESEL");
        String pesel = sc.nextLine();
        System.out.println("Zarobki");
        int salary = 0;
        int workTime = 0;
        try {
            salary = sc.nextInt();
            sc.nextLine();
            System.out.println("Czas pracy");
            workTime = sc.nextInt();
        } catch (InputMismatchException e) {
            throw e;
        } finally {
            sc.nextLine();
            return new Worker(name,lastName,pesel,salary,workTime);
        }

    }

}
