package com.ruoyi.custUser.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.custUser.domain.TCustUser;
import com.ruoyi.custUser.service.ITCustUserService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 普通用户（存储前端C端用户信息）Controller
 * 
 * @author linfuhui
 * @date 2025-12-17
 */
@RestController
@RequestMapping("/custUser/custUser")
public class TCustUserController extends BaseController
{
    @Autowired
    private ITCustUserService tCustUserService;

    /**
     * 查询普通用户（存储前端C端用户信息）列表
     */
    @PreAuthorize("@ss.hasPermi('custUser:custUser:list')")
    @GetMapping("/list")
    public TableDataInfo list(TCustUser tCustUser)
    {
        startPage();
        List<TCustUser> list = tCustUserService.selectTCustUserList(tCustUser);
        return getDataTable(list);
    }

    /**
     * 导出普通用户（存储前端C端用户信息）列表
     */
    @PreAuthorize("@ss.hasPermi('custUser:custUser:export')")
    @Log(title = "普通用户（存储前端C端用户信息）", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TCustUser tCustUser)
    {
        List<TCustUser> list = tCustUserService.selectTCustUserList(tCustUser);
        ExcelUtil<TCustUser> util = new ExcelUtil<TCustUser>(TCustUser.class);
        util.exportExcel(response, list, "普通用户（存储前端C端用户信息）数据");
    }

    /**
     * 获取普通用户（存储前端C端用户信息）详细信息
     */
    @PreAuthorize("@ss.hasPermi('custUser:custUser:query')")
    @GetMapping(value = "/{userId}")
    public AjaxResult getInfo(@PathVariable("userId") Long userId)
    {
        return success(tCustUserService.selectTCustUserByUserId(userId));
    }

    /**
     * 新增普通用户（存储前端C端用户信息）
     */
    @PreAuthorize("@ss.hasPermi('custUser:custUser:add')")
    @Log(title = "普通用户（存储前端C端用户信息）", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TCustUser tCustUser)
    {
        return toAjax(tCustUserService.insertTCustUser(tCustUser));
    }

    /**
     * 修改普通用户（存储前端C端用户信息）
     */
    @PreAuthorize("@ss.hasPermi('custUser:custUser:edit')")
    @Log(title = "普通用户（存储前端C端用户信息）", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TCustUser tCustUser)
    {
        return toAjax(tCustUserService.updateTCustUser(tCustUser));
    }

    /**
     * 删除普通用户（存储前端C端用户信息）
     */
    @PreAuthorize("@ss.hasPermi('custUser:custUser:remove')")
    @Log(title = "普通用户（存储前端C端用户信息）", businessType = BusinessType.DELETE)
	@DeleteMapping("/{userIds}")
    public AjaxResult remove(@PathVariable Long[] userIds)
    {
        return toAjax(tCustUserService.deleteTCustUserByUserIds(userIds));
    }
}
