/**
 * @author Austin Powers
 * This will do all the manipulation of the student files.
 */

import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
public class Data_Manipulation {

    private FileWriter fileWriter;

    private ArrayList<Student> students= new ArrayList<>(); //list of students

    /**
     * default constructor
     */
    public Data_Manipulation(){

    }

    public Data_Manipulation(ArrayList<Student> students){
        this.students = students;
    }


    /**
     * checks to see if the student exists in the list by the ssn
     * @param firstName first name of student
     * @param lastName last name of student
     * @param ssn social security number of student
     * @param age age of student
     * @return if there was a match of ssn
     */
    public boolean createStudent(String firstName, String lastName, String ssn, int age) {

        boolean duplicate = false;

        if(ssnMatch(ssn) >= 0){ // if there isn't a match it will be -1
            duplicate = true;
        }else{
            Student student = new Student(firstName,lastName,ssn,age);
            students.add(student);
        }
        return duplicate;
    }

    /**
     * deletes a student
     * @param ssn ssn of student to be deleted
     * @return if student was successfully deleted
     */
    public boolean deleteStudent(String ssn) {

        boolean match = true;

        if (ssnMatch(ssn) < 0) { // if there isn't a match it will be -1

            match = false;

        }else{

            students.remove(ssnMatch(ssn));

        }
        return match;
    }

    /**
     * checks arraylist for ssn match
     * @param ssn social to match
     * @return if -1 there was no match if anything else match found
     */
    private int ssnMatch(String ssn) {
        int match = -1; // if the return value = -1 then there is no match

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getSsn().equals(ssn)) {

                match = i; // if it does match return the value of the matched item

            }
        }

        return match;
    }

    /**
     * this creates a json using SIMPLE
     */
    public void createJson(){

        JSONArray studentList = new JSONArray();

        for (int i = 0; i < students.size(); i++) { //for each student
            JSONObject json = new JSONObject(); //create new json object
            json.put("first_name", students.get(i).getFirstName()); //fill with info
            json.put("last_name", students.get(i).getLastName());
            json.put("ssn", students.get(i).getSsn());
            json.put("age", students.get(i).getAge());
            studentList.add(json); //add it to list of students
        }
        try {

           fileWriter = new FileWriter("JsonTest.json", false); //make file writer

            fileWriter.write(studentList.toJSONString());
            fileWriter.close();
        }catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
