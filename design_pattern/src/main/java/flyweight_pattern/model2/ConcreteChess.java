package flyweight_pattern.model2;

/**
 * Created by dell on 2017/11/14.
 */
class ConcreteChess implements ChessFlyWeight {
    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String c) {
        this.color = c;
    }

    public void display(Coordinate c) {
        System.out.println("棋子颜色：" + getColor());
        System.out.println("棋子位置：" + c.getX() + "----" + c.getY());
    }
}