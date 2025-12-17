package com.ruoyi.custUser.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 普通用户（存储前端C端用户信息）对象 t_user
 * 
 * @author linfuhui
 * @date 2025-12-17
 */
public class TCustUser extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 普通用户ID（前端用户主键） */
    @Excel(name = "普通用户ID", readConverterExp = "前=端用户主键")
    private Long userId;

    /** 用户手机号（登录账号，唯一） */
    @Excel(name = "用户手机号", readConverterExp = "登=录账号，唯一")
    private String phone;

    /** 加密密码（BCrypt/MD5） */
    private String password;

    /** 用户昵称 */
    @Excel(name = "用户昵称")
    private String nickName;

    /** 用户状态：1-正常，2-禁用 */
    @Excel(name = "用户状态：1-正常，2-禁用")
    private Integer status;

    /** 是否删除：0-未删除，1-已删除（软删除） */
    private Integer isDeleted;

    public void setUserId(Long userId) 
    {
        this.userId = userId;
    }

    public Long getUserId() 
    {
        return userId;
    }

    public void setPhone(String phone) 
    {
        this.phone = phone;
    }

    public String getPhone() 
    {
        return phone;
    }

    public void setPassword(String password) 
    {
        this.password = password;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setNickName(String nickName) 
    {
        this.nickName = nickName;
    }

    public String getNickName() 
    {
        return nickName;
    }

    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }

    public void setIsDeleted(Integer isDeleted) 
    {
        this.isDeleted = isDeleted;
    }

    public Integer getIsDeleted() 
    {
        return isDeleted;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("phone", getPhone())
            .append("password", getPassword())
            .append("nickName", getNickName())
            .append("status", getStatus())
            .append("isDeleted", getIsDeleted())
            .append("createTime", getCreateTime())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
