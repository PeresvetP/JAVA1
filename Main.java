package geekbrains.HomeWork1;

public class Main {

    public static void main(String[] args) {

    }

    //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void () {
        System.out.println("1");
        boolean b = false;
        byte bt = 0;
        char c = 'x';
        short s = 123;
        int i = 777;
        long l = 77777L;
        float f = 777.0f;
        double d = 777.777;
        System.out.println("Значение boolean = " + b);
        System.out.println("Значение byte = " + bt);
        System.out.println("Значение char = [" + c + "]");
        System.out.println("Значение short = " + s);
        System.out.println("Значение int = " + i);
        System.out.println("Значение long = " + l);
        System.out.println("Значение float = " + f);
        System.out.println("Значение double = " + d);
    }

    //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //где a, b, c, d – входные параметры этого метода;

    }

    //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит
    //в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    static boolean (int a, int b) {
        System.out.println("\n4.");
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }

    //5. Написать метод, которому в качестве параметра передается целое число, метод должен
    //напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль
    //считаем положительным числом.
    static void (int a) {
        System.out.println("\n5");
        if (a >= 0) System.out.println("Число " + a + "положительное");
        else System.out.println("Число " + a + " отрицательное");
    }

    //6. Написать метод, которому в качестве параметра передается целое число, метод должен
    //вернуть true, если число отрицательное;
    static boolean (int a) {
        System.out.println("\n6");
        if (a < 0) return true;
        return false;
    }

    //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void (String name) {
        System.out.println("\n7");
        System.out.println("Привет, " + name + "!");
    }
}
