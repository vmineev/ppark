package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user_table")
@Builder
@Getter
public class UserTable {
    private LocalDateTime u_date_join;
    private String u_name;
    private String u_email;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String u_id;
    @OneToMany(mappedBy = "userTable")
    private List<BoardGroup> boardGroups;

    @OneToMany(mappedBy = "userTable")
    private List<Issue> issues;

    @OneToMany(mappedBy = "userTable")
    private List<TmpTable> tmpTables;

    @OneToMany(mappedBy = "userTable")
    private List<BoardUser> boardUsers;

    public UserTableDTO toDTO(){
        return UserTableDTO.builder()
                .u_date_join(u_date_join)
                .u_name(u_name)
                .u_email(u_email)
                .u_id(u_id)
                .boardGroups(boardGroups)
                .issues(issues)
                .tmpTables(tmpTables)
                .boardUsers(boardUsers)
                .build();
    }
}
