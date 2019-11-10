public class Teacher extends Human {
    private String lesson;

    public Teacher (String lesson, int age, String name) {
        super(age, name);
        this.lesson = lesson;
    }

    public void setAge(int age) {
        setAge(age);
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public void sing () {
        System.out.println("Sing");
    }

    public void dance(){
        System.out.println("Dance");
    }

}
