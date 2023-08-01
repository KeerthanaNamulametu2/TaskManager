package com.careeco.TaskManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "tasks")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
@Id
    private String taskId;

    private String description;

    private  int severity;

    private String asignee;

    private int storyPoint;

//    public String getAsignee() {
//        return asignee;
//    }
//
//    public void setAsignee(String asignee) {
//        this.asignee = asignee;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public int getSeverity() {
//        return severity;
//    }
//
//    public void setSeverity(int severity) {
//        this.severity = severity;
//    }
//
//    public int getStoryPoint() {
//        return storyPoint;
//    }
//
//    public void setStoryPoint(int storyPoint) {
//        this.storyPoint = storyPoint;
//    }
//
//    public String getTasakId() {
//        return tasakId;
//    }
//
//    public void setTasakId(String tasakId) {
//        this.tasakId = tasakId;
//    }
}
