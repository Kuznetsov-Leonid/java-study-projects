import CarProject.WueCars;

public class Main {
    public static void main(String[] args) {
        carTest();
    }

    /**
     * carTest(); Метод тестирования класса WueCars
     * Выполняет последовательнсоть инструкцый наследуемых классов LADA и VOLGA
     * с присвоенными параметрами и фонкуцыями от родительского класса Car.
     * **/
    public static void carTest(){
        WueCars Cars = new WueCars();
        Cars.ShowCars();
        Cars.CarsMove();
    }
}