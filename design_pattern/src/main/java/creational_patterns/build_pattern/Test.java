package creational_patterns.build_pattern;

/**
 * Created by dell on 2017/11/14.
 */
public class Test {
    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person manPerson = pd.constructPerson(new ManBuilder());
        Person womanPerson = pd.constructPerson(new WomanBuilder());
    }
}
