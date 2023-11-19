public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int courage;

    public Gryffindor(String surname, String name, String faculty, int magicPower, int magicDistance, int nobility, int honor, int courage) {
        super(surname, name, faculty, magicPower, magicDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }



    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }


    static void compare(Gryffindor student1, Gryffindor student2) {
        int total1 = student1.getNobility() + student1.getHonor() + student1.getCourage();
        int total2 = student2.getNobility() + student2.getHonor() + student2.getCourage();

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
        System.out.println("Nobility: " + getNobility() + "; Honor: " + getHonor() + "; Courage: " + getCourage());
    }


}
