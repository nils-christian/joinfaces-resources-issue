package de.rhocas.joinfacesissue.firstcontext;

import de.rhocas.joinfacesissue.PrefixWebResourceRoot;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.webresources.StandardRoot;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import de.rhocas.joinfacesissue.shared.SharedConfiguration;

@Configuration
@Import(SharedConfiguration.class)
@PropertySource("classpath:firstcontext/application.properties")
public class FirstConfiguration {

    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatCustomizer() {
        return factory -> factory.addContextCustomizers(context -> {
            context.setResources(new PrefixWebResourceRoot("/a"));
        });
    }

}
