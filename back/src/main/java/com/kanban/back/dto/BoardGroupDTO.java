package com.kanban.back.dto;

import com.kanban.back.entity.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardGroupDTO {
    private Board board;
    private Card card;
    private UserTable userTable;
    private Integer g_id;

    public BoardGroup toEntity(){
        return BoardGroup.builder()
                .board(board)
                .card(card)
                .userTable(userTable)
                .g_id(g_id)
                .build();
    }

}
