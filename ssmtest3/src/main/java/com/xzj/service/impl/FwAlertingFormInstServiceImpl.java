package com.xzj.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xzj.domain.FwAlertingFormInst;
import com.xzj.mapper.FwAlertingFormInstMapper;
import com.xzj.page.PageSet;
import com.xzj.service.FwAlertingFormInstService;

import net.sf.json.JSONObject;

@Service
public class FwAlertingFormInstServiceImpl  implements FwAlertingFormInstService {

	@Resource
	private FwAlertingFormInstMapper mapper;
	
	public PageSet<FwAlertingFormInst> find(FwAlertingFormInst fwAlertingFormInst, int pageno, int pagesize) {
		
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("afi", fwAlertingFormInst);
		int count = mapper.countAlertingFormInst(params);
		PageSet<FwAlertingFormInst> pageSet = new PageSet<FwAlertingFormInst>(count,pageno,pagesize);
		if (count > 0) {
			params.put("startPageRowCount", pageSet.getStartRow());
			params.put("maxPageRowCount", pageSet.getPageSize());
			pageSet.setPageData(mapper.queryAlertingFormInst(params));
		}
		return pageSet;
	}

	@Override
	public List<String> getJsonValue(String json) {
		JSONObject object = JSONObject.fromObject(json);
		Map<String,String> map = (Map)JSONObject.toBean(object,Map.class);
		List<String> list=new ArrayList<>();
		Set<Map.Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			list.add(entry.getValue());
		}
		return list;
	}
  
}
