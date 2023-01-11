package CompareStrings;

import logicalOperators.Input;

/**
 * В методе main напиши код попарного сравнения по ссылке строк string1, string2 и string3
 * (строку string1 нужно сравнить со строкой string2, строку string2 со строкой string3 и
 * строку string1 со строкой string3) с выводом соответствующего сообщения после каждого сравнения:
 * **/
public class ComparingReference extends Input {
    int count = 1;
    public void ComparingReferenceTask(){
        while (true){
            System.out.println("Для старта программы сравнения введите start или stop для завершения:");
            String selector = sc.nextLine();
            System.out.println("Количество итераций в жизненном цикле программы: " + count);
            if (selector.equalsIgnoreCase("start")){
                System.out.println("Введите три строки по одному слову: ");
                String str1 = sc.nextLine();
                String str2 = sc.nextLine();
                String str3 = sc.nextLine();
                System.out.println("Сравниваем строки...");
                System.out.println("Первое сравнение");
                String stepOne = str1.equals(str2) ? "Строки равны" : "Строки не равны";
                System.out.println(stepOne);
                System.out.println("Второе сравнение");
                String stepTwo = str2.equals(str3) ? "Строки равны" : "Строки не равны";
                System.out.println(stepTwo);
                System.out.println("Конец сравнения.");
                count++;
            } else if (selector.equalsIgnoreCase("stop")){
                System.out.println("Программа завершена.");
                break;
            }
        }
    }
}
