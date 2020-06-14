package main.java.com.Nikitinalexandr2.javacore.chapter07;
// Объекты допускается передавать методам
// в качестве параметров
class Testp {
    int a, b;

    Testp(int i, int j) {
        a = i;
        b = j;
    }

//    возвратить логическое значение true, если в
//    качестве параметра o указан вызывающий объект
    boolean equalTo(Testp o) {
        if (o.a ==a && o.b ==b) return true;
        else return false;
    }
}
public class PassOb {
    public static void main(String[] args) {
        Testp ob1 = new Testp(100,22);
        Testp ob2 = new Testp(100, 22);
        Testp ob3 = new Testp(-1, -1);

        System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
    }
}
