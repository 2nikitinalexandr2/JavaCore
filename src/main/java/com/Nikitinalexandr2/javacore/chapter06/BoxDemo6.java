package main.java.com.Nikitinalexandr2.javacore.chapter06;
/* В данном примере программы для инициализации размеров
 параллелепипеда в классе Box применяется конструктор
 */
class Box6 {
    double width;
    double height;
    double depth;

    //    рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
//    установить размеры параллелепипеда
    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

public class BoxDemo6 {
    public static void main(String[] args) {
        Box6 mybox1 = new Box6();
        Box6 mybox2 = new Box6();
        double vol;

        // инициализировать каждый экземпляр класса Box
//        mybox1.setDim(10,20,15);
//        mybox2.setDim(3,6,9);

//        получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем равен " + vol);

        //        получить объем второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем равен " + vol);
    }
}
