package com.kanban.back.dto;

import com.kanban.back.entity.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class IssueDTO {
    private Card card;
    private UserTable userTable;
    private String del_yn;
    private Integer i_id;
    private LocalDateTime i_date;
    private String i_contents;

    public Issue toEntity(){
        return Issue.builder()
                .card(card)
                .userTable(userTable)
                .del_yn(del_yn)
                .i_id(i_id)
                .i_date(i_date)
                .i_contents(i_contents)
                .build();
    }

}
