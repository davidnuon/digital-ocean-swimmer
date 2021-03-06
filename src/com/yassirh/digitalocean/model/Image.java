package com.yassirh.digitalocean.model;

public class Image {
	
	private long id;
	private String name;
	private String distribution;
	private String slug;
	private Boolean isPublic;
	
	public Image(){
	}
	
	public Image(long id, String name, String distribution, String slug, Boolean ispublic) {
		super();
		this.id = id;
		this.name = name;
		this.distribution = distribution;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistribution() {
		return distribution;
	}
	public void setDistribution(String distribution) {
		this.distribution = distribution;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public Boolean isPublic() {
		return isPublic;
	}

	public void setPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}
}
