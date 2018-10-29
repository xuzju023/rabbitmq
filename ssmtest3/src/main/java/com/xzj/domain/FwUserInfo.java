package com.xzj.domain;

import java.sql.Timestamp;
import java.util.Date;
/**
 * 用户
 * @author zhouxingbo
 *
 */
@SuppressWarnings("serial")
public class FwUserInfo extends BaseObject
{
 private Long  userId;//用户ID 
 private String  employeeName ;//用户姓名
 private String  identityCardNumber;//身份证号码  
 private Integer  deptId;//部门ID 
 private String  mobile;//手机号码
 private String  email;//电子邮箱
 private Date  enabledDate ;//有效期
 private String roleName;//角色名称
 private String status;//状态
 private String duty;
 private String dutySecondary;
 private String sex; //性别，F：女性；M：男性
 private String jobTitle;//业务头衔
 private String costCenter;//成本中心
 private String costCenterDesc;//成本中心描述
 private String supervisorName;//汇报上级（员工编号）
 private Timestamp lastModifyDate;//记录最后修改时间
 private String leCountry;//国籍
 private String leNidIdType;//证件类型
 private String lePayLocation;//发薪地
 private String companyDesc;//成本公司
 private String carFare;//交通费
 private String communicationFee;//通讯费
 

public Long getUserId()
{

    return userId;
}

public void setUserId(Long userId)
{

    this.userId = userId;
}

public String getEmployeeName()
{

    return employeeName;
}

public void setEmployeeName(String employeeName)
{

    this.employeeName = employeeName;
}

public String getIdentityCardNumber()
{

    return identityCardNumber;
}

public void setIdentityCardNumber(String identityCardNumber)
{

    this.identityCardNumber = identityCardNumber;
}

public Integer getDeptId()
{

    return deptId;
}

public void setDeptId(Integer deptId)
{

    this.deptId = deptId;
}

public String getMobile()
{

    return mobile;
}

public void setMobile(String mobile)
{

    this.mobile = mobile;
}

public String getEmail()
{

    return email;
}

public void setEmail(String email)
{

    this.email = email;
}

public Date getEnabledDate()
{

    return enabledDate;
}

public void setEnabledDate(Date enabledDate)
{

    this.enabledDate = enabledDate;
}

public String getRoleName()
{

    return roleName;
}

public void setRoleName(String roleName)
{

    this.roleName = roleName;
}

public String getStatus()
{

    return status;
}

public void setStatus(String status)
{

    this.status = status;
}


public String getDuty()
{

    return duty;
}


public void setDuty(String duty)
{

    this.duty = duty;
}


public String getDutySecondary()
{

    return dutySecondary;
}


public void setDutySecondary(String dutySecondary)
{

    this.dutySecondary = dutySecondary;
}


public String getSex()
{
    
    return sex;
}


public void setSex(String sex)
{
    
    this.sex = sex;
}


public String getJobTitle()
{
    
    return jobTitle;
}


public void setJobTitle(String jobTitle)
{
    
    this.jobTitle = jobTitle;
}


public String getCostCenter()
{
    
    return costCenter;
}


public void setCostCenter(String costCenter)
{
    
    this.costCenter = costCenter;
}


public String getCostCenterDesc()
{
    
    return costCenterDesc;
}


public void setCostCenterDesc(String costCenterDesc)
{
    
    this.costCenterDesc = costCenterDesc;
}


public String getSupervisorName()
{
    
    return supervisorName;
}


public void setSupervisorName(String supervisorName)
{
    
    this.supervisorName = supervisorName;
}


public Timestamp getLastModifyDate()
{
    
    return lastModifyDate;
}


public void setLastModifyDate(Timestamp lastModifyDate)
{
    
    this.lastModifyDate = lastModifyDate;
}


public String getLeCountry()
{
    
    return leCountry;
}


public void setLeCountry(String leCountry)
{
    
    this.leCountry = leCountry;
}


public String getLeNidIdType()
{
    
    return leNidIdType;
}


public void setLeNidIdType(String leNidIdType)
{
    
    this.leNidIdType = leNidIdType;
}


public String getLePayLocation()
{
    
    return lePayLocation;
}


public void setLePayLocation(String lePayLocation)
{
    
    this.lePayLocation = lePayLocation;
}


public String getCompanyDesc()
{
    
    return companyDesc;
}


public void setCompanyDesc(String companyDesc)
{
    
    this.companyDesc = companyDesc;
}


public String getCarFare()
{
    
    return carFare;
}


public void setCarFare(String carFare)
{
    
    this.carFare = carFare;
}


public String getCommunicationFee()
{
    
    return communicationFee;
}


public void setCommunicationFee(String communicationFee)
{
    
    this.communicationFee = communicationFee;
}


 
 
}
