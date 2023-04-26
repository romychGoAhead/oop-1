public class RavenclawStudent extends HogwartsStudent {

    private final int smart;  // ум
    private final int wisdom;   // мудрость
    private final int wit;      // остроумие
    private final int creativity;    // творчество
    private final String name;

    public RavenclawStudent(String name, int smart,
                            int wisdom, int wit, int creativity, int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression);
        this.name = name;
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getWit() {
        return wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public String getName() {
        return name;
    }

    public void compare(RavenclawStudent otherStudent) {
        if (otherStudent.pointSumm() < this.pointSumm()) {
            System.out.println("сильнее в Ravenclaw" + this.getName());
        } else System.out.println("сильнее в Ravenclaw" + otherStudent.getName());
    }


    private int pointSumm() {
        return smart + wisdom + wit + creativity;
    }

    public void summa(RavenclawStudent otherStudent) {
        if (otherStudent.summ() < this.summ()) {
            System.out.println("сильнее " + this.getName());
        } else System.out.println("сильнее " + otherStudent.getName());
    }

    private int summ() {
        return powerOfMagic + distanceTransgression;
    }
}