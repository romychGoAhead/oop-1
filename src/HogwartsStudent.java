public abstract class HogwartsStudent {

    private final int powerOfMagic;    // cила магии
    private final int distanceTransgression; // расстояние трансгресии



    public HogwartsStudent(int powerOfMagic, int distanceTransgression) {

        this.powerOfMagic = powerOfMagic;
        this.distanceTransgression = distanceTransgression;


    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public int getDistanceTransgression() {
        return distanceTransgression;
    }

    // метод сравнения трансгресии и магии

    private int summ() {
        return powerOfMagic + distanceTransgression;
    }

}

//



