package com.olive.checklist.service;

public class CheckListVO {
	private String board_index;
	private String checkList_id;
	private String checkList_title;
	private String checkList_checked;
	private String checkList_content;
	
	public String getBoard_index() {
		return board_index;
	}
	public void setBoard_index(String board_index) {
		this.board_index = board_index;
	}
	public String getCheckList_id() {
		return checkList_id;
	}
	public void setCheckList_id(String checkList_id) {
		this.checkList_id = checkList_id;
	}
	public String getCheckList_title() {
		return checkList_title;
	}
	public void setCheckList_title(String checkList_title) {
		this.checkList_title = checkList_title;
	}
	public String getCheckList_checked() {
		return checkList_checked;
	}
	public void setCheckList_checked(String checkList_checked) {
		this.checkList_checked = checkList_checked;
	}
	public String getCheckList_content() {
		return checkList_content;
	}
	public void setCheckList_content(String checkList_content) {
		this.checkList_content = checkList_content;
	}
	
	@Override
	public String toString() {
		return "CheckListVO [board_index=" + board_index + ", checkList_id=" + checkList_id + ", checkList_title="
				+ checkList_title + ", checkList_checked=" + checkList_checked + ", checkList_content="
				+ checkList_content + "]";
	}
	
	
}
