package ru.geekbrains.executormicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.executormicroservice.entity.Executor;

@Repository
public interface ExecutorRepository extends JpaRepository<Executor, Long> {
}