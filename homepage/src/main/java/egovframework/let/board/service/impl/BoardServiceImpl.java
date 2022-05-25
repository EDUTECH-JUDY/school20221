package egovframework.let.board.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.FileVO;
import egovframework.let.board.service.BoardService;
import egovframework.let.board.service.BoardVO;
import egovframework.let.utl.fcc.service.EgovDateUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {
	
	@Resource(name="boardMapper")
	private BoardMapper boardMapper;
	
	@Resource(name="egovBoardIdGnrService")
	private EgovIdGnrService idgenService;
	
	//게시물 목록 가져오기
	public List<EgovMap> selectBoardList(BoardVO vo) throws Exception {
		return boardMapper.selectBoardList(vo);
	}
		
	//게시물 목록 수
	public int selectBoardListCnt(BoardVO vo) throws Exception {
		return boardMapper.selectBoardListCnt(vo);
	}
	
	//게시물 등록
	@Override
	public String insertBoard(BoardVO vo) throws Exception {
		String id = idgenService.getNextStringId();
		vo.setBoardId(id);
		boardMapper.insertBoard(vo);
		
		return id;
	}
}
