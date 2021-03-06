package com.yourong.web.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import com.yourong.common.domain.ResultDO;
import com.yourong.core.fin.model.RechargeLog;
import com.yourong.core.fin.model.WithdrawLog;
import com.yourong.web.dto.RechargeLogDto;
import com.yourong.web.dto.WithdrawLogDto;

/**
 * 充值记录,提现记录接口
 *
 * @author Administrator
 */
public interface RechargeLogWithdrawLogService { 
    /**
     * 插入充值记录
     *
     * @param record
     * @return
     */
    int insertSelective(RechargeLog record);

    /**
     * 充值记录分页
     *
     * @param pageRequest
     * @param map
     * @return
     */
    //Page<RechargeLog> findByPageRechargeLog(Page<RechargeLog> pageRequest, Map<String, Object> map);
    
    
    /**
     * 统计总数 分页用  充值记录
     * @param map
     * @return
     */
    int selectRechargeLogForPaginTotalCountWeb(Map<String, Object> map);
    /**
     *  分页查询 充值记录
     * @param map
     * @return
     */
    List<RechargeLogDto> selectRechargeLogForPaginWeb(Map<String, Object> map);    
    /**
     * 分页查询，提现
     * @param map
     * @return
     * pengyong
     */
	public List<WithdrawLogDto> selectWithdrawLogForPaginWeb(Map<String, Object> map);
	
	 /**
     * 分页查询，统计提现记录数
     * @param map
     * @return
     * author: pengyong
     * 下午1:15:42
     */
	int selectWithdrawLogForPaginTotalCountWeb(Map<String, Object> map);
		
	/**
     *  分页查询 提现记录s
     * @param map
     * @return
     */
	//public int selectWithdrawLogForPaginTotalCount(Map<String, Object> map);
		
    int updateStateByOutTradeNo(BigDecimal amount, int status,String rechargeNo, String outTradeNo);

    /**
     * 插入提现记录
     *
     * @param record
     * @return
     */
    int reqSubmitWithDraw(WithdrawLog record);

    /**
     * 修改提现记录状态
     *
     * @param withdrawNo
     * @param status
     * @return
     */
    int updateBywithdrawNo(String withdrawNo, int status);

    /**
     * 分页查询 提现记录
     *
     * @param pageRequest
     * @param map
     * @return
     */
   // Page<WithdrawLog> findByPageWithdrawLog(Page<WithdrawLog> pageRequest, Map<String, Object> map);

    /**
     * 通过充值流水号查询充值流水记录
     *
     * @param tradeNo
     * @return
     */
    public RechargeLog getRechargeLogByTradeNo(String tradeNo);
    

    /**
     * 充值成功
     * 
     * @param rechargeNo
     * @param outTradeNo
     * @param memo
     * @param memberBankCardId
     * @param bankCode
     * @param payMethod
     * @return
     */
    public boolean rechargeSuccess(String rechargeNo, String outTradeNo, String memo, 
    		Long memberBankCardId, String bankCode, Integer payMethod);
    
    /**
     * 充值失败
     * 
     * @param rechargeNo
     * @param outTradeNo
     * @param memo
     * @param memberBankCardId
     * @param bankCode
     * @param payMethod
     * @return
     */
    public boolean rechargeFailed(String rechargeNo, String outTradeNo, String memo, 
    		Long memberBankCardId, String bankCode, Integer payMethod);

    /**
     * 通过提现流水号查询提现记录
     *
     * @param tradeNo
     * @return
     */
    public WithdrawLog getWithdrawLogByTradeNo(String tradeNo);
    
    
    /**
     * 通过外部提现流水号查询提现记录
     *
     * @param tradeNo
     * @return
     */
    public WithdrawLog getWithdrawLogByOutTradeNo(String tradeNo);

    /**
     * 提现处理中
     *
     * @param outTradeNo
     * @param memo
     * @param bankCardId
     * @return
     */
    public boolean withdrawProcess(String outTradeNo, String memo, Long bankCardId);

    /**
     * 提现成功
     *
     * @param outTradeNo
     * @param memo
     * @param bankCardId
     * @return
     */
    public boolean withdrawSuccess(String outTradeNo, String memo, Long bankCardId);

    /**
     * 提现失败
     *
     * @param outTradeNo
     * @param memo
     * @param bankCardId
     * @return
     */
    public boolean withdrawFailed(String outTradeNo, String memo, Long bankCardId);
    
    
    /**
     * 统计提现成功次数    
     * @param memberId
     * @return
     */
    public int  countWithDraw(long memberId);
    
    /**
     * 统计提现成功的金额
     * @param memberId
     * @return
     */
    public BigDecimal  totalWithDraw(long memberId);
    
    
    /**
     * 统计充值成功次数    
     * @param memberId
     * @return
     */
    public int  countRecharge(long memberId);
    
    /**
     * 统计充值成功的金额
     * @param memberId
     * @return
     */
    public BigDecimal  totalRecharge(long memberId);
   
    
    
    public ResultDO<WithdrawLog> cancelToWithDrawLog(Long id, int status);


}
