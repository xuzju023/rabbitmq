package com.xzj.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xzj.domain.FwAFIUser;
import com.xzj.domain.WfRoleUser;
import com.xzj.mapper.FwAFIUserMapper;
import com.xzj.service.FwAFIUserService;
import com.xzj.service.WfRoleUserService;

@Service
public class FwAFIUserServiceImpl implements FwAFIUserService {

	@Resource
	private FwAFIUserMapper mapper;

	@Autowired
	private WfRoleUserService wfRoleUserService;// 流程角色人员service

	@Override
	public long insert(FwAFIUser afiUser) {
		mapper.insert(afiUser);
		return afiUser.getId();
	}

	//List<WfRoleUser> wfRoleUserList = wfRoleUserService.getWfRoleUserByRoleId(roleId.intValue());
}
