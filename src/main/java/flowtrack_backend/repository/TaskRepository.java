package flowtrack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import flowtrack_backend.model.Task;

import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByStatus(String status);
}