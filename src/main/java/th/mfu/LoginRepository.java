package th.mfu;

import org.springframework.data.jpa.repository.JpaRepository;
import th.mfu.domain.Login;

public interface LoginRepository extends JpaRepository<Login, String> {

    Login findByUsernameAndPassword(String username, String password);
}