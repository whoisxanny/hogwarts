import java.awt.*;

public class Main {
    public static void main(String[] args) {
//        Hogwarts[] hogwarts = {
////                new Hogwarts("Поттер", "Гарри", "Гриффиндор", 10, 13),
////                new Hogwarts("Грейнджер ", "Гермиона", "Гриффиндор", 12, 13),
////                new Hogwarts("Уизли", "Рон", "Гриффиндор", 8, 8),
////                new Hogwarts("Драко", "Малфой", "Слизерин", 13, 11),
////                new Hogwarts("Грэхэм", "Монтегю", "Слизерин", 9, 8),
////                new Hogwarts("Гойл", "Грегори", "Слизерин", 7, 6),
////                new Hogwarts("Смит", "Захария", "Пуффендуй", 6, 6),
////                new Hogwarts("Диггори", "Седрик", "Пуффендуй", 7, 7),
////                new Hogwarts("Финч", "Джастин", "Пуффендуй", 7, 6),
////                new Hogwarts("Чанг", "Чжоу", "Когтевран", 9, 8),
////                new Hogwarts("Патил", "Падма", "Когтевран", 10, 9),
////                new Hogwarts("Белби", "Маркус", "Когтевран", 11, 11),
//                id0003,
//        };
//
//                Gryffindor id0001 = new Gryffindor("Поттер", "Гарри", "Гриффиндор", 10, 13, 5, 6, 7),
//                Gryffindor id0002 = new Gryffindor("Грейнджер ", "Гермиона", "Гриффиндор", 12, 13, 6, 7, 8),
//                Gryffindor id0003 = new Gryffindor("Уизли", "Рон", "Гриффиндор", 8, 8, 5, 5, 5),
//
//                Slytherin id0004 = new Slytherin("Драко", "Малфой", "Слизерин", 13, 11, 8, 9, 10),
//                Slytherin id0005 = new Slytherin("Грэхэм", "Монтегю", "Слизерин", 9, 8, 6, 7, 7),
//                Slytherin id0006 = new Slytherin("Гойл", "Грегори", "Слизерин", 7, 6, 5, 5, 5)
//
//                Ravenclaw[] ravenclaws = {
//                        new Ravenclaw("Чанг", "Чжоу", "Когтевран", 9, 8, 7, 7, 6),
//                        new Ravenclaw("Патил", "Падма", "Когтевран", 10, 9, 4, 5, 6),
//                        new Ravenclaw("Белби", "Маркус", "Когтевран", 11, 11, 5, 6, 7)
//                };
//
//                Hufflepuff[] hufflepuffs = {
//                        new Hufflepuff("Смит", "Захария", "Пуффендуй", 6, 6, 4, 4, 4),
//                        new Hufflepuff("Диггори", "Седрик", "Пуффендуй", 7, 7, 3, 2, 3),
//                        new Hufflepuff("Финч", "Джастин", "Пуффендуй", 7, 6, 3, 5, 5)
//                };


//        System.out.println("hogwarts.length = " + hogwarts.length);
//        describeStudent(hogwarts[6]);

        Gryffindor harry = new Gryffindor("Поттер", "Гарри", "Гриффиндор", 10, 13, 5, 6, 7);
        Gryffindor hermione = new Gryffindor("Грейнджер ", "Гермиона", "Гриффиндор", 12, 13, 6, 7, 8);
        Gryffindor ron = new Gryffindor("Уизли", "Рон", "Гриффиндор", 8, 8, 5, 5, 5);

        Slytherin draco = new Slytherin("Драко", "Малфой", "Слизерин", 13, 11, 8, 9, 10);
        Slytherin graham = new Slytherin("Грэхэм", "Монтегю", "Слизерин", 9, 8, 6, 7, 7);
        Slytherin gregory = new Slytherin("Гойл", "Грегори", "Слизерин", 7, 6, 5, 5, 5);

        Hufflepuff zacharias = new Hufflepuff("Смит", "Захария", "Пуффендуй", 6, 6, 4, 4, 4);
        Hufflepuff cedric = new Hufflepuff("Диггори", "Седрик", "Пуффендуй", 7, 7, 3, 2, 3);
        Hufflepuff justin =  new Hufflepuff("Финч", "Джастин", "Пуффендуй", 7, 6, 3, 5, 5);

        Ravenclaw cho = new Ravenclaw("Чанг", "Чжоу", "Когтевран", 9, 8, 7, 7, 6);
        Ravenclaw padma =  new Ravenclaw("Патил", "Падма", "Когтевран", 10, 9, 4, 5, 6);
        Ravenclaw marcus = new Ravenclaw("Белби", "Маркус", "Когтевран", 11, 11, 5, 6, 7);

        Hogwarts[] students = {harry, hermione, ron, draco, graham, gregory, zacharias, cedric, justin, cho, padma, marcus};
        Gryffindor[] gryffindors = {harry, hermione, ron};
        Slytherin[] slytherins = {draco, graham, gregory};
        Hufflepuff[] hufflepuffs = {zacharias, cedric, justin};
        Ravenclaw[] ravenclaws = {cho, padma, marcus};


        describeStudent(harry);

        Gryffindor.compare(harry,hermione);


        Hufflepuff.compare(harry,draco);

    }

    public static void describeStudent(Hogwarts student) {
        student.describe();
    }





}






