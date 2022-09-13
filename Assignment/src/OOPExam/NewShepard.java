package OOPExam;

public class NewShepard extends Be3 implements Ignite {

    @Override
    public void start() {
        System.out.println("NewShepard is started");
    }

    @Override
    public void stop() {
        System.out.println("NewShepard is stoped");
    }

}
