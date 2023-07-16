package org.dromara.courses.domain.vo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author M
 */
@Data
public class MemberUserVo {

    /**
     * 用户ID
     */
    private int id;

    /**
     * 用户ID
     */
    private int userId;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 失效时间
     */
    private LocalDateTime expireTime;

    /**
     * 会员类型
     */
    private String type;

    /**
     * 购买价格
     */
    private BigDecimal price;

    /**
     * 是否有全站下载权限（0是，1不是）
     */
    private boolean downloadPrivilege;

    /**
     * 有效期
     */
    private String validityPeriod;

    /**
     * 享有的视频格式
     */
    private String videoFormat;

    /**
     * 是否赠送网盘会员（0是，1不是）
     */
    private boolean cloudDiskPrivilege;

}
