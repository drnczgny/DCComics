package com.epam.dccomics.domain;

import java.applet.AppletContext;

import javax.annotation.PostConstruct;

import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.classic.Logger;

public class DCWorld {
	
	private static Logger logger = (Logger) LoggerFactory.getLogger(DCWorld.class);

	public DCWorld() {
	}

	@PostConstruct
	public void init() {
		logger.debug("DC World created");
		logger.debug("------------------");
	}

	public void createDCHeroes(final ApplicationContext ctx) {
		TheGreenArrow arrow = ctx.getBean("theGreenArrow", TheGreenArrow.class);
		Superman superman = ctx.getBean("superman", Superman.class);
		Batman batman = ctx.getBean("batman", Batman.class);
		PrototypeDCHero prototypeDCHero = ctx.getBean("prototypeDCHero", PrototypeDCHero.class);
		Gun gun = ctx.getBean("batmobilGun", Gun.class);
		Batmobil batmobil = ctx.getBean("batmobil", Batmobil.class);
		LexLutor lexLutor = ctx.getBean("lexLutor", LexLutor.class);
		Zoom zoom = ctx.getBean("zoom", Zoom.class);
		
		logger.debug("------------------");
		logger.debug(arrow.toString());
		logger.debug(superman.toString());
		logger.debug(batman.toString());
		logger.debug(prototypeDCHero.toString());
		logger.debug(gun.toString());
		logger.debug(batmobil.toString());
		logger.debug(lexLutor.toString());
		logger.debug(zoom.toString());
	}
	
	private void fight() {
		
	}
	
}
