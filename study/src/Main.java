import CarProject.WueCars;
import Cold_or_warm.Task1;
import Validator.AgeValidator;
import BodyTemp.BodyTempTask;
import ThreeNumber.ThreeNumberTask;
import logicalOperators.LogicalOperationActions;
import LookingForMaximum.Maximum;
import ThroughThorns.Through;
import HighAccuracy.Accuracy;
import CompareStrings.Comparse;
import CompareStrings.ComparingReference;
public class Main {
    public static void main(String[] args) {
        carTest();
        TaskTest1();
        AgeValidatorTest();
        BodyTempTest();
        ThreeNumberTest();
        LogicalTest();
        MaximumTest();
        ThroughTest();
        AccuracyTest();
        ComparseTest();
        ComparingReferenceTest();
    }

    /**
     * @carTest(); Метод тестирования класса WueCars.
     * Выполняет последовательнсоть инструкцый наследуемых классов LADA и VOLGA
     * с присвоенными параметрами и фонкуцыями от родительского класса Car.
     * **/
    public static void carTest(){
        WueCars Cars = new WueCars();
        Cars.ShowCars();
        Cars.CarsMove();
    }
    /**
     * @TaskTest1(); Метод Тестирования класса Task1.
     * Выполняет логическую операцию на основе введённых данных
     * с клавиатуры темпиратуры и взависимости от значения
     * сравнивает с граничной областью от 0 градусов
     * и выводит сообщение.
     *  **/
    public static void TaskTest1(){
        Task1 i = new Task1();
        //i.thermometer();
        i.thermometerPro();
    }
    /**
     * @AgeValidatorTest(); Метод тестирования класса AgeValidator.
     * Выполняет логическую операцию на основе введённых данных
     * с клавиатуры и валидирует значения на основе введённого возвраста
     * в диапозоне до и от 18 до 28 и выше. Затем выводит сообщение.
     * **/
    public static void AgeValidatorTest(){
        AgeValidator i = new AgeValidator();
        i.ArmyCompany();
    }
    /**
     * @BodyTempTest();
     * Выполняет логическую операцию на основе введённых данных
     * Вводные данные темпиратуры сравниваются со стандартным
     * параметром и выводит текстовый результат
     * **/
    public static void BodyTempTest(){
        BodyTempTask b = new BodyTempTask();
        b.CheckTempBody();
    }
    /**
     * @ThreeNumberTest();
     * Выполняет логическую операцию на основе введённых данных
     * Вводные три числа сравниваются по условию между собой
     * в результат выводится совпадающие числа
     * **/
    public static void ThreeNumberTest(){
        ThreeNumberTask c = new ThreeNumberTask();
        c.ThreeNumberCheck();
    }
    /**
     * @LogicalTest();
     * Система независимых программ, наследуемых от класса Input, наследуя объект scanner.
     * В классе Input создаётся общий объект scanner на весь жизненный цикл программ, тем самым
     * оптимизируя использование оперативной памяти.
     * Первая программа проверяет существование треугольника по наличию длинны сторон больше 0;
     * Вторая программа проверяет граничные значения возраста и выводит текст сообщения в консоль;
     * Третья программа проверяет расположение координат на оси четверти.
     * Все три метода классов вызываются в классе LogicalOperationActions.
     * В конце вызывается метод StopScanInput(); закрывая scanner.
     * **/
    public static void LogicalTest(){
        LogicalOperationActions Action = new LogicalOperationActions();
        Action.LogicalOperationActionsTest();
    }
    /**
     * @MaximumTest();
     * Программа производит вычисление двух введённых чисел и выводит большее на экран.
     * **/
    public static void MaximumTest(){
        Maximum m = new Maximum();
        m.MaximumTask();
    }
    /**
     * @ThroughTest();
     * t.Club(int); - написан без тернарных операторов.
     * t.ClubPro(int); - написан на тернарниках в инлайн.
     * **/
    public static void ThroughTest(){
        Through t = new Through();
        t.Club(27);
        t.ClubPro(22);
    }
    public static void AccuracyTest(){
        Accuracy a = new Accuracy();
        a.AccuracyTask();
    }
    public static void ComparseTest(){
        Comparse c = new Comparse();
        c.ComparseTask();
    }
    public static void ComparingReferenceTest(){
        ComparingReference cr = new ComparingReference();
        cr.ComparingReferenceTask();
    }
}