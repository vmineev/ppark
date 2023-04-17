package com.kanban.back.dto;

import com.kanban.back.entity.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BoardUserDTO {
    private Board board;
    private UserTable userTable;

    public BoardUser toEntity(){
        return BoardUser.builder()
                .board(board)
                .userTable(userTable)
                .build();
    }
}
