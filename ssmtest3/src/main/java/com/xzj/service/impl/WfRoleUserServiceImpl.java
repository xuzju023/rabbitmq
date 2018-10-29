package com.xzj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xzj.domain.WfRoleUser;
import com.xzj.mapper.WfRoleUserMapper;
import com.xzj.service.WfRoleUserService;

@Service
public class WfRoleUserServiceImpl  implements WfRoleUserService
{
	@Resource
    private WfRoleUserMapper wfRoleUserMapper;//流程角色dao接口
	

	@Override
	public List<WfRoleUser> getWfRoleUserByRoleId(int roleId) {
		return wfRoleUserMapper.getWfRoleUserByRoleId(roleId);
	}
	
}
