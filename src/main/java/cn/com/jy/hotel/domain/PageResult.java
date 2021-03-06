package cn.com.jy.hotel.domain;


/**
 * 
 * 
 * 把查询后的分页结果封装到PageResult
 * 
 */
public class PageResult/*<T>*/ {
	
	private long currentPage;		//主表的当前页码
	private long pageSize;			// 一页显示的条数
	private long totalRows;			// 总条数
	private long totalPages;			// 总页数:计算出来
	//private List<T> rows = null;	// 当前页的数据

	public PageResult() {

	}

	public PageResult(long currentPage, long pageSize, long totalRows) {
		this.currentPage = currentPage;
		this.pageSize = pageSize;
		this.totalRows = totalRows;

		// currentPage和pageSize最小值必须是1
		this.currentPage = Math.max(this.currentPage, 1);
		this.pageSize = Math.max(this.pageSize, 1);

		// 总页数:计算出来
		this.totalPages = (this.totalRows + this.pageSize - 1) / this.pageSize;

		// 错误处理
		// 当前页面不能大于总页数
		this.currentPage = Math.min(this.currentPage, this.totalPages);
	}

	public long getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}
	public long getPageSize() {
		return pageSize;
	}

	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}

	public long getTotalRows() {
		return totalRows;
	}

	public void setTotalRows(long totalRows) {
		this.totalRows = totalRows;
	}

	public long getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(long totalPages) {
		this.totalPages = totalPages;
	}

	/*public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}*/
	public long getLimitOffset(){
		return (this.currentPage-1)*this.pageSize;
	}
}
