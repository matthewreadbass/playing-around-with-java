package todo;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TodoTest {
  @Test public void testNewTodo() {
    Todo testTodo = new Todo();
    assertEquals("Inititalises with an empty list of tasks", String.valueOf("Tasks:"), testTodo.getTasks);
  }
  @Test public void testAddTask() {
    Todo testTodo = new Todo();
    testTodo.addTask("- Do the washing up");
    assertEquals("Adds a task to the Todo list", String.valueOf("Tasks: - Do the washing up"), testTodo.getTasks);
  }
  @Test public void testGetTasks() {
    Todo testTodo = new Todo();
    testTodo.addTask("- Make dinner");
    assertEquals("Adds a task to the Todo list", String.valueOf("Tasks: - Do the washing up"), testTodo.getTasks);
  }
}