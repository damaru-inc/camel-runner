package com.solace.camelrunner;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RouteConfig extends RouteBuilder {

	private static final Logger logger = LoggerFactory.getLogger(RouteConfig.class);
	
	@Autowired
	CamelContext context;

	@Override
	public void configure() throws Exception {
		logger.info("MyRoute configure");

//        from("test-jms:queue:solaceOut").to("rabbitmq://localhost/rabbitIn?exchangeType=fanout&autoDelete=false&username=guest&password=guest");
//        from("rabbitmq://localhost/rabbitOut?queue=rabbitQueueOut&autoDelete=false&username=guest&password=guest").to("test-jms:topic:sol/in");
        
//        from("file://source?noop=true")
//        .process("sampleProcessor")
//        .to("file://dest");
	}

}
