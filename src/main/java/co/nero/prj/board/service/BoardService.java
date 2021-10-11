package co.nero.prj.board.service;

import java.util.List;

public interface BoardService {
	List<BoardVO> boardSelectList(); // 전체목록가져오기
	BoardVO boardSelect(BoardVO board); // 한개 글 조회
	int boardInsert(BoardVO board); // 게시글 등록
	int boardUpdate(BoardVO board); // 게시글 수정
	int boardDelete(BoardVO board); // 게시글 삭제
	

}
