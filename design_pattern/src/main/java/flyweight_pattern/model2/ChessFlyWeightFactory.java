package flyweight_pattern.model2;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dell on 2017/11/14.
 */
public class ChessFlyWeightFactory {
    //享元池
    private static Map<String, ChessFlyWeight> map = new HashMap<String, ChessFlyWeight>();

    public ChessFlyWeight getChess(String color) {
        if (map.get(color) != null) {
            return map.get(color);
        } else {
            ChessFlyWeight cfw = new ConcreteChess(color);
            map.put(color, cfw);
            return cfw;
        }
    }
}