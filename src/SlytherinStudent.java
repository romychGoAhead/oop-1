public class SlytherinStudent extends HogwartsStudent {

    private final int cunning;    // хитрость
    private final int determination;   // решительность
    private final int ambition;           //амбициозность
    private final int resourcefulness;   // находчивость
    private final int lustForPower;    // жажда власти
    private final String name;

    public SlytherinStudent(String name, int cunning,
                            int determination, int ambition, int resourcefulness, int lustForPower,
                            int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression);
        this.name = name;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public String getName() {
        return name;
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
}
