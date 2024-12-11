package IJG.Portal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrentSubsRepository extends JpaRepository<CurrentSubs, Integer> {
    // Add custom query methods if needed
}
