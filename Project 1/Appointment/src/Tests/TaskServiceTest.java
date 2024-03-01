package Tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import Classes.Task;
import Classes.TaskService;

public class TaskServiceTest {
    private TaskService taskService;

    @Before
    public void setUp() {
        taskService = new TaskService();
    }

    @Test
    public void testAddTask() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        taskService.addTask(task);
        assertEquals(task, taskService.getTask("1"));
    }

    @Test
    public void testDeleteTask() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        taskService.addTask(task);
        taskService.deleteTask("1");
        assertNull(taskService.getTask("1"));
    }

    @Test
    public void testUpdateTaskName() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        taskService.addTask(task);
        taskService.updateTaskName("1", "NewTaskName");
        assertEquals("NewTaskName", taskService.getTask("1").getName());
    }

    @Test
    public void testUpdateTaskDescription() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        taskService.addTask(task);
        taskService.updateTaskDescription("1", "NewTaskDescription");
        assertEquals("NewTaskDescription", taskService.getTask("1").getDescription());
    }
}
