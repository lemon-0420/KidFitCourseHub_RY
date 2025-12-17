package com.ruoyi.custUser.service;

import java.util.List;
import com.ruoyi.custUser.domain.TCustUser;

/**
 * 普通用户（存储前端C端用户信息）Service接口
 * 
 * @author linfuhui
 * @date 2025-12-17
 */
public interface ITCustUserService 
{
    /**
     * 查询普通用户（存储前端C端用户信息）
     * 
     * @param userId 普通用户（存储前端C端用户信息）主键
     * @return 普通用户（存储前端C端用户信息）
     */
    public TCustUser selectTCustUserByUserId(Long userId);

    /**
     * 查询普通用户（存储前端C端用户信息）列表
     * 
     * @param tCustUser 普通用户（存储前端C端用户信息）
     * @return 普通用户（存储前端C端用户信息）集合
     */
    public List<TCustUser> selectTCustUserList(TCustUser tCustUser);

    /**
     * 新增普通用户（存储前端C端用户信息）
     * 
     * @param tCustUser 普通用户（存储前端C端用户信息）
     * @return 结果
     */
    public int insertTCustUser(TCustUser tCustUser);

    /**
     * 修改普通用户（存储前端C端用户信息）
     * 
     * @param tCustUser 普通用户（存储前端C端用户信息）
     * @return 结果
     */
    public int updateTCustUser(TCustUser tCustUser);

    /**
     * 批量删除普通用户（存储前端C端用户信息）
     * 
     * @param userIds 需要删除的普通用户（存储前端C端用户信息）主键集合
     * @return 结果
     */
    public int deleteTCustUserByUserIds(Long[] userIds);

    /**
     * 删除普通用户（存储前端C端用户信息）信息
     * 
     * @param userId 普通用户（存储前端C端用户信息）主键
     * @return 结果
     */
    public int deleteTCustUserByUserId(Long userId);
}
