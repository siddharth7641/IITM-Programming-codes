/*
Given a code for student records, implement the code blocks as instructed:

Class Marks 
 > instance variables (private): mathMarks,scienceMarks, englishMarks
 > define the constructor, clone method, and accessor and mutator methods

Class StudentRecords
 > define the clone method appropriately
 > inside the main method, write a code to create the clone for the original student and display the details 
    of the clone and original after making some changes to the clone's marks as 95,92,88 respectively
 */

// define class Marks \
class Marks implements Cloneable{
    private int mathMarks,scienceMarks, englishMarks;
    public Marks(int mathMarks,int scienceMarks, int englishMarks){
        this.mathMarks =mathMarks;
        this.scienceMarks =scienceMarks;
        this.englishMarks = englishMarks;
    }
    
    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getScienceMarks() {
        return scienceMarks;
    }

    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public Marks clone() throws CloneNotSupportedException{
        return (Marks)super.clone();   
    }
}

public class prac10 implements Cloneable {
    private String name;
    private int rollNumber;
    private Marks marks;

    
    public prac10(String name, int rollNumber, Marks marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    // define the clone method
    public prac10 clone() throws CloneNotSupportedException{
        prac10 cloned = (prac10)super.clone();
        cloned.marks = (Marks)marks.clone();
        return cloned;
    }

    
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Math Marks: " + marks.getMathMarks());
        System.out.println("Science Marks: " + marks.getScienceMarks());
        System.out.println("English Marks: " + marks.getEnglishMarks());
    }

    
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Marks originalMarks = new Marks(85, 90, 80);
        prac10 originalStudent = new prac10("Alice", 101, originalMarks);

        
        System.out.println("Original Student Details:");
        originalStudent.displayDetails();
        System.out.println();

       
        // create the clone, change the details and print the original and clone details 
        prac10 another = originalStudent.clone();
        another.marks.setEnglishMarks(99);
        another.displayDetails();

    }
}
