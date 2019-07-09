package defaultsMethodsInInterface;

public class InterfaceClient implements Interface1,Interface2,Interface3 {

    public void methodA(){
        System.out.println("Inside method A" + InterfaceClient.class);
    }
    // Calling Priority
    // 1- method in class which implements the interface
    // 2- the sub interface which extends the interface
    public static void main(String[] args) {

        InterfaceClient interfaceClient = new InterfaceClient();
        interfaceClient.methodA();
        interfaceClient.methodB();
        interfaceClient.methodC();

    }
}
