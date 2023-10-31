package atu.ie.week5blockingapplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "jsonplaceholder", url = "http://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping("/todos/1")
    List<TodoResponse> fetchTodoes();

    @GetMapping("/todos/{id}")
    TodoResponse fetchTodoId(@PathVariable("id")int id);
}
