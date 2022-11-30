public class Main {
    public static void main(String[] args) {
        var totalTime=640;
        var workingDay=8;
        var workers=totalTime/workingDay;
        System.out.println("Всего работников в компании — "+workers+"человек");
        var overWorkers=94;
        var totalWorkers=overWorkers+workers;
        var hourWorker=totalWorkers*workingDay;
        System.out.println("Если в компании работает" + totalWorkers + "человек, то всего"+hourWorker+"часов работы может быть поделено между сотрудниками");

    }
}