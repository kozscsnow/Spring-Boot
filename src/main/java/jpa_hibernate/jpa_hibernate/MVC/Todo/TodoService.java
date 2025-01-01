package jpa_hibernate.jpa_hibernate.MVC.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Khanh", "Todo 1", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "John", "Todo 2", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(3, "Avi", "Todo 3", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findMyUsername(String username) {
        return todos;
    }
}
