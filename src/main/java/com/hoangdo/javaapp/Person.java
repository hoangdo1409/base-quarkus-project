package com.hoangdo.javaapp;


public class Person {
	String name;
    private String code;
    private String desc;
	
	public Person(String name, String code, String desc) {
		this.setName(name);
		this.setCode(code);
		this.setDesc(desc);
	}

	public Person() {
		
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}