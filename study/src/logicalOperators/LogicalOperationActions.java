package logicalOperators;

public class LogicalOperationActions {
    Triangle a   = new Triangle();
    Dilemma b    = new Dilemma();
    Coordinate c = new Coordinate();

    public void LogicalOperationActionsTest(){
        System.out.println("Старт программы.");
        a.TriangleTask();
        b.DilemmaTask();
        c.CoordinateTask();
        c.StopScanInput();
        System.out.println("Конец программы.");
    }
}
