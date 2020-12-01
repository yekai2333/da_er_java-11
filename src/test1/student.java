package test1;

public abstract class student {
    {
        System.out.println("执行student的初始化块");
    }
    private String name;
    public abstract double getSum();
    public abstract String getSex();
    public student(){}
    public student(String name){
        System.out.println("执行student的构造器");
        this.name = name;
    }
}