package Homework9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Person {

    final String name;
    final String sex;
    final String religion;
    final String nativeLanguage;
    final String nationality;
    final String EGN;
    final String dateOfBirth;
    final String age;
    String country;
    String job;
    String fullEGN;

    public Person(){
        this.name = null;
        this.sex = null;
        this.religion = null;
        this.nativeLanguage = null;
        this.nationality = null;
        this.EGN = addEGN();
        this.dateOfBirth = addDOB();
        this.age = null;
        this.country = null;
        this.job = null;
    }

    public Person(String name, String sex, String religion, String nativeLanguage, String nationality, String EGN, String dateOfBirth, String age, String country, String job) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.nativeLanguage = nativeLanguage;
        this.nationality = nationality;
        this.EGN = addEGN();
        this.dateOfBirth = addDOB();
        this.age = age;
        this.country = country;
        this.job = job;
    }

    // creating Java Doc
    /**
     * the method generates a user input EGN
     * @return String
     */
    public String addEGN(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter 10 digit EGN: ");
        String input = myInput.nextLine();
        if (input.chars().count() != 10){
            throw new InputMismatchException("EGN must be exactly 10 digits" + " You've entered: " + input.length());
        }
        fullEGN = input;
        return input;
    }

    /** + Enter creates Java Doc
     *
     * @return
     */
    public String addDOB(){
        String yearOfBirth = fullEGN.substring(0,2);
        String monthOfBirth = fullEGN.substring(2,4);
        String dayOfBirth = fullEGN.substring(4,6);
        return dayOfBirth + "." + monthOfBirth + "." + yearOfBirth  ;
    }

    // will not commit with to do
    // TODO wrong sex implementation

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.dateOfBirth);
    }
}
