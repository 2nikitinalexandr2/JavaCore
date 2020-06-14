package main.java.com.Nikitinalexandr2.javacore.chapter07;
// Объекты передаются по ссылке на них

class Testr {
    int a, b;

    Testr(int i, int j) {
        a = i;
        b = j;
    }

//    передать объект
    void meth(Testr o) {
        o.a *=2;
        o.b /=2;
    }
}
public class PassObjRe {
    public static void main(String[] args) {
        Testr ob = new Testr(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
