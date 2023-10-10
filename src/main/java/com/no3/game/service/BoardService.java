package com.no3.game.service;


import com.no3.game.dto.BoardDTO;
import com.no3.game.dto.PageRequestDTO;
import com.no3.game.dto.PageResultDTO;
import com.no3.game.entity.Board;
import com.no3.game.entity.Item;
import com.no3.game.entity.Member;

public interface BoardService {

    Long register(BoardDTO dto);

    PageResultDTO<BoardDTO, Object[]> getList(PageRequestDTO pageRequestDTO);

    BoardDTO get(Long bno);

    void removeWithReplies(Long bno);

    void modify(BoardDTO boardDTO);

    default Board dtoToEntity(BoardDTO dto){

        Member member = Member.builder().email(dto.getWriterEmail()).build();
        Item item = Item.builder().title(dto.getTitle()).build();
        Board board = Board.builder()
                .bno(dto.getBno())
                .item(item)
                .content(dto.getContent())
                .writer(member)
                .grade(dto.getGrade())
                .build();
        return board;
    }

    default BoardDTO entityToDTO(Board board, Member member, Item item) {

        BoardDTO boardDTO = BoardDTO.builder()
                .bno(board.getBno())
                .title(item.getTitle())
                .content(board.getContent())
                .grade(board.getGrade())
                .regDate(board.getRegDate())
                .modDate(board.getModDate())
                .writerEmail(member.getEmail())
                .writerName(member.getName())
                .build();

        return boardDTO;

    }
}
