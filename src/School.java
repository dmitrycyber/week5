import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class School {
    private double point;
    private List<Human> listOfHumans;
    private double age;

    public School (){
        this.listOfHumans = new ArrayList<>();
    }

    public void addHumansToSchool (Human human) {
        listOfHumans.add(human);
    }

    public double getAverageAge() {
        int sum = 0;
        for (int i = 0; i < listOfHumans.size(); i++) {
            sum += listOfHumans.get(i).getAge();
        }
        return sum / listOfHumans.size();
    }

    public String getNamesOfLessons(){
        String string = "";
        for (int i = 0; i < listOfHumans.size(); i++) {
            if (listOfHumans.get(i) instanceof Teacher) {
                string += ((Teacher) listOfHumans.get(i)).getLesson();
            }
        }
        return string;
    }

    public double getAveragePoint(){
        double sum = 0;
        int counter = 0;
        for (int i = 0; i < listOfHumans.size(); i++) {
            if (listOfHumans.get(i) instanceof Student) {
                sum += ((Student) listOfHumans.get(i)).getPoint();
                counter++;

            }
        }
        return (double) sum / counter;
    }

    public void allSing(){
        for (int i = 0; i < listOfHumans.size(); i++) {
            listOfHumans.get(i).sing();
        }
    }

    public void allDance(){
        for (int i = 0; i < listOfHumans.size(); i++) {
            listOfHumans.get(i).dance();
        }
    }
}
