package cigma.pfe.controllers;

import cigma.pfe.models.Client;
import cigma.pfe.services.ClientService;
import cigma.pfe.services.ClientServiceImpl;

public class ClientController {

    ClientService clientService ;
    public void setClientService(ClientService clientService){
        this.clientService = clientService;
    }
    public Client save (Client c){
        return this.clientService.save(c);
    }
    public ClientController(){
        System.out.println("call ClientControllerImpl class");
    }
    public ClientController(ClientService clientService){
        this.clientService = clientService;
        System.out.println("call ClientControllerImpl class");
    }
}
