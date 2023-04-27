public class RavenclawStudent extends HogwartsStudent {

    private final int smart;  // ум
    private final int wisdom;   // мудрость
    private final int wit;      // остроумие
    private final int creativity;    // творчество


    public RavenclawStudent(String name, int smart,
                            int wisdom, int wit, int creativity, int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression, name);

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


    public void compare(RavenclawStudent otherStudent) {
        if (otherStudent.pointSumm() < this.pointSumm()) {
            System.out.println("сильнее в Ravenclaw" + this.getName());
        } else System.out.println("сильнее в Ravenclaw" + otherStudent.getName());
    }


    private int pointSumm() {
        return smart + wisdom + wit + creativity;
    }


}