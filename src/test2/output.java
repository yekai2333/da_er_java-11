package test2;

public interface output {
    int MAX_N = 50;
    void out();
    void getData(String text);
    default void print(String ... texts){
        for (String text : texts){
            System.out.println(text);
        }
    }
    default void test(){
        System.out.println("默认的test()方法");
    }
    static String staticTest(){
        return "接口里的类方法";
    }
}
