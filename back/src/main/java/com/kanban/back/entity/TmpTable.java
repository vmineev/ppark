package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tmp_table")
@Getter
@Builder
public class TmpTable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id", referencedColumnName = "c_id")
    @ToString.Exclude
    private Card card;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "u_id", referencedColumnName = "u_id")
    @ToString.Exclude
    private UserTable userTable;

    private String commit_status;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tmp_id;

    public TmpTableDTO toDTO(){
        return TmpTableDTO.builder()
                .card(card)
                .userTable(userTable)
                .commit_status(commit_status)
                .tmp_id(tmp_id)
                .build();
    }
}
