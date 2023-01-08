package CarProject;
public class WueCars {
    LADA l = new LADA( 4, 5, 5, "Liftback", "Lada", "1,6 turbo", "Borneo");
    VOLGA v = new VOLGA(4,6, 4, "Sedan", "Volga", "2.0 EMG", "Black");

    public void ShowCars(){
        l.getParam();
        v.getParam();
    }
    public void CarsMove(){
        l.gas();
        v.gas();
        System.out.println("***");
        l.brake();
        v.brake();
    }
}
