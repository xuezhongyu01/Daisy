package com.yourong.core.tc.dao;

import org.apache.ibatis.annotations.Param;

import com.yourong.core.tc.model.MemberHistoryRepayment;

public interface MemberHistoryRepaymentMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tc_member_history_repayment
	 * @mbggenerated
	 */
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tc_member_history_repayment
	 * @mbggenerated
	 */
	int insert(MemberHistoryRepayment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tc_member_history_repayment
	 * @mbggenerated
	 */
	int insertSelective(MemberHistoryRepayment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tc_member_history_repayment
	 * @mbggenerated
	 */
	MemberHistoryRepayment selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tc_member_history_repayment
	 * @mbggenerated
	 */
	int updateByPrimaryKeySelective(MemberHistoryRepayment record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table tc_member_history_repayment
	 * @mbggenerated
	 */
	int updateByPrimaryKey(MemberHistoryRepayment record);
	
	int updateByTransactionId(@Param("status")int status,@Param("transactionId")Long transactionId);
}