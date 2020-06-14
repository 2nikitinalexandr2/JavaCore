package main.java.com.Nikitinalexandr2.javacore.chapter07;

// Продемонстрировать автоматическое преобразование типов к перегрузке
class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

//    Перегружаемый метод, проверяющий наличие
//    двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

//    Перегружаемый метод, проверяющий наличие
//    параметра типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове " + " test(double) a: " + a);
    }
}
class Overload {
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

//        вызвать все варианты метода test()
        ob.test();
        ob.test(10,20);

        ob.test(i);         //здесь вызывается вариант
                            // метода test(double)
        ob.test(123.2);     // и здесь вызывается вариант
                            // метода test(double)
    }
}
