package Assignment5.Q2;

public class ShapeMaker {
    Shape circle;
    Shape rectangle;
    Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }
    public void drawRectangle() {
        rectangle.draw();
    }
    public void drawSquare() {
        square.draw();
    }
}
