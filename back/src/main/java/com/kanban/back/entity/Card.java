package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "card")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Card {
    private String c_title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "b_id", referencedColumnName = "b_id")
//            @JoinColumn(name = "b_admin", referencedColumnName = "b_admin")
    })
    @ToString.Exclude
    private Board board;

    private Integer c_position;
    @Column(updatable = false)
    private LocalDateTime c_create_date;
    private String c_creator;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer c_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "t_id", referencedColumnName = "t_id")
    @ToString.Exclude
    private Task task;

    private String c_upd_p;
    private String c_del_p;
    private LocalDateTime c_upd_date;
    private String c_description;
    private String c_del_yn;

    @OneToMany(mappedBy = "card")
    private List<BoardGroup> boardGroups;
    @OneToMany(mappedBy = "card")
    private List<Issue> issues;
    @OneToMany(mappedBy = "card")
    private List<Tag> tags;
    @OneToMany(mappedBy = "card")
    private List<TmpTable> tmpTables;

    public CardDTO toDTO(){
        return CardDTO.builder()
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
