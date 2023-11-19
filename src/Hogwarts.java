public class Hogwarts {
    private String surname;
    private String name;
    private String faculty;

    private int magicPower;
    private int magicDistance;

    public Hogwarts(String surname, String name, String faculty, int magicPower, int magicDistance) {
        this.surname = surname;
        this.name = name;
        this.faculty = faculty;
        this.magicPower = magicPower;
        this.magicDistance = magicDistance;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public int getMagicDistance() {
        return magicDistance;
    }

    public void setMagicDistance(int magicDistance) {
        this.magicDistance = magicDistance;
    }

    public void describe() {
        System.out.println("Surname: " + getSurname()
                + "; Name: " + getSurname()
                + "; Faculty:" + getFaculty() + "; Magic Power: " + getMagicPower() + "; Magic Distance: " + getMagicDistance());
    }


    static void compare(Hogwarts student1, Hogwarts student2) {
        if (student1.getMagicPower() > student2.getMagicPower()) {
            System.out.println(student1.getName() + " обладает большей мощностью магии, чем " + student2.getName());
        } else if (student1.getMagicPower() < student2.getMagicPower()) {
            System.out.println(student2.getName() + " обладает большей мощностью магии, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " обладают одинаковой мощностью магии");
        }

        if (student1.getMagicDistance() > student2.getMagicDistance()) {
            System.out.println(student1.getName() + " может трансгрессировать на большее расстояние, чем " + student2.getName());
        } else if (student1.getMagicDistance() < student2.getMagicDistance()) {
            System.out.println(student2.getName() + " может трансгрессировать на большее расстояние, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " могут трансгрессировать на одинаковое расстояние");
        }
    }
}



