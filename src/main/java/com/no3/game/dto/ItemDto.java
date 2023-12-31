package com.no3.game.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

    private Long id;
    private Integer price;    // 가격

    private String title;     // 게임명
    private String genre;     // 장르
    private String developer; // 개발사
    private String detail;    // 내용

    private String sellStatCd;    // 상품 판매 상태

    private LocalDate relaseyear;     // 발매일

    private double avg; // 게임 평균 평점
    private int reviewCnt; // 리뷰 수

    private LocalDateTime regDate;;    // 등록일
    private LocalDateTime modDate;; // 수정일

    @Builder.Default
    private List<ItemImgDto> imgDTOList = new ArrayList<>();

}