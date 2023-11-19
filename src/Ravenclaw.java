public class Ravenclaw extends Hogwarts{
    private int smart;
    private int wise;
    private int witty;


    public Ravenclaw(String surname, String name, String faculty, int magicPower, int magicDistance, int smart, int wise, int witty) {
        super(surname, name, faculty, magicPower, magicDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    static void compare(Ravenclaw student1, Ravenclaw student2) {
        int total1 = student1.getSmart() + student1.getWitty() + student1.getWise();
        int total2 = student2.getSmart() + student2.getWitty() + student2.getWise();

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
        System.out.println("smart: " + getSmart() + "; wise: " + getWise() + "; witty: " + getWitty());
    }
}
