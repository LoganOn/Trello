package org.acme;

import model.Board;
import model.Task;
import repository.BoardRepository;
import repository.TaskRepository;
import resolver.TrelloService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("/hello")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Transactional
@ApplicationScoped
public class ExampleResource {

    @Inject
    BoardRepository boardRepository;

    @Inject
    TaskRepository taskRepository;

    @Inject
    TrelloService trelloService;

    @GET
    @Transactional
    public void getAll(){
        System.out.println(Arrays.toString(boardRepository.listAll().toArray()));;
        System.out.println(trelloService.getBoard(3).toString());
    }
}