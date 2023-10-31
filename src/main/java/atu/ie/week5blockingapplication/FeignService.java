package atu.ie.week5blockingapplication;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FeignService {
    private final TodoClient todoClient;

    public FeignService(TodoClient todoClient){
        this.todoClient = todoClient;
    }

    public TodoResponse fetchTodoById(int id){
        return todoClient.fetchTodoId(id);
    }

    public List <TodoResponse> fetchAllTodoes(){
        return todoClient.fetchTodoes();
    }


}
