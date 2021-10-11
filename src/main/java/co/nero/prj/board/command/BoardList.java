package co.nero.prj.board.command;

import java.util.ArrayList;
import java.util.List;

import co.nero.prj.board.service.BoardVO;

public class BoardList implements Command{		// 게시글 목록 보는 명령
	private List<BoardVO> list = new ArrayList<BoardVO>();
	
	@Override
	public void execute() {
		list = dao.boardSelectList();
		System.out.println("순번 : 작성자  : 작성일자  :        제목        : 조회수");
		for(BoardVO vo : list) {
			System.out.print(" "+vo.getBId()+" ");
			System.out.print("   "+vo.getBWriter());
			System.out.print("  "+vo.getBWritedate());
			System.out.print("    "+vo.getBTitle());
			System.out.println("    "+vo.getBHit());
		}
	}
	
}
