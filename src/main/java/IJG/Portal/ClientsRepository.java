package IJG.Portal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {
    // Add custom query methods if needed
}

