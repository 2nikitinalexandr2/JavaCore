package main.java.com.Nikitinalexandr2.javacore.chapter07;
// Возврат объекта
class Testo{
    int a;

    Testo(int i) {
        a = i;
    }

    Testo incrByTen() {
        Testo temp = new Testo(a+10);
        return temp;
    }
}
class RetOb {
    public static void main(String[] args) {
        Testo ob1 = new Testo(2);
        Testo ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после увеличения значения: " + ob2.a);
    }
}
