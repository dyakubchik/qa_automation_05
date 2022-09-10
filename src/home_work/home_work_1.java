package home_work;
/*
Необходимо создать целочисленные переменные a и b,
присвоить произвольные значения переменным на ваш выбор
и вывести результаты следующих операций с этими переменными:
сложение, умножение, вычитание, деление и остаток от деления.
Так же сделать проверку на четность этих переменных и вывести результат.

Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
*/

public class home_work_1 {
    public static void main(String[] args){

        int a = 1;
        int b = 2;

        int plus = a + b;
        int multiplication = a * b;
        int substraction = a - b;
        double devision1 = 1.0 * a / b;
        double devision2 = (float) a / b;
        int modulo = a % b;
        boolean even = a == b;

        System.out.println(plus);
        System.out.println(multiplication);
        System.out.println(substraction);
        System.out.println(devision1);
        System.out.println(devision2);
        System.out.println(modulo);
        System.out.println(even);

        String smile = "\u263A";
        String smile1 = Character.toString( 128_526 );
        String smile2 = "\uD83E\uDD75";

        System.out.println(smile);
        System.out.println(smile1);
        System.out.println(smile2);
    }
}
