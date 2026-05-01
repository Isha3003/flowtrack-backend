package flowtrack_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import flowtrack_backend.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}