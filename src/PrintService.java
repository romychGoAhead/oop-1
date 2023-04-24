
public class PrintService {
    public void print(GryffindorStudent[] gryffindorStudents) {
        System.out.println("Количество студентов: " + gryffindorStudents.length);
        for (int i = 0; i < gryffindorStudents.length; i++) {
            GryffindorStudent gryffindorStudent = gryffindorStudents[i];
            System.out.println("GryffindorStudent: " +
                    " name= " + gryffindorStudent.getName() + ", nobility = " + gryffindorStudent.getNobility() +
                    ", honor = " + gryffindorStudent.getHonor() +
                    ", bravery = " + gryffindorStudent.getBravery() + ", powerOfMagic " + gryffindorStudent.getPowerOfMagic() +
                    ", distanceTransgression " + gryffindorStudent.getDistanceTransgression());

        }
        System.out.println();

    }

    public void print(HufflepuffStudent[] hufflepuffStudents) {
        System.out.println("Количество студентов: " + hufflepuffStudents.length);
        for (int i = 0; i < hufflepuffStudents.length; i++) {
            HufflepuffStudent hufflepuffStudent = hufflepuffStudents[i];
            System.out.println("HufflepuffStudents: " +
                    " name= " + hufflepuffStudent.getName() + ", industriousness = " + hufflepuffStudent.getIndustriousness() +
                    ", loyalty = " + hufflepuffStudent.getLoyalty() +
                    ", honesty = " + hufflepuffStudent.getHonesty() + ", powerOfMagic " + hufflepuffStudent.getPowerOfMagic() +
                    ", distanceTransgression " + hufflepuffStudent.getDistanceTransgression());

        }
        System.out.println();

    }

    public void print(RavenclawStudent[] ravenclawStudents) {
        System.out.println("Количество студентов:" + ravenclawStudents.length);
        for (int i = 0; i < ravenclawStudents.length; i++) {
            RavenclawStudent ravenclawStudent = ravenclawStudents[i];
            System.out.println("RavenclawStudent: " +
                    " name= " + ravenclawStudent.getName() + ", smart = " + ravenclawStudent.getSmart() +
                    ", wisdom = " + ravenclawStudent.getWisdom() +
                    ", wit = " + ravenclawStudent.getWit() + ", creativity "
                    + ravenclawStudent.getCreativity() + ", powerOfMagic " + ravenclawStudent.getPowerOfMagic() +
                    ", distanceTransgression " + ravenclawStudent.getDistanceTransgression());

        }
        System.out.println();

    }

    public void print(SlytherinStudent[] slytherinStudents) {
        System.out.println("Количество студентов: " + slytherinStudents.length);
        for (int i = 0; i < slytherinStudents.length; i++) {
            SlytherinStudent slytherinStudent = slytherinStudents[i];
            System.out.println("SlytherinStudent: "
                    + " name= " + slytherinStudent.getName() + ", cunning = " + slytherinStudent.getCunning()
                    + ", determination = " + slytherinStudent.getDetermination()
                    + ", ambition = " + slytherinStudent.getAmbition() + ", resourcefulness "
                    + slytherinStudent.getResourcefulness() + ", powerOfMagic "
                    + slytherinStudent.getPowerOfMagic()
                    + ", distanceTransgression " + slytherinStudent.getDistanceTransgression());

        }

    }
}
