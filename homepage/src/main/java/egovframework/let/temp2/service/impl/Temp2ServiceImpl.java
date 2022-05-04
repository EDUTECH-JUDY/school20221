package egovframework.let.temp2.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import egovframework.com.cmm.service.EgovFileMngService;
import egovframework.com.cmm.service.FileVO;
import egovframework.let.cop.bbs.service.Board;
import egovframework.let.cop.bbs.service.BoardVO;
import egovframework.let.cop.bbs.service.EgovBBSManageService;
import egovframework.let.temp2.service.Temp2Service;
import egovframework.let.temp2.service.Temp2VO;
import egovframework.let.utl.fcc.service.EgovDateUtil;

import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;
import egovframework.rte.fdl.idgnr.EgovIdGnrService;
import egovframework.rte.fdl.property.EgovPropertyService;
import egovframework.rte.psl.dataaccess.util.EgovMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("temp2Service")
public class Temp2ServiceImpl extends EgovAbstractServiceImpl 
	implements Temp2Service {
	
	@Resource(name="temp2Mapper")
	private Temp2Mapper temp2Mapper;
	
	@Resource(name="egovTempIdGnrService")
	private EgovIdGnrService idgenService;
	
	@Override
	public Temp2VO selectTemp(Temp2VO vo) throws Exception {
		return temp2Mapper.selectTemp(vo);
	}  
	
	//임시데이터 목록 가져오기
	public List<EgovMap> selectTempList(Temp2VO vo) throws Exception {
		return temp2Mapper.selectTempList(vo);
	}
	
	//임시데이터 등록하기
	public String insertTemp(Temp2VO vo) throws Exception {
		String id = idgenService.getNextStringId();
		vo.setTempId(id);
		temp2Mapper.insertTemp(vo);
		
		return id;
	}
	
	//임시데이터 수정하기
	public void updateTemp(Temp2VO vo) throws Exception {
		temp2Mapper.updateTemp(vo);
	}
	
	//임시데이터 삭제하기
	public void deleteTemp(Temp2VO vo) throws Exception {
		temp2Mapper.deleteTemp(vo);
	}
	
	//임시데이터 목록 수
	public int selectTempListCnt(Temp2VO vo) throws Exception {
		return temp2Mapper.selectTempListCnt(vo);
	}
	
/*	@Override
	public TempVO selectTemp(TempVO vo) throws Exception {
		return tempDAO.selectTemp(vo);
	} 
*/
}
