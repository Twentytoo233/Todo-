package com.zhangzhiyi.todo.repository;

import com.zhangzhiyi.todo.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {
}