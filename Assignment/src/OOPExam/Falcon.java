package OOPExam;

public class Falcon extends Merlin implements Ignite {
    
    @Override
    public void start() {
        System.out.println("Falcon is started");
    }

    @Override
    public void stop() {
        System.out.println("Falcon is stoped");
    }

}
