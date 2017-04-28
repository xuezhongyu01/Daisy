package com.yourong.common.baidu.push.model;



import com.yourong.common.baidu.yun.annotation.JSonPath;

import java.util.LinkedList;
import java.util.List;

public class QueryStatisticTopicResponse extends PushResponse{

	@JSonPath(path="response_params\\total_num")
	private int totalNum;
	
	@JSonPath(path="response_params\\result")
	private List<KeyValueForTopic> result = new LinkedList<KeyValueForTopic>();
	
	public int getTotalNum () {
		return totalNum;
	}
	public List<KeyValueForTopic> getResult () {
		return result;
	}
}
