package com.epam.dccomics.domain;

import javax.annotation.PostConstruct;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.slf4j.LoggerFactory;

import com.epam.dccomics.constant.Constant;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.core.pattern.color.ANSIConstants;

public class Batman extends DCHero {

	private static final Logger logger = (Logger) LoggerFactory.getLogger(Batman.class);

	private Batmobil batmobil;

	public Batman(final String name) {
		super(name);
	}
	
	@PostConstruct
	public void init() {
		logger.debug("{} is created", getName());
	}

	
	public Batmobil getBatmobil() {
		return batmobil;
	}

	public void setBatmobil(Batmobil batmobil) {
		this.batmobil = batmobil;
	}

	@Override
	public String toString() {
		return myToString();
	}

	private String myToString() {
		StringBuilder sb = new StringBuilder(ToStringBuilder.reflectionToString(this));
		final int idx = sb.indexOf("[");
		sb = new StringBuilder(sb.substring(idx, sb.length()));
		String str = getName() + " " + sb.toString();
		return str;
	}

}
