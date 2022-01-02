package cigma.pfe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;

public class Lancement {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl1 = new ClientController();
        Client client = new Client(1L, "testing");
        ctrl1.save(client);
        System.out.println("hello world");
    }
}
