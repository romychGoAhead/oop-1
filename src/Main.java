import java.util.Random;
public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        GryffindorStudent[] gryffindorStudents = {
                new GryffindorStudent("Harry Potter",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
                new GryffindorStudent("Hermione Granger",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),

                new GryffindorStudent("Ron Weasley",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
        };

        RavenclawStudent[] ravenclawStudents = {
                new RavenclawStudent("Zhou Chang",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),

                new RavenclawStudent("Padma Patil",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
                new RavenclawStudent("Marcus Belby",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
        };


        HufflepuffStudent[] hufflepuffStudents = {
                new HufflepuffStudent("Zachariah Smith",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
                new HufflepuffStudent("Cedric Diggory",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
                new HufflepuffStudent("Justin Finch",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
        };
        System.out.println();
        SlytherinStudent[] slytherinStudents = {
                new SlytherinStudent("Draco Malfoy",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
                new SlytherinStudent("Graham Montague",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
                new SlytherinStudent("Gregory Goyle",
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100),
                        random.nextInt(1, 100)),
        };

        //  HogwartsStuden[] hogwartsStuden = {
        //          new HogwartsStudent("Harry Potter",
        //                  random.nextInt(1, 100),
        //                  random.nextInt(1, 100),
        //                  random.nextInt(1, 100),
        //                  new HogwartsStudent("Hermione Granger",
        //                          random.nextInt(1, 100),
        //                          random.nextInt(1, 100),
        //                          random.nextInt(1, 100),


        PrintService printService = new PrintService();
        printService.print(gryffindorStudents);
        printService.print(hufflepuffStudents);
        printService.print(ravenclawStudents);
        printService.print(slytherinStudents);

        System.out.println();


        gryffindorStudents[0].compare(gryffindorStudents[2]);
        hufflepuffStudents[0].compare(hufflepuffStudents[2]);
        ravenclawStudents[0].compare(ravenclawStudents[2]);
        slytherinStudents[0].compare(slytherinStudents[2]);

        HogwartsStudent
    }


}






