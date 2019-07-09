package defaultsMethodsInInterface;

public interface Interface1 {

    default public void methodA(){
        System.out.println("Inside method A"+Interface1.class);
    }
}
