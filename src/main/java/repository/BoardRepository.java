package repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import model.Board;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;

@ApplicationScoped
@Transactional
public class BoardRepository implements PanacheRepository<Board> {


}
