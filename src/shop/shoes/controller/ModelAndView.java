package shop.shoes.controller;

public class ModelAndView {
   private String viewName;//결과뷰의정보
   private boolean isRedirect;//이동방식정보(true이면 redirect, false이면 forward)
   private String result; // 결과 data
   private boolean isResultData = false; 
   
    public ModelAndView() {}
   
	public ModelAndView(String viewName, boolean isRedirect) {
		super();
		this.viewName = viewName;
		this.isRedirect = isRedirect;
	}
	
	public ModelAndView(String viewName, boolean isRedirect, String result) {
		super();
		this.viewName = viewName;
		this.isRedirect = isRedirect;
		this.result = result;
		this.isResultData = true;
	}
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
	public boolean isResultData() {
		return isRedirect;
	}
   

}
