package de.rhocas.joinfacesissue;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Configuration;

import de.rhocas.joinfacesissue.firstcontext.FirstConfiguration;
import de.rhocas.joinfacesissue.secondcontext.SecondConfiguration;

@Configuration
public class JoinfacesIssueApplication {

	public static void main( final String[] args ) {
		new SpringApplicationBuilder( )
				.sources( JoinfacesIssueApplication.class )

				.child( FirstConfiguration.class )
				.web( WebApplicationType.SERVLET )

				.sibling( SecondConfiguration.class )
				.web( WebApplicationType.SERVLET )

				.run( args );
	}

}
