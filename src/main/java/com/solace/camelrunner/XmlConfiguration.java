package com.solace.camelrunner;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"camel*.xml"})
public class XmlConfiguration {

}
