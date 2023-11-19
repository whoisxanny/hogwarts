public class Hufflepuff extends Hogwarts{
    private int hardworking;
    private int loyal;
    private int honest;


    public Hufflepuff(String surname, String name, String faculty, int magicPower, int magicDistance, int hardworking, int loyal, int honest) {
        super(surname, name, faculty, magicPower, magicDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    static void compare(Hufflepuff student1, Hufflepuff student2) {
        int total1 = student1.getHardworking() + student1.getHonest() + student1.getLoyal();
        int total2 = student2.getHardworking() + student2.getHonest() + student2.getLoyal();

        if (total1 > total2) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else if (total1 < total2) {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        } else {
            System.out.println(student1.getName() + " и " + student2.getName() + " одинаково хороши в Гриффиндоре");
        }
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("hardworking: " + getHardworking() + "; loyal: " + getLoyal() + "; honest: " + getHonest());
    }
}
