package Tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import Classes.Task;

public class TaskTest {
    @Test
    public void testTaskCreation() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        assertEquals("1", task.getTaskId());
        assertEquals("TaskName", task.getName());
        assertEquals("TaskDescription", task.getDescription());
    }

    @Test
    public void testUpdateTaskName() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        task.setName("NewTaskName");
        assertEquals("NewTaskName", task.getName());
    }

    @Test
    public void testUpdateTaskDescription() {
        Task task = new Task("1", "TaskName", "TaskDescription");
        task.setDescription("NewTaskDescription");
        assertEquals("NewTaskDescription", task.getDescription());
    }
    
    @Test
	public void testTaskTooLong(){
		Assertions.assertThrows(IllegalArgumentException.class, ()->{
		Task task = new Task("12345678901", "TaskName", "TaskDescription");
		});
}
}