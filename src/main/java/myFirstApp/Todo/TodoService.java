package myFirstApp.Todo;

import java.time.LocalDate;
import java.util.List;

public class TodoService {
    private static List<Todo> todos;
    static {
        todos.add(new Todo(1, "Khanh", "Description", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "John", "Description", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(3, "Avi", "Description", LocalDate.now().plusYears(1), false));
    }

    public List<Todo> findMyUsername(String username) {
        return todos;
    }
}
