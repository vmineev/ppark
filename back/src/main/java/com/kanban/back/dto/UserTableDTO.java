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
public class UserTableDTO {
    private LocalDateTime u_date_join;
    private String u_name;
    private String u_email;
    private String u_id;
    private List<BoardGroup> boardGroups;
    private List<Issue> issues;
    private List<TmpTable> tmpTables;
    private List<BoardUser> boardUsers;

    public UserTable toEntity(){
        return UserTable.builder()
                .u_date_join(u_date_join)
                .u_name(u_name)
                .u_email(u_email)
                .u_id(u_id)
                .boardGroups(boardGroups)
                .issues(issues)
                .tmpTables(tmpTables)
                .tmpTables(tmpTables)
                .boardUsers(boardUsers)
                .build();
    }
}
