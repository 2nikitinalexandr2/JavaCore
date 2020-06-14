// Продемонстрировать применение операции инкремента ++
public class IncDec {
    public static void main(String[] args) {
        int a = 1, b =2;
        int c, d;
        c = ++b; //b=3 c=3
        d = a++; //d=1 a=2
        c++; //c=4
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
