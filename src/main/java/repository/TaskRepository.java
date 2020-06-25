package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import model.Task;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class TaskRepository implements PanacheRepository<Task> {
}
