package com.careeco.TaskManager.service;

import com.careeco.TaskManager.model.Task;
import com.careeco.TaskManager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class TaskService {

    @Autowired
    private TaskRepository repository;

    public Task addTask(Task task){
        task.setTaskId(UUID.randomUUID().toString().split("-")[0]);
       return  repository.save(task);
    }

    public List<Task> findAllTasks(){
        return repository.findAll();
    }

    public Task getTaskByTaskId(String taskId){
        return repository.findById(taskId).get();
    }

    public List<Task> getTaskBySeverity(Integer severity){
        return  repository.findBySeverity(severity);
    }

    public List<Task> findByAsignee(String asignee){
  return  repository.getTaskByAsignee(asignee);
    }

    public Task updateTask(Task taskRequest){
        //get the existing document from db
        //populate new vaue from request to existing object/entity/document
   Task existingTask=repository.findById(taskRequest.getTaskId()).get();
   existingTask.setDescription(taskRequest.getDescription());
   existingTask.setAsignee(taskRequest.getAsignee());
   existingTask.setSeverity(taskRequest.getSeverity());
   existingTask.setStoryPoint(taskRequest.getStoryPoint());
   return repository.save(existingTask);
    }

    public String deleteTask(String taskId){
        repository.deleteById(taskId);
        return "task deleted from dashboard";
    }
}
