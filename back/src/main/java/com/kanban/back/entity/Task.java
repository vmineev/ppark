package com.kanban.back.entity;
import com.kanban.back.dto.*;
import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="task")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer t_id;
    private String t_name;
    @Column(updatable = false)
    private LocalDateTime t_create_date;
    private String t_type;
    private LocalDateTime t_upd_date;
    private String t_creator;
    private String t_upd_p;
    private String t_del_p;
    private String t_del_yn;
    private Integer t_position;
//    @Column(insertable=false, updatable = false)
//    private String b_admin;
//    @Column(insertable=false, updatable = false)
//    private String b_id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
            @JoinColumn(name = "b_admin", referencedColumnName = "b_admin"),
            @JoinColumn(name = "b_id", referencedColumnName = "b_id")
    })
    @ToString.Exclude
    private Board board;

    @OneToMany(mappedBy = "task")
    private List<Card> cards;

    public TaskDTO toDTO(){
        return TaskDTO.builder()
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
