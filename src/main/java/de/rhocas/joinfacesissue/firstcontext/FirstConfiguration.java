package de.rhocas.joinfacesissue.firstcontext;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import de.rhocas.joinfacesissue.shared.SharedConfiguration;

@Configuration
@Import ( SharedConfiguration.class )
@PropertySource ( "classpath:firstcontext/application.properties" )
public class FirstConfiguration {

}
