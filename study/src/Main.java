import CarProject.WueCars;
import Cold_or_warm.Task1;
import Validator.AgeValidator;
public class Main {
    public static void main(String[] args) {
        carTest();
        TaskTest1();
        AgeValidatorTest();
    }

    /**
     * @carTest(); Метод тестирования класса WueCars
     * Выполняет последовательнсоть инструкцый наследуемых классов LADA и VOLGA
     * с присвоенными параметрами и фонкуцыями от родительского класса Car.
     * **/
    public static void carTest(){
        WueCars Cars = new WueCars();
        Cars.ShowCars();
        Cars.CarsMove();
    }
    /**
     * @TaskTest1(); Метод Тестирования класса Task1
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
     * @AgeValidatorTest(); Метод тестирования класса AgeValidator
     * Выполняет логическую операцию на основе введённых данных
     * с клавиатуры и валидирует значения на основе введённого возвраста
     * в диапозоне до и от 18 до 28 и выше. Затем выводит сообщение.
     * **/
    public static void AgeValidatorTest(){
        AgeValidator i = new AgeValidator();
        i.ArmyCompany();
    }
}