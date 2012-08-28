package br.com.yanaga.tdc2012.soa.rss;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.com.yanaga.tdc2012.soa.rss.config.Config;

public class SoaRssDemo {

	public static void main(String[] args) {
		new AnnotationConfigApplicationContext(Config.class);
	}

}