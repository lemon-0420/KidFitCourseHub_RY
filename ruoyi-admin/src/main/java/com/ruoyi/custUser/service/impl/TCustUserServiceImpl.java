package com.ruoyi.custUser.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.custUser.mapper.TCustUserMapper;
import com.ruoyi.custUser.domain.TCustUser;
import com.ruoyi.custUser.service.ITCustUserService;

/**
 * 普通用户（存储前端C端用户信息）Service业务层处理
 * 
 * @author linfuhui
 * @date 2025-12-17
 */
@Service
public class TCustUserServiceImpl implements ITCustUserService 
{
    @Autowired
    private TCustUserMapper tCustUserMapper;

    /**
     * 查询普通用户（存储前端C端用户信息）
     * 
     * @param userId 普通用户（存储前端C端用户信息）主键
     * @return 普通用户（存储前端C端用户信息）
     */
    @Override
    public TCustUser selectTCustUserByUserId(Long userId)
    {
        return tCustUserMapper.selectTCustUserByUserId(userId);
    }

    /**
     * 查询普通用户（存储前端C端用户信息）列表
     * 
     * @param tCustUser 普通用户（存储前端C端用户信息）
     * @return 普通用户（存储前端C端用户信息）
     */
    @Override
    public List<TCustUser> selectTCustUserList(TCustUser tCustUser)
    {
        return tCustUserMapper.selectTCustUserList(tCustUser);
    }

    /**
     * 新增普通用户（存储前端C端用户信息）
     * 
     * @param tCustUser 普通用户（存储前端C端用户信息）
     * @return 结果
     */
    @Override
    public int insertTCustUser(TCustUser tCustUser)
    {
        tCustUser.setCreateTime(DateUtils.getNowDate());
        return tCustUserMapper.insertTCustUser(tCustUser);
    }

    /**
     * 修改普通用户（存储前端C端用户信息）
     * 
     * @param tCustUser 普通用户（存储前端C端用户信息）
     * @return 结果
     */
    @Override
    public int updateTCustUser(TCustUser tCustUser)
    {
        tCustUser.setUpdateTime(DateUtils.getNowDate());
        return tCustUserMapper.updateTCustUser(tCustUser);
    }

    /**
     * 批量删除普通用户（存储前端C端用户信息）
     * 
     * @param userIds 需要删除的普通用户（存储前端C端用户信息）主键
     * @return 结果
     */
    @Override
    public int deleteTCustUserByUserIds(Long[] userIds)
    {
        return tCustUserMapper.deleteTCustUserByUserIds(userIds);
    }

    /**
     * 删除普通用户（存储前端C端用户信息）信息
     * 
     * @param userId 普通用户（存储前端C端用户信息）主键
     * @return 结果
     */
    @Override
    public int deleteTCustUserByUserId(Long userId)
    {
        return tCustUserMapper.deleteTCustUserByUserId(userId);
    }
}
