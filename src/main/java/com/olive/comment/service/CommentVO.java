package com.olive.comment.service;

public class CommentVO {
	private String board_index;
	private String writer;
	private String comment_id;
	private String comment_content;
	
	public String getBoard_index() {
		return board_index;
	}
	public void setBoard_index(String board_index) {
		this.board_index = board_index;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getComment_id() {
		return comment_id;
	}
	public void setComment_id(String comment_id) {
		this.comment_id = comment_id;
	}
	public String getComment_content() {
		return comment_content;
	}
	public void setComment_content(String comment_content) {
		this.comment_content = comment_content;
	}
	
	@Override
	public String toString() {
		return "CommentVO [board_index=" + board_index + ", writer=" + writer + ", comment_id=" + comment_id
				+ ", comment_content=" + comment_content + "]";
	}
	
	
}
