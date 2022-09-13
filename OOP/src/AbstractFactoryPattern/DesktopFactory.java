package AbstractFactoryPattern;

public class DesktopFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new Desktop();
    }
}
