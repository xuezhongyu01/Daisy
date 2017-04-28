package com.yourong.common.baidu.push.model;


import com.yourong.common.baidu.yun.annotation.JSonPath;

public class MsgStatUnit {

	@JSonPath(path="push")
	private int pushNum;
	
	@JSonPath(path="ack")
	private int ackNum;
	
	@JSonPath(path="del")
	private int delNum;
	
	@JSonPath(path="click")
	private int clickNum;
	
	public int getPushNum () {
		return pushNum;
	}
	public int getAckNum () {
		return ackNum;
	}
	public int getDelNum () {
		return delNum;
	}
	public int getClickNum () {
		return clickNum;
	}
}
