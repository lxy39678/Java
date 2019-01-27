package car;

public class Test {
    public static void main(String[] args){
        //1 生产引擎
        Engine e1 = new YAMAHA();

        //2 生产汽车
        Car c = new Car(e1); //Engine e=e1

        //3 测试引擎
        c.testEngine();

        //换HONDA
        c.e = new HONDA();
        c.testEngine();
    }
}
