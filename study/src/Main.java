import CarProject.WueCars;
import Cold_or_warm.Task1;
import Validator.AgeValidator;
import BodyTemp.BodyTempTask;
import ThreeNumber.ThreeNumberTask;
import logicalOperators.LogicalOperationActions;
public class Main {
    public static void main(String[] args) {
        carTest();
        TaskTest1();
        AgeValidatorTest();
        BodyTempTest();
        ThreeNumberTest();
        LogicalTest();
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
}