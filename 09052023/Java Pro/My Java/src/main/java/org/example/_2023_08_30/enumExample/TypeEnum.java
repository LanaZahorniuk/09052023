package org.example._2023_08_30.enumExample;

public enum TypeEnum {
    HISTORY, MATH, LITERATURE, PHYSICS, DRAWING, CHEMISTRY, CHOREOGRAPHY

}

class Main {

    public static void main(String[] args) {

        Teachers teacher1 = new Teachers("Ludwig", "Wallow", 15, TypeEnum.HISTORY);
        Teachers teacher2 = new Teachers("Ada", "Bingo", 2, TypeEnum.PHYSICS);
        Teachers teacher3 = new Teachers("Lidia", "Kun", 10, TypeEnum.LITERATURE);
        Teachers teacher4 = new Teachers("Jorgo", "Armani", 7, TypeEnum.CHOREOGRAPHY);
        Teachers teacher5 = new Teachers("Paulo", "Carl", 12, TypeEnum.DRAWING);
        Teachers teacher6 = new Teachers("Filippo", "Moris", 15, TypeEnum.CHEMISTRY);
        Teachers teacher7 = new Teachers("Veronika", "Anti", 20, TypeEnum.MATH);


        Teachers teachers[] = {teacher1, teacher2, teacher3, teacher4, teacher5, teacher6, teacher7};
        System.out.println(teachers);

        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getTeachers() == TypeEnum.HISTORY) {
                System.out.println("историк: " + teachers[i].getName() + " " + teachers[i].getLastName());
            }

        }

    }

}
