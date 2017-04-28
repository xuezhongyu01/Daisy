package com.yourong.core.mc.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.yourong.core.mc.model.biz.ActivityForInviteFriendDetail;
import com.yourong.core.mc.model.biz.ActivityForInviteFriendList;
import org.apache.ibatis.annotations.Param;

import com.yourong.common.pageable.Page;
import com.yourong.core.ic.model.biz.LotteryRewardBiz;
import com.yourong.core.ic.model.biz.ProjectForLevel;
import com.yourong.core.ic.model.biz.ProjectForRewardMember;
import com.yourong.core.mc.model.ActivityLotteryResultNew;
import com.yourong.core.mc.model.biz.ActivityGrabResultBiz;
import com.yourong.core.mc.model.query.ActivityLotteryResultQuery;

@SuppressWarnings("rawtypes")
public interface ActivityLotteryResultNewMapper {

	int deleteByPrimaryKey(Long id);

	int insert(ActivityLotteryResultNew record);

	int insertSelective(ActivityLotteryResultNew record);

	ActivityLotteryResultNew selectByPrimaryKey(Long id);
	
	int insertSelectiveS(ActivityLotteryResultNew record);

	int updateByPrimaryKeySelective(ActivityLotteryResultNew record);

	int updateByPrimaryKey(ActivityLotteryResultNew record);

	Page findByPage(Page pageRequest, @Param("map") Map map);

	int batchDelete(@Param("ids") int[] ids);

	List selectForPagin(@Param("map") Map map);

	int selectForPaginTotalCount(@Param("map") Map map);

	/**
	 * 最新中奖结果
	 * 
	 * @param activityId
	 * @param rowNum
	 * @return
	 */
	List<ActivityLotteryResultNew> queryNewLotteryResult(@Param("activityId") Long activityId, @Param("remark") String remark,
			@Param("rowNum") int rowNum);

	/**
	 * 中奖结果自定义查询
	 * 
	 * @param model
	 * @return
	 */
	List<ActivityLotteryResultNew> getLotteryResultBySelective(ActivityLotteryResultNew model);

	/**
	 * 
	 * @Description:查询参与次数
	 * @param model
	 * @return
	 * @author: wangyanji
	 * @time:2016年1月5日 下午8:39:51
	 */
	int countNewLotteryResult(ActivityLotteryResultNew model);

	/**
	 * 最新中奖结果和项目名称
	 * 
	 * @param activityId
	 * @param rowNum
	 * @return
	 */
	List<ActivityLotteryResultNew> queryNewLotteryResultAndProject(@Param("activityId") Long activityId, @Param("remark") String remark,
			@Param("rowNum") int rowNum);

	/**
	 * 
	 * @Description:按奖励类型汇总结果
	 * @param model
	 * @return
	 * @author: wangyanji
	 * @time:2016年6月11日 下午12:32:35
	 */
	int sumRewrdsByMemberActivity(ActivityLotteryResultNew model);

	/**
	 * 
	 * @Description:根据奖励类型排行
	 * @param model
	 * @return
	 * @author: wangyanji
	 * @time:2016年6月11日 下午6:36:18
	 */
	List<ActivityLotteryResultNew> topByRewardType(ActivityLotteryResultNew model);

	/**
	 * 
	 * @Description:里程拉新好友助力榜
	 * @param activityId
	 * @param memberId
	 * @param startNo
	 * @return
	 * @author: wangyanji
	 * @time:2016年6月12日 下午4:05:04
	 */
	List<ActivityLotteryResultNew> inviteFriendList(@Param("activityId") Long activityId, @Param("memberId") Long memberId,
			@Param("startNo") int startNo, @Param("startTime") Date startTime, @Param("endTime") Date endTime);

	/**
	 * 
	 * @Description:里程拉新好友助力榜统计
	 * @param activityId
	 * @param memberId
	 * @param startNo
	 * @param startTime
	 * @param endTime
	 * @return
	 * @author: wangyanji
	 * @time:2016年6月14日 下午5:30:39
	 */
	Integer inviteFriendListTotal(@Param("activityId") Long activityId, @Param("memberId") Long memberId,
			@Param("startTime") Date startTime,
			@Param("endTime") Date endTime);
	
	/**
	 * 
	 * @Description:统计好友投资额
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年6月27日 下午6:10:24
	 */
	int sumRewrdsByMemberActivityRewardId(ActivityLotteryResultNew model);
	
	/***
	 * 
	 * @Description:统计活动之前的投资额
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年6月27日 下午6:10:54
	 */
	int countRewrdsByMemberActivityRewardId(ActivityLotteryResultNew model);
	/**
	 * 
	 * @Description:根据memberid activityId 获取活动结果信息
	 * @param activityId
	 * @param memberId
	 * @param remark
	 * @return
	 * @author: chaisen
	 * @time:2016年7月11日 下午3:55:45
	 */
	List<ActivityLotteryResultNew> getLotteryResultByMemberId(@Param("activityId") Long activityId, @Param("memberId") Long memberId,
			@Param("remark") String remark);
	/**
	 * 
	 * @Description:统计领取数量
	 * @param activityId
	 * @param memberId
	 * @param rewardResult
	 * @param remark
	 * @return
	 * @author: chaisen
	 * @time:2016年7月8日 上午11:39:04 
	 */
	int countLotteryResultByMemberIdAndRemark(ActivityLotteryResultNew model);
	/**
	 * 
	 * @Description:获取猜对的用户
	 * @param activityId
	 * @param remark
	 * @return
	 * @author: chaisen
	 * @time:2016年7月14日 下午3:33:59
	 */
	List<ActivityLotteryResultNew> getLotteryResultByRemark(@Param("activityId") Long activityId,@Param("remark") String remark);
	/**
	 * 
	 * @Description:批量更新实际结果
	 * @param activityId
	 * @return
	 * @author: chaisen
	 * @time:2016年7月14日 下午3:34:34
	 */
	int updateLotteryResultRewardResultByActivityId(@Param("activityId") Long activityId,@Param("remark") String remark,@Param("rewardResult") String rewardResult);
	/**
	 * 
	 * @Description:查询指定时间范围内的信息
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年7月14日 下午4:06:48
	 */
	List<ActivityLotteryResultNew> getLotteryResultByGuessTime(ActivityLotteryResultNew model);
	/**
	 * 
	 * @Description:获取用户猜的奇数还是偶数
	 * @param lotteryResult
	 * @return
	 * @author: chaisen
	 * @time:2016年7月20日 下午1:39:47
	 */
	ActivityLotteryResultNew getLotteryResultGuessMedalType(ActivityLotteryResultNew lotteryResult);
	/**
	 * 
	 * @Description:z中奖排序查询
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年7月20日 下午5:19:31
	 */
	List<ActivityLotteryResultNew> getLotteryResultBySelectiveOrderBy(ActivityLotteryResultNew model);
	
	/**
	 * 
	 * @Description:TODO
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年8月2日 下午4:37:37
	 */
	int updateBatchLotteryResultRewardResultByActivityId(ActivityLotteryResultNew model);
	
	
	int updateResultInfoByActivityId(@Param("activityId") Long activityId,@Param("remark") String remark,@Param("rewardResult") String rewardResult);

	int countLotteryResultByActivityIdAndRemark(@Param("activityId") Long activityId, @Param("memberId") Long memberId, @Param("remark") String remark);

	int countLotteryResultByActivityIdAndRewardId(@Param("activityId") Long activityId, @Param("memberId") Long memberId, @Param("rewardId") String rewardId);

	
	/**
	 * 
	 * @Description:获取押中的用户
	 * @param map
	 * @return
	 * @author: chaisen
	 * @time:2016年7月4日 上午11:47:58 
	 */
	List<ActivityLotteryResultNew> queryBetBingoMember(@Param("map") Map map);
	/**
	 * 
	 * @Description:统计上轮翻倍记录
	 * @param activityId
	 * @param memberId
	 * @return
	 * @author: chaisen
	 * @time:2016年7月4日 下午5:26:15
	 */
	Integer countLastBetTotal(@Param("activityId") Long activityId, @Param("remark") String remark);
	
	
	/**
	 * 
	 * @Description:根据 activityId 和 memberId 统计
	 * @param activityId 
	 * @param memberId
	 * @return
	 * @author: chaisen
	 * @time:2016年6月30日 下午3:03:04
	 */
	Integer countBetLotteryResult(@Param("activityId") Long activityId, @Param("memberId") Long memberId);
	
	/**
	 * 
	 * @Description:统计现金券领取情况
	 * @param activityId
	 * @param memberId
	 * @return
	 * @author: chaisen
	 * @time:2016年7月1日 下午5:37:12
	 */
	Integer countRemindBetLotteryResult(@Param("activityId") Long activityId, @Param("remark") String remark, @Param("rewardId") String rewardId, @Param("groupType") int groupType);

	/**
	 * 
	 * @Description:TODO
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年10月31日 下午2:26:26
	 */
	List<ActivityLotteryResultNew> getLotteryResultBySelectiveAndLotteryStatus(ActivityLotteryResultNew model);
	/**
	 * 
	 * @Description:TODO
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年10月31日 下午3:10:06
	 */
	List<ActivityLotteryResultNew> getActivityLotteryResultByProject(ActivityLotteryResultNew model);
	/**
	 * 
	 * @Description:获取中奖情况
	 * @param model
	 * @return
	 * @author: chaisen
	 * @time:2016年11月3日 下午9:02:56
	 */
	List<ProjectForRewardMember> findProjectRewardByProjectId(ActivityLotteryResultNew model);
	
	List<ProjectForLevel> getRewardLevelByProjectId(ActivityLotteryResultNew model);

	Integer countLotteryResultByProjectId(ActivityLotteryResultNew record);
	
	
	BigDecimal sumRewardInfoByProjectId(ActivityLotteryResultNew model);
	
	
	List<ActivityLotteryResultNew> sumRewardInfoByMemberId(ActivityLotteryResultNew lotteryResult);

	List<ProjectForLevel> getRewardInfoLevelByProjectId(ActivityLotteryResultNew record);

	int updateLotteryRewardResultByActivityId(ActivityLotteryResultNew model);
	
	/**
	 * 
	 * @Description:查询快投奖励最高的金额
	 * @param remark
	 * @return
	 * @author: wangyanji
	 * @time:2017年1月10日
	 */
	List<ActivityLotteryResultNew> getMaxRewardForQuickProject(@Param("remark") String remark);
	
	
	
	/**
	 * 
	 * 获取快投历史中奖名单
	 * @param projectId
	 * @return
	 * @author: wanglei
	 * @time:2017年1月11日
	 */
	List<LotteryRewardBiz> getLotteryReward(@Param("rowNum") int rowNum);

	/**
	 * 
	 * 获取指定快投中奖名单
	 * @param projectId
	 * @return
	 * @author: wanglei
	 * @time:2017年1月11日
	 */
	List<LotteryRewardBiz> getProjectLotteryReward(@Param("projectId") String projectId);

	/**
	 * 查询活动中奖纪录
	 * @param activityId
	 * @return
     */
	List<ActivityGrabResultBiz> queryActivityGrabResult(Long activityId);

	/**
	 * 查询活动用户是否已经中奖
	 * @param activityId
	 * @param memberId
     * @return
     */
	int queryLotteryResultByActivityAndMemberId(@Param("activityId") Long activityId,@Param("memberId") Long memberId);
	
	
	ActivityLotteryResultNew sumRewardInfoResultByProjectId(ActivityLotteryResultNew lotteryResult);

	/**
	 * 更改抽奖结果
	 */
	int updateLotteryResultStatus(ActivityLotteryResultNew record);
	/**
	 * 查询中奖结果
	 * @param activityId
	 * @param memberId
	 * @param remark
	 * @return
	 */
	ActivityLotteryResultNew queryLotteryResultByRemark(@Param("activityId") Long activityId, @Param("memberId") Long memberId,
			@Param("remark") String remark);

	/**
	 * @param activityLotteryResultQuery
	 * @return
	 */
	int activityLotteryResultForPaginTotalCount(@Param("activityLotteryResultQuery") ActivityLotteryResultQuery activityLotteryResultQuery);

	/**
	 * @param activityLotteryResultQuery
	 * @return
	 */
	List<ActivityLotteryResultNew> activityLotteryResultForPage(@Param("activityLotteryResultQuery") ActivityLotteryResultQuery activityLotteryResultQuery);

	
	int insertSelectiveNew(ActivityLotteryResultNew alr);

	int updateLotteryById(Long id);
	
	
	List<ActivityLotteryResultNew> sumInvestAmountByActivityId(ActivityLotteryResultNew lotteryResult);

	/**
	 * 查询邀请好友信息
	 * @param RewardId
	 * @param remark
	 * @param memberId
	 * @param activityId
     * @return
     */
	ActivityLotteryResultNew queryLotteryResultByInviteFriend(@Param("rewardId")String rewardId,@Param("remark")String remark,
																			  @Param("memberId")Long memberId,@Param("activityId")Long activityId);

	/**
	 * 更新RewardResult
	 * @param rewardResult
	 * @param id
     * @return
     */
	int updateRewardResultById(@Param("rewardResult")String rewardResult,@Param("id")Long id);

	/**
	 * 好友邀请诗句
	 * @return
     */
	List<ActivityForInviteFriendList> queryInviteFriendData();

	/**
	 * 查询用户好友邀请的数据
	 * @param memberId
	 * @return
     */
	ActivityForInviteFriendList queryInviteFriendDataByMemberId(@Param("memberId")Long memberId);

	/**
	 * 查询用户邀请好友投资额
	 * @param memberId
	 * @return
     */
	BigDecimal queryInviteFriendReward(@Param("memberId")Long memberId);

	/**
	 * 查询用户好友邀请详情
	 * @param memberId
	 * @return
     */
	List<ActivityForInviteFriendDetail> queryInviteFriendDetail(@Param("memberId") Long memberId,@Param("startRow")Integer startRow,
																@Param("pageSize")Integer pageSize);

	/**
	 * 查询用户好友邀请详情条数
	 * @param memberId
	 * @return
     */
	int queryInviteFriendDetailCount(@Param("memberId") Long memberId);
}