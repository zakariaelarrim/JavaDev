package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {
    ClientService clientService = new ClientServiceImpl();
    public Client save (Client c){
        return this.clientService.save(c);
    }
    public ClientController(){
        System.out.println("call ClientControllerImpl class");
    }
}
