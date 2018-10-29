package com.xzj.page;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 分页�?
 * @param <T>
 */
public class PageSet<T> implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private int totalRows;//总行�?
	
    


    private int pageSize;//每页记录�?
	private int currPageNum;//当前�?
	
	private int totalPages;//总页�?
	private int startRow;//�?始行
	private int endRow;//结束�?

	private List<T> pageData;//数据list
	private Map<String, Object> params = new HashMap<String, Object>();
	
	public PageSet(){
	    pageSize=10;
	    currPageNum=1;
	    
	}
	
	public PageSet(int totalRows, int currPageNum, int pageSize)
	{
		this.totalRows = totalRows;
		this.pageSize = pageSize;
		this.currPageNum = currPageNum;
		
		this.totalPages = totalRows / pageSize;
		
		if (totalRows % pageSize != 0)
		{
			this.totalPages++;
		}

		if (currPageNum <= 0)
		{
			this.currPageNum = 1;
		}

		if (this.totalPages < currPageNum)
		{
			this.currPageNum = this.totalPages;
		}

		this.startRow = (this.currPageNum - 1) * this.pageSize;
		this.endRow = this.startRow + this.pageSize;
		
		if (this.totalRows < this.endRow)
		{
			this.endRow = this.totalRows;
		}
	}
	
	public int getTotalRows() { return totalRows; }
	
	public int getPageSize() { return pageSize; }
	
	public int getCurrPageNum() { return currPageNum; }
	
	public int getTotalPages() { return totalPages; }
	
	public int getStartRow() { return startRow; }
	
	public int getEndRow() { return endRow; }

	public List<T> getPageData() { return pageData; }
	public void setPageData(List<T> pageData) { this.pageData = pageData; }

    
    public Map<String, Object> getParams()
    {
        
        return params;
    }

    
    public void setParams(Map<String, Object> params)
    {
        
        this.params = params;
    }
    public void setTotalRows(int totalRows)
    {
        
        this.totalRows = totalRows;  
        // 在设置�?�条数的时�?�计算出对应的�?�页数，在下面的三目运算中加法拥有更高的优先级，�?以最后可以不加括号�??  
        int totalPage = totalRows % pageSize == 0 ? totalRows / pageSize : totalRows / pageSize + 1;  
        this.setTotalPages(totalPage);  
    }

    
    public void setTotalPages(int totalPages)
    {
        
        this.totalPages = totalPages;
    }
}