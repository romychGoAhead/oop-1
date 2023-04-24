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
}

