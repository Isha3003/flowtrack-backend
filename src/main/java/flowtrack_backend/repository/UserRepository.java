package flowtrack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import flowtrack_backend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}