package co.nero.prj.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import co.nero.prj.board.command.BoardDelete;
import co.nero.prj.board.command.BoardInsert;
import co.nero.prj.board.command.BoardList;
import co.nero.prj.board.command.BoardSelect;
import co.nero.prj.board.command.BoardUpdate;
import co.nero.prj.board.command.Command;

public class BoardMenu {
	private Scanner sc = new Scanner(System.in);
	private Map<String, Command> map = new HashMap<String, Command>();
	public BoardMenu() {
		// 여기에 command객체로 생성한 것을 추가한다.
		map.put("boardList", new BoardList());
		map.put("boardSelect", new BoardSelect());
		map.put("boardInsert", new BoardInsert());
		map.put("boardUpdate", new BoardUpdate());
		map.put("boardDelete", new BoardDelete());
	}
	
	private void boartTitle () {
		System.out.println("==================");
		System.out.println("==1. 공지사항 목록 ==");
		System.out.println("==2. 공지사항 조회 ==");
		System.out.println("==3. 공지사항 등록 ==");
		System.out.println("==4. 공지사항 수정 ==");
		System.out.println("==5. 공지사항 삭제 ==");
		System.out.println("==6.  그만하기  ====");
		System.out.println("==================");
		System.out.println("원하는 작업번호를 선택하세요.");
	}
	
	private void menu() {
		
		while(true) {
			boartTitle();
			int job =sc.nextInt();sc.nextLine();
			switch(job) {
			case 1 : 
				commandRun("boardList");
				break;
			case 2 :
				commandRun("boardSelect");
				break;
			case 3 :
				commandRun("boardInsert");
				break;
			case 4 :
				commandRun("boardUpdate");
				break;
			case 5 :
				commandRun("boardDelete");
				break;
			case 6 :
				System.out.println("Good Bye");
				sc.close();
				return;
			}
		} //while end
	}//menu end

	private void commandRun(String comm) {
		Command command = map.get(comm);
		command.execute();
	}
	
	public void run() {
		menu();
	}
	
	
}//class end
