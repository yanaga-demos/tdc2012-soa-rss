package br.com.yanaga.tdc2012.soa.rss.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = "br.com.yanaga.tdc2012.soa.rss")
@ImportResource("classpath*:META-INF/spring/applicationContext*.xml")
@Configuration
public class Config {

}