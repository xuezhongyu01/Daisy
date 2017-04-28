package com.yourong.common.thirdparty.sinapay.pay.domain.respone;

/**
 * <p>支付(响应JSON结果进行转换)</p>
 * @author Wallis Wang
 * @version $Id: QueryPayTradeResponse.java, v 0.1 2014年6月4日 下午9:35:12 wangqiang Exp $
 */
public class QueryPayTradeResponse extends PayResponse {

    /**
     * 支付订单号
     */
    private String outPayNo;

    /**
     * 支付状态
     */
    private String payStatus;

    public String getOutPayNo() {
        return outPayNo;
    }

    public void setOutPayNo(String outPayNo) {
        this.outPayNo = outPayNo;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
}
