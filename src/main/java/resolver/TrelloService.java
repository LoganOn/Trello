package resolver;

import lombok.Getter;
import model.Board;
import model.Task;
import repository.BoardRepository;
import repository.TaskRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
@Transactional
public class TrelloService {

  private List<Board> boardList = new ArrayList<>();

  private List<Task> taskList = new ArrayList<>();

  @Inject
  public TrelloService(BoardRepository boardRepository, TaskRepository taskRepository){
    boardList = boardRepository.listAll();
    taskList = taskRepository.listAll();
  }

  public List<Board> getAllBoards(){
    return boardList;
  }

  public List<Task> getAllTasks(){
    return taskList;
  }

  public Task getTask(int id){
    return taskList.get(id);
  }

  public Board getBoard(int id)
  {
    return boardList.get(id);
  }

  public void addBoard(Board board){
    boardList.add(board);
  }

  public void deleteBoard(int id){
    boardList.remove(id);
  }

  public void addTask(Task task){
    taskList.add(task);
  }

  public void deleteTask(int id){
    taskList.remove(id);
  }
}
