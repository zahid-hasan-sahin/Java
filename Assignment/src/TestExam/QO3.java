package TestExam;

/*
 * A simple program to test a class Professor
 */
public class QO3 {

    public static void main(String[] args) {

        Professor rachel = new Professor("Rachel");
        Professor joey = new Professor("Joey");
        Professor ross = new Professor("Ross");
        Professor monica = new Professor("Monica");
        Professor chandler = new Professor("Chandler");
        Professor phoebe = new Professor("Phoebe");

        rachel.addCollaborator(joey);
        rachel.addCollaborator(ross);
        rachel.addCollaborator(monica);
        rachel.addCollaborator(chandler);
        rachel.addCollaborator(phoebe);

        joey.addCollaborator(rachel);
        joey.addCollaborator(ross);
        joey.addCollaborator(monica);
        joey.addCollaborator(chandler);
        joey.addCollaborator(phoebe);

        System.out.println(rachel.collaboratorsInCommon(joey));
        System.out.println(joey.collaboratorsInCommon(rachel));

        rachel.delCollaborator(monica);
        System.out.println(rachel.collaboratorsInCommon(joey));
        rachel.delCollaborator(chandler);
        System.out.println(rachel.collaboratorsInCommon(joey));
        rachel.delCollaborator(phoebe);
        System.out.println(rachel.collaboratorsInCommon(joey));
        rachel.delCollaborator(ross);
        System.out.println(rachel.collaboratorsInCommon(joey));
        System.out.println("Expected:\nRoss Monica Chandler Phoebe\nRoss Monica Chandler Phoebe\nRoss Chandler Phoebe\nRoss Phoebe\nRoss");

    }
}
