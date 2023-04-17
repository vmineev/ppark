package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
@Table(name = "board_user")
public class BoardUser {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "b_id", referencedColumnName = "b_id")
    @ToString.Exclude
    private Board board;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "u_name", referencedColumnName = "u_name"),
            @JoinColumn(name = "u_email", referencedColumnName = "u_email"),
            @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    })
    @ToString.Exclude
    private UserTable userTable;

    public BoardUserDTO toDTO(){
        return BoardUserDTO.builder()
                .board(board)
                .userTable(userTable)
                .build();
    }


}
