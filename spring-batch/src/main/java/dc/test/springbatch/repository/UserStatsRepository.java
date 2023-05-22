package dc.test.springbatch.repository;

import dc.test.springbatch.model.UserStats;
import dc.test.springbatch.model.UserStatsCompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserStatsRepository extends JpaRepository<UserStats, UserStatsCompositeKey> {
}
