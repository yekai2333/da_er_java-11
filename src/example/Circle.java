package example;
public class Circle extends shape{
    private double radius;
    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double calPerimeter(){
        return 2 * Math.PI * radius;
    }
    public String getType(){
        return "圆形";
    }
    public static void main(String[] args) {
        shape s1 = new Triangle("黑色",3,4,5);
        shape s2 = new Circle("黄色",3);
        System.out.println(s1.getType());
        System.out.println(s1.calPerimeter());
        System.out.println(s2.getType());
        System.out.println(s2.calPerimeter());
    }
}

