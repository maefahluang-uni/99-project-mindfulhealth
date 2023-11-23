package th.mfu;

import org.springframework.data.repository.CrudRepository;

import th.mfu.domain.Dashboard;

public interface DashboardRepository extends CrudRepository<Dashboard, Long> {
    
}