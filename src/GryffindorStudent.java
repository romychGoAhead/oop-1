public class GryffindorStudent extends HogwartsStudent {
    private final int nobility;     // благородство
    private final int honor;      //честь
    private final int bravery;    // храбрость
    private final String name;


    public GryffindorStudent(String name, int nobility, int honor,
                             int bravery, int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression);
        this.name = name;
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;

    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    public String getName() {
        return name;
    }

    public void compare("здесь нужно отразить факультет и студента") { // сравнение внутри факультета

        if ("cтудент".pointSumm() < this.pointSumm()) {
            System.out.println("сильнее " + this.getNane());
            else if ("cтудент".pointSumm() > this.pointSumm())
                System.out.println();
        }

    }

    private int pointSumm() {
        return nobility + honor + bravery;
    }
}

