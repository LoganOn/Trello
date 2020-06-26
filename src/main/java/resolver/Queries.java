package resolver;

import model.Board;
import model.Task;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Source;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

@GraphQLApi
public class Queries {

  @Inject
  TrelloService trelloService;

  @Query("findAllTasks")
  public List<Task> getAllTasks(){
    return trelloService.getAllTasks();
  }

  @Query("findAllBoards")
  public List<Board> getAllBoards(){
    return trelloService.getAllBoards();
  }

  @Query("findTaskById")
  public Task getTask(int id){
    return trelloService.getTask(id);
  }

  @Query("findBoardById")
  public Board getBoard(int id){
    return trelloService.getBoard(id);
  }

  @Transactional
  @Mutation("addBoard")
  public Board addBoard(Board board){
    trelloService.addBoard(board);
    return board;
  }

  @Transactional
  @Mutation("updateTaskBoard")
  public Task updateTaskBoard(int taskId, int boardId){
    trelloService.updateTaskBoard(taskId, boardId);
    return null;
  }

  @Transactional
  @Mutation("deleteBoardById")
  public Board deleteBoardById(int boardId){
    trelloService.deleteBoardById(boardId);
    return null;
  }

  @Transactional
  @Mutation("updateBoardPosition")
  public Board updateBoardPosition(int boardId, int position){
    trelloService.updateBoardPosition(boardId, position);
    return null;
  }

  @Transactional
  @Mutation("updateBoardTitle")
  public Board updateBoardTitle(int boardId, String title){
    trelloService.updateBoardTitle(boardId, title);
    return null;
  }

  @Transactional
  @Mutation("addTask")
  public Task addTask(Task task){
    trelloService.addTask(task);
    return task;
  }

  @Transactional
  @Mutation("deleteTaskById")
  public Task deleteTaskById(int taskId){
    trelloService.deleteTaskById(taskId);
    return null;
  }

  @Transactional
  @Mutation("updateTaskTitle")
  public Task updateTaskTitle(int taskId, String title){
    trelloService.updateTaskTitle(taskId, title);
    return null;
  }

  @Transactional
  @Mutation("updateTaskDescription")
  public Task updateTaskDescription(int taskId, String description){
    trelloService.updateTaskDescription(taskId, description);
    return null;
  }

}