package creational.patterns.build;

public class Director {
    public Product constructPerson(IBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}