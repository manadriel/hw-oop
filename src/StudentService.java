public class StudentService {
    HogwartsStudent[] students = {
            new GriffindorStudent("Harry", "Potter", 70, 69, 7, 8, 9),
            new GriffindorStudent("Hermione", "Granger", 80, 80, 9, 8, 5),
            new GriffindorStudent("Ron", "Weasley", 42, 50, 5, 9, 6),
            new SlytherinStudent("Draco", "Malfoy", 70, 65, 5, 7, 8, 4),
            new SlytherinStudent("Graham", "Montague", 40, 40, 8, 7, 5, 4),
            new SlytherinStudent("Gregory", "Goyle", 50, 20, 2, 4, 7, 2),
            new HufflepuffStudent("Zachariah", "Smith", 90, 80, 7, 8, 7),
            new HufflepuffStudent("Cedric", "Diggory", 80, 90, 7, 6, 6),
            new HufflepuffStudent("Justin", "Finch-Fletchley", 60, 72, 6, 5, 7),
            new RavenclawStudent("Zhou", "Chang", 65, 90, 7, 6, 5, 7),
            new RavenclawStudent("Padma", "Patil", 75, 80, 8, 5, 6, 6),
            new RavenclawStudent("Marcus", "Belby", 95, 70, 9, 4, 7, 5),

    };

    public void printInfo(String firstName, String secondName) {
        boolean exist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getFirstName().equals(firstName) &&
                    students[i].getSecondName().equals(secondName)) {
                exist = true;
                System.out.println(students[i].getFirstName() + " " + students[i].getSecondName() + ": SpellPower = "
                        + students[i].getSpellPower() + ", ApparateDistance = " + students[i].getApparateDistance()
                        + students[i]);
                break;
            }
        }
        if (!exist) {
            System.out.println("This is not a student: " + firstName + " " + secondName);
        }
    }

    public void compareStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                sum1 = sum1 + students[i].getSpellPower() + students[i].getApparateDistance();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                sum2 = sum2 + students[i].getSpellPower() + students[i].getApparateDistance();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareGriffindorStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        GriffindorStudent student1 = null;
        GriffindorStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (GriffindorStudent) students[i];
                sum1 = sum1 + student1.getHonor() + student1.getCourage() + student1.getNobleness();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (GriffindorStudent) students[i];
                sum2 = sum2 + student2.getHonor() + student2.getCourage() + student2.getNobleness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareSlytherinStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        SlytherinStudent student1 = null;
        SlytherinStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (SlytherinStudent) students[i];
                sum1 = sum1 + student1.getCunning() + student1.getDetermination() + student1.getAmbition() + student1.getResourcefulness();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (SlytherinStudent) students[i];
                sum2 = sum2 + student2.getCunning() + student2.getDetermination() + student2.getAmbition() + student2.getResourcefulness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareRavenclawStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        RavenclawStudent student1 = null;
        RavenclawStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (RavenclawStudent) students[i];
                sum1 = sum1 + student1.getIntelligence() + student1.getWisdom() + student1.getWit() + student1.getCreativeness();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (RavenclawStudent) students[i];
                sum2 = sum2 + student2.getIntelligence() + student2.getWisdom() + student2.getWit() + student2.getCreativeness();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }

    public void compareHufflepuffStudents(String firstName1, String secondName1, String firstName2, String secondName2) {
        int sum1 = 0;
        int sum2 = 0;
        HufflepuffStudent student1 = null;
        HufflepuffStudent student2 = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            if (students[i].getFirstName().equals(firstName1) &&
                    students[i].getSecondName().equals(secondName1)) {
                student1 = (HufflepuffStudent) students[i];
                sum1 = sum1 + student1.getIndustriousness() + student1.getLoyalty() + student1.getHonesty();
            }
            if (students[i].getFirstName().equals(firstName2) &&
                    students[i].getSecondName().equals(secondName2)) {
                student2 = (HufflepuffStudent) students[i];
                sum2 = sum2 + student2.getIndustriousness() + student2.getLoyalty() + student2.getHonesty();
            }
        }
        if (sum1 > sum2) {
            System.out.println(firstName1 + " " + secondName1 + " is better than " + firstName2 + " " + secondName2);
        } else {
            System.out.println(firstName2 + " " + secondName2 + " is better than " + firstName1 + " " + secondName1);
        }
    }
}