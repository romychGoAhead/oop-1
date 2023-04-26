public abstract class HogwartsStudent {

    private final int powerOfMagic;    // cила магии
    private final int distanceTransgression; // расстояние трансгресии
    private final String name;


    public HogwartsStudent(int powerOfMagic, int distanceTransgression, String name) {

        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    // метод сравнения трансгресии и магии


    public void compare(HogwartsStudent otherStudent) {
        if (otherStudent.summ() < this.summ()) {
            System.out.println("сильнее " + this.getName());
        } else System.out.println("сильнее в " + otherStudent.getName());
    }


    private int summ() {
        return powerOfMagic + distanceTransgression;
    }
}


//



