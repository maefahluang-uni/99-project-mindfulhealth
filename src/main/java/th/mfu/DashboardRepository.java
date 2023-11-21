package th.mfu;
import org.springframework.data.jpa.repository.JpaRepository;

import th.mfu.domain.Dashboard;

public interface DashboardRepository extends JpaRepository<Dashboard, Long> {
    Dashboard findByUsername(String username);
}