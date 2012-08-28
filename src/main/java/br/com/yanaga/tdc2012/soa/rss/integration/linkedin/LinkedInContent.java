package br.com.yanaga.tdc2012.soa.rss.integration.linkedin;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "content")
public class LinkedInContent implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "title")
	private String title;

	@XmlElement(name = "submitted-url")
	private String submittedUrl;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubmittedUrl() {
		return submittedUrl;
	}

	public void setSubmittedUrl(String submittedUrl) {
		this.submittedUrl = submittedUrl;
	}

}
