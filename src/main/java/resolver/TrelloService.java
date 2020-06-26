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
  private BoardRepository boardRepository;

  @Inject
  private TaskRepository taskRepository;

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
    boardRepository.persist(board);
  }

  public void deleteBoardById(int id){
    boardRepository.delete(boardRepository.findById(Long.valueOf(id)));
  }

  // dont work
  public void addTask(Task task){
    taskRepository.persist(task);
  }

  public void deleteTaskById(int id){
    taskRepository.delete(taskRepository.findById(Long.valueOf(id)));
  }

  public void updateTaskBoard(int taskId, int boardId){
    Task task = taskRepository.findById(Long.valueOf(taskId));
    task.setBoard(boardRepository.findById(Long.valueOf(boardId)));
    taskRepository.persist(task);
  }

  public void updateBoardPosition(int boardId, int position){
    Board board = boardRepository.findById(Long.valueOf(boardId));
    board.setPosition(position);
    boardRepository.persist(board);
  }

  public void updateBoardTitle(int boardId, String title){
    Board board = boardRepository.findById(Long.valueOf(boardId));
    board.setTitle(title);
    boardRepository.persist(board);
  }

  public void updateTaskTitle(int taskId, String title){
    Task task = taskRepository.findById(Long.valueOf(taskId));
    task.setTitle(title);
    taskRepository.persist(task);
  }

  public void updateTaskDescription(int taskId, String description){
    Task task = taskRepository.findById(Long.valueOf(taskId));
    task.setDescription(description);
    taskRepository.persist(task);
  }
}
