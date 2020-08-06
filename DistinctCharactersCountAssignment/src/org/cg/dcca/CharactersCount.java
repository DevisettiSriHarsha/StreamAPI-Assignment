package org.cg.dcca;

public class CharactersCount {
	
	private String name;
	private Integer distinctCharacterCount;
	@Override
	public String toString() {
		return "CharactersCount [name=" + name + ", distinctCharacterCount=" + distinctCharacterCount + "]";
	}
	public CharactersCount(String name, Integer distinctCharacterCount) {
		super();
		this.name = name;
		this.distinctCharacterCount = distinctCharacterCount;
	}
	public CharactersCount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDistinctCharacterCount() {
		return distinctCharacterCount;
	}
	public void setDistinctCharacterCount(Integer distinctCharacterCount) {
		this.distinctCharacterCount = distinctCharacterCount;
	}
	
	
	

}
