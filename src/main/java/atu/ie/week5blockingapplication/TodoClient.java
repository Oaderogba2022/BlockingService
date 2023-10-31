package atu.ie.week5blockingapplication;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "jsonplaceholder", url = "http://jsonplaceholder.typicode.com")
public interface TodoClient {
    @GetMapping("/todos/1")
    TodoResponse fetchData();
}
