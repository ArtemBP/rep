package com.github.artembp.slownews.servlet.archive;


public class News {
	private int id;
	private String Title;
	private String Body;
//	private ArrayList list;
	
	public News(int id, String Title, String Body){
		this.Title=Title;
		this.Body=Body;
		this.id=id;
//		ArrayList<News> list = new ArrayList<News>();
	}
	public void setTitleNews(String title, String Body) {
		this.Title=title;
		this.Body=Body;
	}
	public String getTitle() {
		return Title;
	}
	public String getBody() {
		return Body;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return "id= "+id+" Title= "+Title+" News= "+Body;
		
	}
}
