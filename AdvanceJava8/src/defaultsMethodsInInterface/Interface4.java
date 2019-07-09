package defaultsMethodsInInterface;

public interface Interface4 {

    default public void methodA(){
        System.out.println("Inside method A"+ Interface4.class);
    }
}
