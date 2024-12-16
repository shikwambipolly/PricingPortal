package IJG.Portal;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    private final ClientsRepository clientRepository;
    private final CurrentSubsRepository currentSubRepository;

    public ClientService(ClientsRepository clientRepository, CurrentSubsRepository currentSubRepository) {
        this.clientRepository = clientRepository;
        this.currentSubRepository = currentSubRepository;
    }

    public Optional<Clients> getClientById(Integer id) {
        return clientRepository.findById(id);
    }

    public Optional<CurrentSubs> getCurrentSubById(Integer id) {
        return currentSubRepository.findById(id);
    }

    public List<Clients> getAllUsers() {
        return clientRepository.findAll();
    }

    public List<CurrentSubs> getAllSubs() {
        return currentSubRepository.findAll();
    }

    @Transactional
    public String addClient(Clients client) {
        clientRepository.save(client);
        return "Successful";
    }

    @Transactional
    public String addSub(CurrentSubs sub) {
        currentSubRepository.save(sub);
        return "Successful";
    }

    public String deleteClient(int id) {
        clientRepository.delete(getClientById(id).get());
        return "Successful";
    }

    public String deleteSub(int id) {
        currentSubRepository.delete(getCurrentSubById(id).get());
        return "Successful";
    }

}

