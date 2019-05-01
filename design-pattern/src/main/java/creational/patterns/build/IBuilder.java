package creational.patterns.build;

/**
 * @author lishixiong
 */
public interface IBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Product buildPerson();
}
