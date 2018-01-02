public class Main {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        PrintWorkers printWorkers = new PrintWorkers();
        printWorkers.printWorker(dataReader.createWorker());



    }
}
