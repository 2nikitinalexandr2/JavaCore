package main.java.com.Nikitinalexandr2.javacore.chapter07;
/* В данном примере конструкторы определяются
 в классе Box для инициализации размеров
 параллелепипеда тремя разными способами
 */
class BoxС {
    double width;
    double height;
    double depth;

//    конструктор, используемый, когда
//    указываются все размеры
    BoxС(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

//    конструктор, используемый, когда
//    ни один из размеров не указан
    BoxС() {
        width = -1; // используется значение -1 для
        height = -1; // обозначения неинициализированного
        depth = -1; // параллелепипеда
    }

//    конструктор, используемый при создании куба
    BoxС(double len) {
        width = height = depth = len;
    }

//    рассчитать и возвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
//        создать параллелепипед, используя разные конструторы
        BoxС mybox1 = new BoxС(10, 20, 15);
        BoxС mybox2 = new BoxС();
        BoxС mycube = new BoxС(7);

        double vol;

//        получить объем первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);

        //        получить объем первого параллелепипеда
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);

        //        получить объем первого параллелепипеда
        vol = mycube.volume();
        System.out.println("Объем mycube равен " + vol);
    }
}
