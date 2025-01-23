package jpa_hibernate.jpa_hibernate.MVC.Todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todosCount = 0;
    static {
        todos.add(new Todo(todosCount++, "123", "Todo 1", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(todosCount++, "123", "Todo 2", LocalDate.now().plusYears(2), false));
        todos.add(new Todo(todosCount++, "123", "Todo 3", LocalDate.now().plusYears(3), false));
    }

    public List<Todo> findMyUsername(String username) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean done) {
        Todo todo = new Todo(todosCount++, username, description, targetDate, done);
        todos.add(todo);
    }

    public void deleteTodoById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);

    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteTodoById(todo.getId());
        todos.add(todo);
    }
}
