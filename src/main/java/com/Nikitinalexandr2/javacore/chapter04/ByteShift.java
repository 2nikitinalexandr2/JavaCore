// Сдвиг влево значения типа byte
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2; // a = 64 = 1000000 << 2 = 100000000 = 256 (int)
        b = (byte) (a << 2);

        System.out.println("Первоначальное значение a: " + a);
        System.out.println("i and b: " + " " + b);
    }
}
