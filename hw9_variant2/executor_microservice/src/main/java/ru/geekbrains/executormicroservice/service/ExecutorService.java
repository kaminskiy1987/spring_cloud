package ru.geekbrains.executormicroservice.service;

import org.springframework.stereotype.Service;
import ru.geekbrains.executormicroservice.dto.ExecutorDTO;
import ru.geekbrains.executormicroservice.entity.Executor;
import ru.geekbrains.executormicroservice.repository.ExecutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ExecutorService {
    private final ExecutorRepository executorRepository;

    public ExecutorService(ExecutorRepository executorRepository) {
        this.executorRepository = executorRepository;
    }

    public Executor add(ExecutorDTO dto) {
        return executorRepository.save(new Executor(dto.getFirstName(), dto.getLastName()));
    }

    public List<Executor> findAll() {
        return executorRepository.findAll();
    }

    public Optional<Executor> findById(long id) {
        return executorRepository.findById(id);
    }

    public Optional<Executor> deleteById(long id) {
        Optional<Executor> executor = executorRepository.findById(id);
        if (executor.isPresent()) {
            executorRepository.deleteById(id);
        }
        return executor;
    }
}