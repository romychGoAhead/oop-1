

public class GryffindorStudent extends HogwartsStudent {
    private final int nobility;     // благородство
    private final int honor;      //честь
    private final int bravery;    // храбрость



    public GryffindorStudent(String name, int nobility, int honor,
                             int bravery, int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression, name);

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


    public void compare(GryffindorStudent otherStudent) {
        if (otherStudent.pointSumm() < this.pointSumm()) {
            System.out.println("сильнее в Gryffindor " + this.getName());
        } else System.out.println("сильнее в Gryffindor " + otherStudent.getName());
    }

    private int pointSumm() {
        return nobility + honor + bravery;
    }



}

