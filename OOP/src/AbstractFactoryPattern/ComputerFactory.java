package AbstractFactoryPattern;

public class ComputerFactory {

    Computer createComputer(ComputerAbstractFactory t) {
        return t.createComputer();
    }
}
