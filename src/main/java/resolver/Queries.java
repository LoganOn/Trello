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

}