package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "issue")
@Getter
@Builder
public class Issue {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id", referencedColumnName = "c_id")
    @ToString.Exclude
    private Card card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    @ToString.Exclude
    private UserTable userTable;

    private String del_yn;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer i_id;
    private LocalDateTime i_date;
    private String i_contents;

    public IssueDTO toDTO(){
        return IssueDTO.builder()
                .card(card)
                .userTable(userTable)
                .del_yn(del_yn)
                .i_id(i_id)
                .i_date(i_date)
                .i_contents(i_contents)
                .build();
    }

}
