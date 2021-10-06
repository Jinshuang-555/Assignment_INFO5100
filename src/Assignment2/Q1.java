package Assignment2;

public class Q1 {
    public static class Shape {
        private String name;
        private String color;
        private int area;
        private int perimeter;
        /**
         Shape class
         */
        public Shape(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public Shape(String name, String color, int perimeter, int area) {
            this.name = name;
            this.color = color;
            this.area = area;
            this.perimeter = perimeter;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public int getArea() {
            return area;
        }

        public int getPerimeter() {
            return perimeter;
        }

        public String printShape(){
            return "The " + this.name + " has a " + this.color + " color";
        }
    }
    /**
     Rectangle class
     */
    public static class Rectangle extends Shape{
        private int width;
        private int height;
        public Rectangle(int side) {
            super(null,null);
            this.width=side;
            this.height= side;
        }
        public Rectangle(int width, int height) {
            super(null,null);
            this.width=width;
            this.height= height;
        }
        public Rectangle(String name, String color, int width, int height) {
            super(name,color);
            this.width=width;
            this.height= height;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        @Override
        public int getArea() {
            return this.width*this.height;
        }

        @Override
        public int getPerimeter() {
            return 2*(this.width+this.height);
        }
    }
    /**
     Square class
     */
    public static class Square extends Shape{
        int side;
        public Square(int side) {
            super(null, null);
            this.side = side;
        }
        public Square(String name, String color, int side) {
            super(name, color);
            this.side = side;
        }

        public int getSide() {
            return side;
        }

        @Override
        public int getArea() {
            return this.side*this.side;
        }

        @Override
        public int getPerimeter() {
            return 4*this.side;
        }
    }
    public static class ShapeTester {
        public static void main(String[] args) {
            Shape shape1 = new Shape("Shape1", "pink");
            System.out.println("shape1");
            System.out.println(shape1.printShape());
            Shape shape2 = new Shape("Shape2", "orange", 20, 30);
            System.out.println("shape2");
            System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
            System.out.println(shape2.printShape());
            Rectangle rectangle1 = new Rectangle(2);
            System.out.println("rectangle1");
            System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());
            Rectangle rectangle2 = new Rectangle("Rectangle", "Purple",4, 7);
            System.out.println("rectangle2");
            System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
            System.out.println(rectangle2.printShape());Square square1 = new Square(3);
            System.out.println("square1");
            System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());
            Square square2 = new Square("Square" , "black", 7);
            System.out.println("square2");
            System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
            System.out.println(square2.printShape());
        }
    }
}
