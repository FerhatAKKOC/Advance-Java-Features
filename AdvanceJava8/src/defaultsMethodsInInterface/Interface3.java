package defaultsMethodsInInterface;

public interface Interface3 extends Interface2{

    default public void methodC(){
        System.out.println("Inside method C");
    }
}
