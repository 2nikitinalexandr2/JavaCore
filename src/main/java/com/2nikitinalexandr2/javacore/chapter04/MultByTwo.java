// Применение сдвига влево в качестве
// быстрого способа умножения на 2
public class MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE; // num =01111_1111_1111_1111_1111_1111_1110

        for (i=0; i<4; i++) {
            num = num << 1;// num = 0111_1111_1111_1111_1111_1111_1111_1110 = 2147483632
            System.out.println(num);
        }
    }
}
