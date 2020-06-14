// Целевая часть цикла может быть пустой
public class NoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;

        // расчитать средне значение переменных i и j
        while (++i < --j) ; // у этого цикла отсутствует тело,
        // если ++i на i++ или --j на j-- то среднее i=151
        System.out.println("Среднее значение равно " + i); //150
    }
}
