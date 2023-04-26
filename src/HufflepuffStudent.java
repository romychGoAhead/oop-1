public class HufflepuffStudent extends HogwartsStudent {
    private final int industriousness;    // трудолюбие
    private final int loyalty;            // верность
    private final int honesty;         //честность
    private final String name;

    public HufflepuffStudent(String name, int industriousness, int loyalty, int honesty,
                             int powerOfMagic, int distanceTransgression) {
        super(powerOfMagic, distanceTransgression);
        this.name = name;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public String getName() {
        return name;
    }

    public void compare(HufflepuffStudent otherStudent) {
        if (otherStudent.pointSumm() < this.pointSumm()) {
            System.out.println("сильнее в Hufflepuff" + this.getName());
        } else System.out.println("сильнее в Hufflepuff" + otherStudent.getName());
    }

    private int pointSumm() {
        return industriousness + loyalty + honesty;
    }

    public void summa(HufflepuffStudent otherStudent) {
        if (otherStudent.summ() < this.summ()) {
            System.out.println("сильнее " + this.getName());
        } else System.out.println("сильнее " + otherStudent.getName());
    }

    private int summ() {
        return powerOfMagic + distanceTransgression;
    }

}

