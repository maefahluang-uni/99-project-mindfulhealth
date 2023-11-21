package th.mfu;
import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.domain.Dashboard;

public interface menstrualRepository extends JpaRepository<Dashboard, Long> {
    ;
}