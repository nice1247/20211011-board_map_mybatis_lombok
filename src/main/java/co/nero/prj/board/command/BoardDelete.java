package co.nero.prj.board.command;

import java.util.Scanner;

import co.nero.prj.board.service.BoardVO;

public class BoardDelete implements Command { // 게시글 삭제
	private Scanner scb = new Scanner(System.in);
	@Override
	public void execute() {
		BoardVO vo = new BoardVO();
		System.out.println("===================");
		System.out.println("변경할 게시글의 번호를 입력하세요.");
		vo.setBId(scb.nextInt());
		int n = dao.boardDelete(vo);
		if(n != 0) {
			System.out.println("정상적으로 삭제되었습니다.");
		}else {
			System.out.println("게시글이 삭제되지 않았습니다.");
		}
	
	}

}
