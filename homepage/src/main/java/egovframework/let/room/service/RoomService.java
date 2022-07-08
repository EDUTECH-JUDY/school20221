package egovframework.let.room.service;

import java.util.List;
import java.util.Map;

import egovframework.rte.psl.dataaccess.util.EgovMap;

public interface RoomService {	
	
	//게시물 목록 가져오기
	public List<EgovMap> selectRoomList(RoomVO vo) throws Exception;	
	
//	//게시물 목록 수
	public int selectRoomListCnt(RoomVO vo) throws Exception;
//	
//	//게시물 등록하기
	public String insertRoom(RoomVO vo) throws Exception;
//	
//	//게시물 상세정보
	public RoomVO selectRoom(RoomVO vo) throws Exception;
//	
//	//게시물 수정하기
	public void updateRoom(RoomVO vo) throws Exception;
//	
//	//게시물 삭제하기
	public void deleteRoom(RoomVO vo) throws Exception;
}