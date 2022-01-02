package cigma.pfe.services;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepositoryImpl;
import cigma.pfe.repositories.ClientRepository;
public class ClientServiceImpl implements ClientService{
    ClientRepository clientRepository ;
    public void setClientRepository(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    @Override
    public Client save(Client c){
        System.out.println("Service Layer: clientServiceImpl Level");
        return clientRepository.save(c);
    }
    public  ClientServiceImpl(ClientRepositoryImpl clientRepository){
        this.clientRepository = clientRepository;
    }
}
