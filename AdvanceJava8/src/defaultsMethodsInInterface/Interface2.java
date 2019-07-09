package defaultsMethodsInInterface;

public interface Interface2 extends Interface1 {

    default public void methodB(){
        System.out.println("Inside method B");
    }

    default public void methodA(){
        System.out.println("Inside method A" + Interface2.class);
    }
}
