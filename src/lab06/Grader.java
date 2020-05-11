package lab06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class Grader {

    // Declaring (and Instantiating) the Class Variables
    private File file;
    private ArrayList<Integer> grades = new ArrayList<Integer>();


    //This is the constructor method for the class. 
    public Grader(File file) throws FileNotFoundException {

        // Checks if the file exists
        if (file.exists()) {

            // Sets the file and grades variables
            setFile(file);
            setGrades();
        }
        else {

            // Throws the FileNotFoundException and Gets the Absolute Path of the Incorrect File
            throw new FileNotFoundException(file.getAbsolutePath());
        }
    }

    //This is a constructor method for the class.
    public Grader(String path) throws FileNotFoundException {

        // Finds the File Object Using its Path and Stores it in the Variable 'file'
        File file = new File(path);

        // Checks if the file exists
        if (file.exists()) {

            // Sets the file and grades Class Variables
            setFile(file);
            setGrades();
        }
        else {

            // Throws the FileNotFoundException and Gets the Absolute Path of the Incorrect File
            throw new FileNotFoundException(file.getAbsolutePath());
        }
    }

    //This method calculates the average grade from a set of grades.
    public float calculateAverage() {

        // Creates a new variable sum
        float sum = 0;

        // Iterates through the ArrayList and find the sum of all its elements
        for (int grade : this.grades) {
            sum += grade;
        }

        // Returns the Average of All Elements of the ArrayList
        return sum / this.grades.size();
    }


    //This is the getter method for the file variable for the class.
    public File getFile() {

        // Returns the Class Variable 'file'
        return this.file;
    }


    //This is the setter method for the file variable
    public void setFile(File file) throws FileNotFoundException{

        // Checks if the file exists
        if (file.exists()) {

            // Assigns this File Object to the Class Variable 'file'
            this.file = file;
        }
        else {

            // Throws the FileNotFoundException and Gets the Absolute Path of the Incorrect File
            throw new FileNotFoundException(file.getAbsolutePath());
        }
    }


    //This is the setter method for the file variable for the class.
    public void setFile(String path) throws FileNotFoundException {

        // Finds the File Object Using its Path and Stores it in the Variable 'file'
        File file = new File(path);

        // Checks if the file exists
        if (file.exists()) {

            // Assigns this File Object to the Class Variable 'file'
            this.file = file;
        }
        else {

            // Throws the FileNotFoundException and Gets the Absolute Path of the Incorrect File
            throw new FileNotFoundException(file.getAbsolutePath());
        }
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    

    private void setGrades() throws FileNotFoundException {

        try (Scanner input = new Scanner(this.file)) {

            // Keeps searching the file for a new integer and adds it to the ArrayList grades
            while(input.hasNextInt()) {
                this.grades.add(input.nextInt());
            }
        }
        catch (FileNotFoundException exceptionSetGrades) {

            // Throws the FileNotFoundException and Gets the Absolute Path of the Incorrect File
            throw new FileNotFoundException(this.file.getAbsolutePath());
        }
    }

 
    //It creates instances of the class Grade and calculates their average.
    public static void main(String[] args) {
        try {

            // Creates a new File Object
            File gradeFileOne = new File("/Users/mehul/Desktop/CMPT220_Labs/src/lab06/grades1.txt");

            // Creates the two Grader objects
            Grader gradesOne = new Grader(gradeFileOne);
            Grader gradesTwo = new Grader("/Users/mehul/Desktop/CMPT220_Labs/src/lab06/grades2.txt");

            // Calculates and Stores the Average Grade Values of the Grader Objects
            float averageOne = gradesOne.calculateAverage();
            float averageTwo = gradesTwo.calculateAverage();

            // Prints Out The Results
            System.out.println("The Average of the Two Sets of Grades Is -->");
            System.out.println("Set 1: " + averageOne);
            System.out.println("Set 2: " + averageTwo);
        }
        catch (FileNotFoundException exceptionFile) {

            // Runs if the File Cannot Be Found and Exits the Program
            System.out.println("\nThe Following File Cannot Be Found:");
            System.out.println(exceptionFile.getMessage());
            System.out.println("Please Check The Source!");
            System.exit(1);
        }
    }
}
