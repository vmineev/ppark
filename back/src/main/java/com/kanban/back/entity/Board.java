package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="board")
@Getter
@Builder
@ToString
public class Board {
    private String b_name;
    private String b_goal;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer b_id;
    @Column(updatable = false)
    private LocalDateTime b_create_date;
    private LocalDateTime b_upd_date;
    private String b_creator;
    private String b_del_yn;
    private String b_admin;
//    mappedBy = "board", cascade = CascadeType.REMOVE
    @OneToMany(mappedBy = "board", cascade = CascadeType.REMOVE)
    private List<Task> tasks;
    @OneToMany(mappedBy = "board")
    private List<BoardGroup> boardGroups;
    @OneToMany(mappedBy = "board")
    private List<BoardUser> boardUsers;

    public BoardDTO toDTO(){
        return BoardDTO.builder()
                .b_name(b_name)
                .b_goal(b_goal)
                .b_id(b_id)
                .b_create_date(b_create_date)
                .b_upd_date(b_upd_date)
                .b_creator(b_creator)
                .b_del_yn(b_del_yn)
                .b_admin(b_admin)
                .tasks(tasks)
                .boardGroups(boardGroups)
                .boardUsers(boardUsers)
                .build();
    }
}
