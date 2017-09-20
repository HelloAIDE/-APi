package com.lol.empty;

public class Hero {
	private	String id;
	private String key;
	private String name;
	private String title;
	@Override
	public String toString() {
		return "Hero [id=" + id + ", key=" + key + ", name=" + name + ", title=" + title + "]";
	}
	public Hero(String id, String key, String name, String title) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Hero() {
		// TODO Auto-generated constructor stub
	}
}
