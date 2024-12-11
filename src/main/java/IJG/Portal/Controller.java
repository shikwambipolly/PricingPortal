package IJG.Portal;

import org.springframework.boot.autoconfigure.security.oauth2.server.servlet.OAuth2AuthorizationServerProperties.Client;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class Controller {
    private final ClientService userService;

    public Controller(ClientService userService) {
        this.userService = userService;
    }

    @GetMapping("/getClients")
    public List<Clients> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/getSubs")
    public List<CurrentSubs> getAllSubs() {
        return userService.getAllSubs();
    }

    @GetMapping("/getClient/{id}")
    public Clients getClient(@PathVariable int id) {
        return userService.getClientById(id).get();
    }

    @GetMapping("/getSub/{id}")
    public CurrentSubs getSub(@PathVariable int id) {
        return userService.getCurrentSubById(id).get();
    }

    @PostMapping("/createClient")
    public String addClient(@RequestParam int id, @RequestParam String name,
    @RequestParam String email, @RequestParam int subcount, @RequestParam int revenue) {

        Clients newClient = new Clients(id, name, email, subcount, revenue);

        String response = userService.addClient(newClient);

        return response + "\n" + newClient;

    }

    @PostMapping("/createSub")
    public String addSub(@RequestParam int id, @RequestParam Date date) {

        //Clients owner = userService.getClientById(id).get();

        CurrentSubs newSub = new CurrentSubs(id, date);

        String response = userService.addSub(newSub);

        return response + "\n" + newSub;

    }

    @DeleteMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable int id) {
        return userService.deleteClient(id);
    }

    @DeleteMapping("/deleteSub/{id}")
    public String deleteSub(@PathVariable int id) {
        return userService.deleteSub(id);
    }

    
}

