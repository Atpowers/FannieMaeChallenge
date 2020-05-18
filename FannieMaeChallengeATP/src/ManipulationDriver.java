import java.util.ArrayList;

/**
 * Driver for the data_manipulation java
 */
public class ManipulationDriver {

    public static void main(String args[]){

        Student studentOne = new Student("damen","buck", "1111111", 20);
        Student studentTwo = new Student("Fannie", "mae", "2222222", 58);
        ArrayList<Student> students = new ArrayList<>();
        students.add(studentOne);
        students.add(studentTwo);

        Data_Manipulation data_manipulation = new Data_Manipulation(students);

        data_manipulation.createJson();
    }
}
