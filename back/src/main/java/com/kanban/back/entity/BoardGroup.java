package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "board_group")
@Getter
@Builder
public class BoardGroup {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "b_id", referencedColumnName = "b_id")
    @ToString.Exclude
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id", referencedColumnName = "c_id")
    @ToString.Exclude
    private Card card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    @ToString.Exclude
    private UserTable userTable;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer g_id;

    public BoardGroupDTO toDTO(){
        return BoardGroupDTO.builder()
                .board(board)
                .card(card)
                .userTable(userTable)
                .g_id(g_id)
                .build();
    }
}