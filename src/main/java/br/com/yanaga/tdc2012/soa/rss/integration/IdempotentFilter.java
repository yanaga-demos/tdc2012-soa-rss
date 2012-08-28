package br.com.yanaga.tdc2012.soa.rss.integration;

import java.util.Set;

import org.springframework.integration.annotation.Filter;

import com.google.common.collect.Sets;
import com.sun.syndication.feed.synd.SyndEntry;

public class IdempotentFilter {

	private Set<String> urls = Sets.newHashSet();

	@Filter
	public boolean idempotent(SyndEntry entry) {
		if (urls.contains(entry.getLink())) {
			return false;
		} else {
			urls.add(entry.getLink());
			return true;
		}
	}

}
