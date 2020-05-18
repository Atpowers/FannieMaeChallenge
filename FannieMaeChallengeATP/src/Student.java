public class Student {
private String firstName; //first name
private String lastName; //last name
private String ssn; //social security number
private int age; // age

    /**
     * Default constructor for Student you need all information
     * @param firstName First name of student
     * @param lastName last name of student
     * @param ssn social security number of student
     * @param age age of student
     */
    public Student(String firstName, String lastName, String ssn, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ssn = ssn;
    }

    /**
     * getter for age
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * getter for first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * getter for lastName
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * getter for Ssn
     * @return ssn
     */
    public String getSsn() {
        return ssn;
    }
}
