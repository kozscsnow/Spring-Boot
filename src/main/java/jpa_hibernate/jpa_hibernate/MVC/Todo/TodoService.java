package jpa_hibernate.jpa_hibernate.MVC.Todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1, "Khanh", "Description", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "John", "Description", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "Avi", "Description", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findMyUsername(String username) {
        return todos;
    }
}
