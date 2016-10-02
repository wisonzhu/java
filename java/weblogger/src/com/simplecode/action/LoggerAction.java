package com.simplecode.action;

import org.apache.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

public class LoggerAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private static final Logger logger = Logger.getLogger(LoggerAction.class);

	public String execute() throws Exception {

		logger.warn("Warning .......");
		logger.error("Error .......");
		logger.info("info .......");
		logger.fatal("fatal......");

		return SUCCESS;

	}
}