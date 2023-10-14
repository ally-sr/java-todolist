package dev.allysr.todolist.task;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepository extends JpaRepository<TaskModel, UUID> {

    public TaskModel findByTitle(String title);

    public TaskModel findByStartAt(LocalDateTime startAt);

    public TaskModel findByEndAt(LocalDateTime endAt);

    public TaskModel findByPriority(String priority);

    public TaskModel findByCreatedAt(LocalDateTime createdAt);

    public TaskModel findByIdUser(UUID IdUser);

}
