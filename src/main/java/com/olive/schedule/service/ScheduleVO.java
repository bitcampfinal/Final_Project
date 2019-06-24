package com.olive.schedule.service;

import java.sql.Date;

public class ScheduleVO {
	private String board_index;
	private String schedule_id;
	private Date start_date;
	private Date end_date;
	
	public String getBoard_index() {
		return board_index;
	}
	public void setBoard_index(String board_index) {
		this.board_index = board_index;
	}
	public String getSchedule_id() {
		return schedule_id;
	}
	public void setSchedule_id(String schedule_id) {
		this.schedule_id = schedule_id;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	@Override
	public String toString() {
		return "Schedule [board_index=" + board_index + ", schedule_id=" + schedule_id + ", start_date=" + start_date
				+ ", end_date=" + end_date + "]";
	}
	
	
}
