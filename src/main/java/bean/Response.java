package bean;

public class Response {

  String status;
  String userTier;
  int total;
  int startIndex;
  int pageSize;
  int currentPage;
  int pages;
  String orderBy;
  Article[] results;

  public Response() {
  }

  public Response(final String status, final String userTier, final int total, final int startIndex, final int pageSize, final int currentPage, final int pages, final String orderBy, final Article[] results) {
    this.status = status;
    this.userTier = userTier;
    this.total = total;
    this.startIndex = startIndex;
    this.pageSize = pageSize;
    this.currentPage = currentPage;
    this.pages = pages;
    this.orderBy = orderBy;
    this.results = results;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(final String status) {
    this.status = status;
  }

  public String getUserTier() {
    return userTier;
  }

  public void setUserTier(final String userTier) {
    this.userTier = userTier;
  }

  public int getTotal() {
    return total;
  }

  public void setTotal(final int total) {
    this.total = total;
  }

  public int getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(final int startIndex) {
    this.startIndex = startIndex;
  }

  public int getPageSize() {
    return pageSize;
  }

  public void setPageSize(final int pageSize) {
    this.pageSize = pageSize;
  }

  public int getCurrentPage() {
    return currentPage;
  }

  public void setCurrentPage(final int currentPage) {
    this.currentPage = currentPage;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(final int pages) {
    this.pages = pages;
  }

  public String getOrderBy() {
    return orderBy;
  }

  public void setOrderBy(final String orderBy) {
    this.orderBy = orderBy;
  }

  public Article[] getResults() {
    return results;
  }

  public void setResults(final Article[] results) {
    this.results = results;
  }
}
