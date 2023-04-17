package com.kanban.back.dto;

import com.kanban.back.entity.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardDTO {
    private String b_name;
    private String b_goal;
    private Integer b_id;
    private LocalDateTime b_create_date;
    private LocalDateTime b_upd_date;
    private String b_creator;
    private String b_del_yn;
    private String b_admin;
    private List<Task> tasks;
    private List<BoardGroup> boardGroups;
    private List<BoardUser> boardUsers;

    public Board toEntity(){
        return Board.builder()
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
