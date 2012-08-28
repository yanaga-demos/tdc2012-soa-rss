package br.com.yanaga.tdc2012.soa.rss.integration;

import static com.google.common.base.Preconditions.checkNotNull;

import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.social.linkedin.api.impl.LinkedInTemplate;

import br.com.yanaga.tdc2012.soa.rss.integration.linkedin.LinkedInShare;

public class LinkedInService {

	private LinkedInTemplate linkedInTemplate;

	public LinkedInService(LinkedInTemplate linkedInTemplate) {
		checkNotNull(linkedInTemplate);
		this.linkedInTemplate = linkedInTemplate;
	}

	@ServiceActivator
	public void sendMessage(String message) {
		LinkedInShare share = new LinkedInShare();
		share.setComment(message);
		linkedInTemplate.getRestTemplate().postForLocation("http://api.linkedin.com/v1/people/~/shares", share);
	}

}