package example;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class Client {
    public static void main(String args[]){
        HelloWorldService helloWorldImplService=new HelloWorldServiceLocator();
        try {
            HelloWorld_PortType helloWorld = helloWorldImplService.getHelloWorld();
            String heying = helloWorld.sayHelloWorldFrom("heying");
            System.out.println(heying);
        } catch (ServiceException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
