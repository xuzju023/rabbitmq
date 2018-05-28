package com.xzj.domain;
/**************************************************************************/
/*                                                                                                                                                */
/* Copyright (c) 2015 YULONG Company                                                                                 */
/* 宇龙计算机通信科技（深圳）有限公司版权所有 2015                                                  */
/*                                                                                                                                                */
/* PROPRIETARY RIGHTS of YULONG Company are involved in the                                        */
/* subject matter of this material. All manufacturing, reproduction, use,                              */
/* and sales rights pertaining to this subject matter are governed by the                              */
/* license agreement. The recipient of this software implicitly accepts                                 */
/* the terms of the license.                                                                                                       */
/* 本软件文档资料是宇龙公司的资产，任何人士阅读和使用本资料必须获得               */
/* 相应的书面授权，承担保密责任和接受相应的法律约束。                                           */
/*                                                                                                                                                */
/**************************************************************************/
 
/**
  * <pre>
  * 系统缩写：EW
  * 系统名称：云侠办公
  * 组件名称：人员管理
  * 文件名称：User.java
  * 作    者：周行波
  * 生成日期：2015-12-15
  * </pre>
  */
 
/**
  * <pre>
  * 修改记录：01 
  * 修改日期：2015-12-15
  * 修 改 人：周行波
  * 修改内容：初始化
  * </pre>
  */
/**
 * 用户
 * @author zhouxingbo
 *
 */
@SuppressWarnings("serial")
public class FwUser extends BaseObject
{
    private Long companyId;//
    private String username;//用户名
    private String password;//密码
    private String companyCode;//公司Code
    private String cid;    //app个推
    private FwUserInfo userInfo;//用户详细信息
    private String staffNo;//员工编号
    
    
    public FwUserInfo getUserInfo() {
		return userInfo;
	}


	public void setUserInfo(FwUserInfo userInfo) {
		this.userInfo = userInfo;
	}


	public Long getCompany_id()
    {
    
        return companyId;
    }

    
    public void setCompany_id(Long company_id)
    {
    
        this.companyId = company_id;
    }

    public String getUsername()
    {
    
        return username;
    }
    
    public void setUsername(String username)
    {
    
        this.username = username;
    }
    
    public String getPassword()
    {
    
        return password;
    }
    
    public void setPassword(String password)
    {
    
        this.password = password;
    }


    
    public Long getCompanyId()
    {
    
        return companyId;
    }


    
    public void setCompanyId(Long companyId)
    {
    
        this.companyId = companyId;
    }


    


	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}


	public String getCid() {
		return cid;
	}


	public void setCid(String cid) {
		this.cid = cid;
	}


    
    public String getStaffNo()
    {
        
        return staffNo;
    }


    
    public void setStaffNo(String staffNo)
    {
        
        this.staffNo = staffNo;
    }


	
    
    
}
