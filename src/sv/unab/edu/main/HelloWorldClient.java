package sv.unab.edu.main;

import sv.unab.edu.ws.HolaMundoIntelliJService;

public class HelloWorldClient {
    public static void main(String[] argv) {
        sv.unab.edu.ws.HolaMundoIntelliJ port = new HolaMundoIntelliJService().getHolaMundoIntelliJPort();
        //invoke business method
        System.out.println("Webservice " + port.hola("Yonatan"));
    }
}
