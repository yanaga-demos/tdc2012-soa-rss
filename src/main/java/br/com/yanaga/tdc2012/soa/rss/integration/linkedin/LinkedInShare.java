package br.com.yanaga.tdc2012.soa.rss.integration.linkedin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "share")
public class LinkedInShare implements Serializable {

	private static final long serialVersionUID = 1L;

	private String comment;

	private LinkedInVisibility visibility = new LinkedInVisibility();

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public LinkedInVisibility getVisibility() {
		return visibility;
	}

	public void setVisibility(LinkedInVisibility visibility) {
		this.visibility = visibility;
	}

}