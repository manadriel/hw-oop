public class Main {
    public static void main(String[] args) {
        StudentService printInfo = new StudentService();
        printInfo.printInfo("Zhou", "Chang");
        StudentService compare = new StudentService();
        compare.compareStudents("Zhou", "Chang", "Draco", "Malfoy");
        compare.compareGriffindorStudents("Harry", "Potter", "Hermione", "Granger");
        compare.compareSlytherinStudents("Gregory", "Goyle", "Draco", "Malfoy");
        compare.compareHufflepuffStudents("Cedric", "Diggory", "Zachariah", "Smith");
        compare.compareRavenclawStudents("Padma", "Patil", "Zhou", "Chang");
    }
}