package car;

//生产汽车
public class Car {
    //引擎
    //面向接口编程
    Engine e;

    //构造方法
    Car(Engine e){
        this.e = e;
    }

    //测试引擎
    public void testEngine(){
        e.start(); //面向接口调用
    }
}
