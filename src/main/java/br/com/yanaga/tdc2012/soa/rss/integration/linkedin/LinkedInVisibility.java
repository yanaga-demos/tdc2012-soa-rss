package br.com.yanaga.tdc2012.soa.rss.integration.linkedin;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "visibility")
public class LinkedInVisibility {

	@XmlElement(name = "code")
	private String code = "anyone";

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}