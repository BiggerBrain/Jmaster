import com.jayway.jsonpath.JsonPath;

import java.util.ArrayList;
import java.util.List;

public class Pattern {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(2);
        arrayList.size();
        arrayList.add("ss");
        String jsonPath = "[?(" +
            "=310|=240".replaceAll(">=", "mt")
                .replaceAll("<=", "le")
                .replaceAll("\\|", "||")
                .replaceAll("&", "&&")
                .replaceAll(">", "\\$." + "code" + ">")
                .replaceAll("<", "\\$." + "code" + "<")
                .replaceAll("=", "\\$." + "code" + "==")
                .replaceAll("mt", "\\$." + "code" + ">=")
                .replaceAll("le", "\\$." + "code" + "<=")
            + ")]";
        System.out.println(jsonPath);
        List<Object> matchers = JsonPath.read("{\"code\":310}", jsonPath);
        System.out.println(!matchers.isEmpty());
        matchers = JsonPath.read("{\"code\":240}", jsonPath);
        System.out.println(!matchers.isEmpty());
        matchers = JsonPath.read("{\"code\":11}", jsonPath);
        System.out.println(!matchers.isEmpty());
    }
}