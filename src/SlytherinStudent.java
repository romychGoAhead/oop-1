public class SlytherinStudent extends HogwartsStudent {

    private final int cunning;    // хитрость
    private final int determination;   // решительность
    private final int ambition;           //амбициозность
    private final int resourcefulness;   // находчивость
    private final int lustForPower;    // жажда власти


    public SlytherinStudent(String name, int cunning,
                            int determination, int ambition, int resourcefulness, int lustForPower,
                            int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression, name);

        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }


    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void compare(SlytherinStudent otherStudent) {
        if (otherStudent.pointSumm() < this.pointSumm()) {
            System.out.println("сильнее в Slytherin" + this.getName());
        } else System.out.println("сильнее в Slytherin" + otherStudent.getName());
    }


    private int pointSumm() {
        return cunning + determination + ambition + resourcefulness;
    }


}
