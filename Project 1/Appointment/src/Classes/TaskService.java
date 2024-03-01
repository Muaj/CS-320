package Classes;

import java.util.HashMap;
import java.util.Map;

public class TaskService {
    private Map<String, Task> tasks;

    public TaskService() {
        this.tasks = new HashMap<>();
    }

    public void addTask(Task task) {
        tasks.put(task.getTaskId(), task);
    }

    public void deleteTask(String taskId) {
        tasks.remove(taskId);
    }

    public void updateTaskName(String taskId, String newName) {
        Task task = tasks.get(taskId);
        if (task != null) {
            task = new Task(task.getTaskId(), newName, task.getDescription());
            tasks.put(taskId, task);
        }
    }

    public void updateTaskDescription(String taskId, String newDescription) {
        Task task = tasks.get(taskId);
        if (task != null) {
            task = new Task(task.getTaskId(), task.getName(), newDescription);
            tasks.put(taskId, task);
        }
    }

    public Task getTask(String taskId) {
        return tasks.get(taskId);
    }
}