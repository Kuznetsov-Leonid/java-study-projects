package CarProject;

public class Car {
    private final int Wheels;
    private final int Windows;
    private final int PaxSits;
    private final String Body;
    private final String Brand;
    private final String Engine;
    private final String Color;

    public Car(int Wheels, int Windows, int PaxSits, String Body, String Brand, String Engine, String Color){
        this.Engine  = Engine;
        this.PaxSits = PaxSits;
        this.Body    = Body;
        this.Windows = Windows;
        this.Wheels  = Wheels;
        this.Color   = Color;
        this.Brand   = Brand;
    }
    public void getParam(){
        System.out.println("У автомобиля следующие параметры: ");
        System.out.println("Колёс: " + Wheels);
        System.out.println("Окон: " + Windows);
        System.out.println("Количество мест: " + PaxSits);
        System.out.println("Кузов: " + Body);
        System.out.println("Марка: " + Brand);
        System.out.println("Двигатель: " + Engine);
        System.out.println("Цвет: " + Color);
    }

    public void gas(){
        System.out.println(Brand + " Газуем!");
    }
    public void brake(){
        System.out.println(Brand + " Тормозим!");
    }
}
