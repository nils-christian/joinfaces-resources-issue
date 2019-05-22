package de.rhocas.joinfacesissue.shared;

import org.joinfaces.autoconfigure.JoinfacesAutoConfiguration;
import org.joinfaces.autoconfigure.javaxfaces.FacesServletAutoConfiguration;
import org.joinfaces.autoconfigure.javaxfaces.JavaxFacesAutoConfiguration;
import org.joinfaces.autoconfigure.javaxfaces.ProjectStageAutoConfiguration;
import org.joinfaces.autoconfigure.myfaces.MyFacesAutoConfiguration;
import org.joinfaces.autoconfigure.servlet.initparams.ServletContextInitParameterPropertiesAutoConfiguration;
import org.joinfaces.autoconfigure.tomcat.TomcatAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan
@Import ( {
		ServletWebServerFactoryAutoConfiguration.class,
		EmbeddedWebServerFactoryCustomizerAutoConfiguration.class,
		DispatcherServletAutoConfiguration.class,
		MultipartAutoConfiguration.class,
		JoinfacesAutoConfiguration.class,
		TomcatAutoConfiguration.class,
		FacesServletAutoConfiguration.class,
		JavaxFacesAutoConfiguration.class,
		MyFacesAutoConfiguration.class,
		ProjectStageAutoConfiguration.class,
		ServletContextInitParameterPropertiesAutoConfiguration.class
} )
public class SharedConfiguration {

}
