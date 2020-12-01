package test1;
public class Lss extends student{
    double maths;
    public Lss(String sex,double maths){
        super(sex);
        this.maths = maths;
    }
    public void setMath(double maths){
        this.maths = maths;
    }
    public double getSum(){
        return maths;
    }
    public String getSex(){
        return "女";
    }
    public static void main(String[] args) {
        student s1 = new Zss("男",90,89,94);
        student s2 = new Lss("女",100);
        System.out.println(s1.getSum());
        System.out.println(s1.getSex());
        System.out.println(s2.getSum());
        System.out.println(s2.getSex());
    }
}
