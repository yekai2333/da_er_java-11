package test1;

public class Zss extends student{
    private double a;
    private double b;
    private double c;
    public Zss(String sex,double a,double b,double c){
        super(sex);
        this.setSides(a,b,c);
    }
    public void setSides(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getSum(){
        return a + b + c;
    }
    public String getSex(){
        return "男";
    }
}
