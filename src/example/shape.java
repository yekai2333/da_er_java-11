package example;

public abstract class shape {
    {
        System.out.println("执行shape的初始化块");
    }
    private String color;
    public abstract double calPerimeter();
    public abstract String getType();
    public shape(){}
    public shape(String color){
        System.out.println("执行shape的构造器");
        this.color = color;
    }
}
