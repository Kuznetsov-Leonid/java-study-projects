package ThroughThorns;
/**
 * Эта программа написана с использованием тернарного оператора,
 * но не совсем понятно, что она делает.
 * Думаем, если избавиться от тернарного оператора, то станет намного понятнее.
 * Перепиши программу без использования тернарного оператора.
 **/
public class Through {
    public void Club(int Foo){
        if (Foo > 27 || Foo < 27){
            System.out.println("Ты не в клубе " + Foo);
        } else {
            System.out.println("Ты в клубе " + Foo);
        }
    }

    public void ClubPro(int Foo){
        String result = Foo > 27 || Foo < 27 ? "Ты не в клубе 27" : "Ты в клубе 27";
        System.out.println(result);
    }
}
