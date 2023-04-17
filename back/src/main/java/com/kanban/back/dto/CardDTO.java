package com.kanban.back.dto;

import com.kanban.back.entity.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private String c_title;
    private Board board;
    private Integer c_position;
    private LocalDateTime c_create_date;
    private String c_creator;
    private Integer c_id;
    private Task task;
    private String c_upd_p;
    private String c_del_p;
    private LocalDateTime c_upd_date;
    private String c_description;
    private String c_del_yn;
    private List<BoardGroup> boardGroups;
    private List<Issue> issues;
    private List<Tag> tags;
    private List<TmpTable> tmpTables;
    public Card toEntity(){
        return Card.builder()
                .c_title(c_title)
                .board(board)
                .c_position(c_position)
                .c_create_date(c_create_date)
                .c_creator(c_creator)
                .c_id(c_id)
                .task(task)
                .c_upd_p(c_upd_p)
                .c_del_p(c_del_p)
                .c_upd_date(c_upd_date)
                .c_description(c_description)
                .c_del_yn(c_del_yn)
                .boardGroups(boardGroups)
                .issues(issues)
                .tags(tags)
                .tmpTables(tmpTables)
                .build();
    }
}
