package br.com.yanaga.tdc2012.soa.rss.integration;

import org.springframework.integration.annotation.Transformer;

import com.sun.syndication.feed.synd.SyndEntry;

public class EntryToMessageTransformer {

	@Transformer
	public String transform(SyndEntry entry) {
		return String.format("%s %s", getText(entry), entry.getLink());
	}

	private String getText(SyndEntry entry) {
		String title = entry.getTitle();
		if (title.length() > 110) {
			return String.format("%s...", title.substring(0, 107));
		}
		return title;
	}

}