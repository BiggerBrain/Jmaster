package flyweight_pattern.model2;

/**
 * Created by dell on 2017/11/14.
 **/
public interface ChessFlyWeight {
    String getColor();

    void setColor(String c);

    void display(Coordinate c);

}
