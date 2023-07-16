package org.dromara.courses.domain.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author M
 */
@Data
public class VipBaseInfoVo {

    /**
     * VIP ID
     */
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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
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
