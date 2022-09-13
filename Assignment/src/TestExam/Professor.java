package TestExam;

import java.util.ArrayList;

/*
 * A Professor has a name and a list of Professors with whom they collaborate on research projects
 */
public class Professor {

    private String name;
    private ArrayList<Professor> collaborators;

    /**
     * Initializes name and collaborators variables
     */
    public Professor(String nm) {
        //-----------Start below here. To do: approximate lines of code = 2
        // initialize instance variable name to nm, initialize collaborators to an empty array list
        name = nm;
        collaborators = new ArrayList<Professor>();
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Retrieves the name of the proferssor
     *
     * @return a string containing the professor's name
     */
    public String getName() {
        return name;
    }

    /**
     * Adds a professor to the list of collaborators of this professor
     *
     * @param collaborator the professor to be added
     */
    public void addCollaborator(Professor collaborator) {
        //-----------Start below here. To do: approximate lines of code = 1
        // add Professor collaborator to the collaborators array list 
        collaborators.add(collaborator);
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Removes a professor from the list of collaborators of this person.
     *
     * @param collaborator the Professor to be removed
     */
    public void delCollaborator(Professor p) {
        //-----------Start below here. To do: approximate lines of code = 1
        // removes the professor p from the collaborators list.
        collaborators.remove(p);
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

    /**
     * Returns the array list of Professors representing the collaborators
     *
     */
    public ArrayList<Professor> getCollaborators() {
        return collaborators;
    }

    /*
   * Searches the collaborators list of this professor and the other professor's list 
   * to see if they have collaborators in common.   
   * @return a string containing the names of common collaborators where the names are separated by a " "
   * Ensure there is no space character after the last collaborator name
   * return the empty string "" if there are no collaborators in common
     */
    public String collaboratorsInCommon(Professor other) {
        //-----------Start below here. To do: approximate lines of code = 10
        // Hint: professors in common should not contain this professor name or other professor name 
        
        //Hint: remove any space characters at the end of the string. Make sure the string is not "" before removing spaces
        //-----------------End here. Please do not remove this comment. Reminder: no changes outside the todo regions.
    }

}
