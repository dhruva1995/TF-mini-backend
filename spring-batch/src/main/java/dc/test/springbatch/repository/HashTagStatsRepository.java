package dc.test.springbatch.repository;

import dc.test.springbatch.model.HashTagCompositeKey;
import dc.test.springbatch.model.HashTagStats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HashTagStatsRepository extends JpaRepository<HashTagStats, HashTagCompositeKey> {
}
