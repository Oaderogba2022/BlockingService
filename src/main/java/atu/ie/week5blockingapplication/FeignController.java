package atu.ie.week5blockingapplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;


@RestController
public class FeignController {

    private final FeignService feignService;

    public FeignController(FeignService feignService){
        this.feignService = feignService;
    }


    @GetMapping("/todos")
    public List<TodoResponse> getAllTodos() {
        return feignService.fetchAllTodoes();
    }

    @GetMapping("/todos/{id}")
    public TodoResponse getTodoById(@PathVariable("id") int id) {
        return feignService.fetchTodoById(id);
    }

    @GetMapping("/todos/json/{id}")
    public TodoResponse getTodoJsonById(@PathVariable("id") int id) {
        return feignService.fetchTodoById(id);
    }


}
