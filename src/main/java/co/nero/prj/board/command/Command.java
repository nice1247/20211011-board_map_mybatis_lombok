package co.nero.prj.board.command;

import co.nero.prj.board.service.BoardService;
import co.nero.prj.board.serviceImpl.BoardServiceImpl;
import co.nero.prj.mybatis.BoardMybatisService;

public interface Command {
//	public BoardService dao = new BoardServiceImpl();
//	public void execute();
	
	public BoardService dao = new BoardMybatisService();
	public void execute();

}
