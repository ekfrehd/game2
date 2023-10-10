package com.no3.game.entity;

import lombok.*;

import javax.persistence.*;

@Table(name="review")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = /*{"item",*/"writer"/*}*/)
public class Board extends BaseEntity {

    @Id
    @Column(name="review_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bno;

    private String title;

    @Column(name="text")
    private String content;

    private int grade;

//    @ManyToOne(fetch = FetchType.LAZY)
//    private Item item;

    @ManyToOne (fetch = FetchType.LAZY)
    private Member writer;

    public void changeTitle(String title){
        this.title = title;
    }

    public void changeGrade(int grade){
        this.grade = grade;
    }
    public void changeContent(String content){
        this.content = content;
    }
}

