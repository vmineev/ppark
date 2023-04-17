package com.kanban.back.repository;

import com.kanban.back.entity.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTableRepository extends JpaRepository<UserTable, String> {
}
