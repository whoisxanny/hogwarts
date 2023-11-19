import java.awt.*;

public class Main {
    public static void main(String[] args) {

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






