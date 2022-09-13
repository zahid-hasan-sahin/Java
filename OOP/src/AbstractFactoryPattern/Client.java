package AbstractFactoryPattern;

public class Client {

    public static void main(String[] args) {
        ComputerFactory cFactory = new ComputerFactory();
        Computer ob1 = cFactory.createComputer(new LaptopFactory());
        Computer ob2 = cFactory.createComputer(new DesktopFactory());
        ob1.computerType();
        ob2.computerType();
    }
}
