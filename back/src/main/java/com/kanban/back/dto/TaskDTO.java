package com.kanban.back.dto;

import com.kanban.back.entity.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private Integer t_id;
    private String t_name;
    private LocalDateTime t_create_date;
    private String t_type;
    private LocalDateTime t_upd_date;
    private String t_creator;
    private String t_upd_p;
    private String t_del_p;
    private String t_del_yn;
    private Integer t_position;
    private Board board;
    private List<Card> cards;

    public Task toEntity(){
        return Task.builder()
                .t_id(t_id)
                .t_name(t_name)
                .t_create_date(t_create_date)
                .t_type(t_type)
                .t_upd_date(t_upd_date)
                .t_creator(t_creator)
                .t_upd_p(t_upd_p)
                .t_del_p(t_del_p)
                .t_del_yn(t_del_yn)
                .t_position(t_position)
                .board(board)
                .cards(cards)
                .build();
    }




}
