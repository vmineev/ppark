package com.kanban.back.entity;

import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tag")
@Getter
@Builder
public class Tag {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "c_id", referencedColumnName = "c_id")
    @ToString.Exclude
    private Card card;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tag_id;
    private String tag_name;
    private Integer tag_color;

    public TagDTO toDTO(){
        return TagDTO.builder()
                .card(card)
                .tag_id(tag_id)
                .tag_name(tag_name)
                .tag_color(tag_color)
                .build();
    }
}
