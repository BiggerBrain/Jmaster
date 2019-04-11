package creational_patterns.build;

/**
 * Created by dell on 2017/11/14.
 */
public interface PersonBuilder {
    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();
}
