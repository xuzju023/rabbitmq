package com.xzj.service;

import java.util.List;

import com.xzj.domain.FwAlertingFormInst;
import com.xzj.page.PageSet;


public interface FwAlertingFormInstService {
		/**
	 * 分页数据
	 */
	public PageSet<FwAlertingFormInst> find(FwAlertingFormInst fwAlertingFormInst, int pageno, int pagesize);
	
	public List<String> getJsonValue(String json);
}
