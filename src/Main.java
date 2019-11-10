public class Main {
    public static void main(String[] args) {
        Human student = new Student(6, 17, "Sasha");
        Human student1 = new Student(5, 15, "Vasua");
        Human teacher = new Teacher("Math", 15, "Misha");
        Human teacher1 = new Teacher("Physics", 15, "Slava");
        System.out.println(student.equals(teacher));




        /*School school = new School();
        school.addHumansToSchool(student);
        school.addHumansToSchool(student1);
        school.addHumansToSchool(teacher);
        school.addHumansToSchool(teacher1);
        school.allSing();
        school.allDance();
        System.out.println(school.hashCode());*/



        /*System.out.println(school.getNamesOfLessons());
        System.out.println(school.getAverageAge());
        System.out.println(school.getAveragePoint());*/
    }
}
