package org.dromara.courses.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * @author M
 */
@Data
@TableName("t_vip_base_info")
public class VipBaseInfo {
    /**
     * VIP ID
     */
    @TableId
    private int id;

    /**
     * VIP名称
     */
    private String vipName;

    /**
     * VIP类型（0 月费、1 季度、2 年费、3 终生）
     */
    private String vipType;

    /**
     * VIP简述
     */
    private String vipTitle;

    /**
     * VIP内容
     */
    private String vipContext;

    /**
     * VIP价格
     */
    private BigDecimal vipPrice;

    /**
     * VIP权限信息
     */
    private String vipPrivilege;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 创建人ID
     */
    private int createId;

    /**
     * 创建人名称
     */
    private String createName;

}
