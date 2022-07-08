package egovframework.let.room.service;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ToStringBuilder;

import egovframework.com.cmm.ComDefaultVO;

public class RoomVO extends ComDefaultVO implements Serializable {
	
	//방ID
	private String roomId;
	//등록자정보
	private String registerInfo;
	//검색주소
	private String address1;
	//상세주소
	private String address2;
	//계약형태
	private String deal;
	//보증금/전세금
	private int price;
	//월세
	private int monthPrice;
	//관리비
	private int cost;
	//관리비포함내역
	private String costInfo;
	//입주가능일
	private java.util.Date moveDate;
	//전체층
	private int wholeClass;
	//해당층
	private int myClass;
	//방거실형태
	private String form;
	//주차
	private int park;
	//옵션정보
	private String choiceOption;
	//첨부파일ID
	private String atchFileId;
	//게시물내용
	private String boardCn;
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRegisterInfo() {
		return registerInfo;
	}
	public void setRegisterInfo(String registerInfo) {
		this.registerInfo = registerInfo;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getDeal() {
		return deal;
	}
	public void setDeal(String deal) {
		this.deal = deal;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMonthPrice() {
		return monthPrice;
	}
	public void setMonthPrice(int monthPrice) {
		this.monthPrice = monthPrice;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getCostInfo() {
		return costInfo;
	}
	public void setCostInfo(String costInfo) {
		this.costInfo = costInfo;
	}
	public java.util.Date getMoveDate() {
		return moveDate;
	}
	public void setMoveDate(java.util.Date moveDate) {
		this.moveDate = moveDate;
	}
	public int getWholeClass() {
		return wholeClass;
	}
	public void setWholeClass(int wholeClass) {
		this.wholeClass = wholeClass;
	}
	public int getMyClass() {
		return myClass;
	}
	public void setMyClass(int myClass) {
		this.myClass = myClass;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public int getPark() {
		return park;
	}
	public void setPark(int park) {
		this.park = park;
	}
	public String getChoiceOption() {
		return choiceOption;
	}
	public void setChoiceOption(String choiceOption) {
		this.choiceOption = choiceOption;
	}
	public String getAtchFileId() {
		return atchFileId;
	}
	public void setAtchFileId(String atchFileId) {
		this.atchFileId = atchFileId;
	}
	public String getBoardCn() {
		return boardCn;
	}
	public void setBoardCn(String boardCn) {
		this.boardCn = boardCn;
	}	
	
}
