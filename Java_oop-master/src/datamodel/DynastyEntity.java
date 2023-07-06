package datamodel;

import java.util.Map;

import constant.Constant;

public class DynastyEntity extends baseEntity{

	public DynastyEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DynastyEntity(String name, Map<String, String> additionalInfo, String description ) {
		super(name, additionalInfo, description);
	}
	public DynastyEntity(String name, Map<String, String> additionalInfo, String description, String url ) {
		super(name, additionalInfo, description);
		setRootURL(url);
	}
	public String getType() {
		return Constant.FESTIVAL_ENTITY;
	}

	@Override
	public String toString() {
		return "FestivalEntity [id=" + id + ", name=" + name + ", description=" + description + ", additionalInfo="
				+ additionalInfo + ", relatedEntityIds=" + relatedEntityIds + ", rootURL=" + rootURL + "]";
	}
}
