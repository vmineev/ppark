package com.kanban.back.repository;

import com.kanban.back.entity.BoardGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardGroupRepository extends JpaRepository<BoardGroup, Integer> {
}
