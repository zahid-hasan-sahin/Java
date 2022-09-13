package AbstractFactoryPattern;

public class LaptopFactory implements ComputerAbstractFactory {

    @Override
    public Computer createComputer() {
        return new Laptop();
    }

}
