package com.kanban.back.repository;

import com.kanban.back.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue, Integer> {

}
