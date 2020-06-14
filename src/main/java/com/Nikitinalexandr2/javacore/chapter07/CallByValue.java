package main.java.com.Nikitinalexandr2.javacore.chapter07;
// Аргументы примитивных типов передаются по значению
class Testb {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}
class CallByValue {
    public static void main(String[] args) {
        Testb ob = new Testb();

        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a,b);

        System.out.println("a и b после вызова: " + a + " " + b);
    }
}
