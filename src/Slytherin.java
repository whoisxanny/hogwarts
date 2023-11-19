public class Slytherin extends Hogwarts {
    private int cunning;
    private int determination;
    private int ambition;

    public Slytherin(String surname, String name, String faculty, int magicPower, int magicDistance, int cunning, int determination, int ambition) {
        super(surname, name, faculty, magicPower, magicDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    static void compare(Slytherin student1, Slytherin student2) {
        int total1 = student1.getAmbition() + student1.getCunning() + student1.getDetermination();
        int total2 = student2.getAmbition() + student2.getCunning() + student2.getDetermination();

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
        System.out.println("cunning: " + getCunning() + "; determination: " + getDetermination() + "; ambition: " + getAmbition());
    }

}
