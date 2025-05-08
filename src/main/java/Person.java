import java.util.Arrays;

/**
 * Creates a person that has traits such as a first name, last name, birth day, birth month, birth year, social security number, number of siblings, and a siblings array
 * @author Aarooran Anankan
 * @version 1.0
 */
class Person {

    //Instance Variables
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private String ssn;
    private int numberOfSiblings = 0;
    private Person[] siblings = new Person[0];

    /**
     * Constructor that sets the values of the instance variables to that of the parameters
     * @param firstName the peron's first name
     * @param lastName the peron's last name
     * @param birthDay  the peron's birth day
     * @param birthMonth  the peron's birth month
     * @param birthYear  the peron's birth year
     * @param ssn  the peron's social security number
     */
    public Person(String firstName, String lastName, int birthDay, int birthMonth, int birthYear, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.birthMonth = birthMonth;
        this.birthYear = birthYear;
        this.ssn = ssn;
    }

    /**
     * A getter that gets the first name
     * @return
     */
    public String getFirstname() {
        return this.firstName;
    }

    /**
     * A getter that gets the last name
     * @return
     */
    public String getLastname() {
        return this.lastName;
    }

    /**
     * A setter that sets a new value for the first name
     * @param newFirstName the new first name inputted by the user
     */
    public void setFirstname(String newFirstName) {
        this.firstName = newFirstName;
    }

    /**
     * A setter that sets a new value for the last name
     * @param newLastName the new last name inputted by the user
     */
    public void setLastname(String newLastName) {
        this.lastName = newLastName;
    }

    /**
     * Returns a String composed of their birthday in day/month/year format
     * @return
     */
    public String getBirthday() {
        return this.birthDay + "/" + this.birthMonth + "/" + this.birthYear;
    }

    /**
     * Adds a person parameter as a sibling into the sibling array
     * @param person the sibling being added into the array bu the user
     */
    public void addSibling(Person person) {
        
        this.numberOfSiblings++;

        if (person!=null) {
            
            Person[] newSiblings = new Person[this.siblings.length+1];
            
            for (int i=0; i<siblings.length; i++) {
                newSiblings[i] = this.siblings[i];
            }

            newSiblings[newSiblings.length-1] = person;
            this.siblings=newSiblings;
        }
    }

    /**
     * A getter that gets the array of siblings
     * @return
     */
    public Person[] getSiblings() {
        return this.siblings;
    }
}