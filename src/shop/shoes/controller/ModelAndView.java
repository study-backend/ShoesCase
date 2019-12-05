package shop.shoes.controller;

import net.sf.json.JSONArray;

public class ModelAndView {


   private String viewName;//결과뷰의정보
   private boolean isRedirect;//이동방식정보(true이면 redirect, false이면 forward)
   private String result; // 결과 data
   private boolean isResultData; 
   
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
		return isResultData;
	}

	public void setResultData(boolean isResultData) {
		this.isResultData = isResultData;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String resultData) {
		this.result = resultData;
	}
   

}
