package Tester;

// A class to model a Ryerson Course

// Note: there are no getter and setter methods in class RyCourse. You do not need them to write the solution.
public class RyCourse {

    private String name;
    private String number;

    public RyCourse(String name, String number) {
        this.name = name;
        this.number = number;

    }

    //-----------Start below here. To do: approximate lines of code = 3
    // Write an equals method (i.e. override the equals method inherited from class Object)
    // that compares two RyCourse objects based on name and number 
    public boolean equals(RyCourse other) {
        if (this.name.equals(other.name) && this.number == other.number) {
            return true;
        }
        return false;
    }
    //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
}
