package br.com.doubt.point.config;


import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class ContextConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {



    @Override
    @Description("will change Context config ")
    public void customize(ConfigurableServletWebServerFactory factory) {

    }


}
