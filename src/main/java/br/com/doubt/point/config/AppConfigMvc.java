package br.com.doubt.point.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.*;



@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"br.com.doubt.point"})
public class AppConfigMvc implements WebMvcConfigurer {

    private ApplicationContext applicationContext;
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {


        registry.addResourceHandler(
                "/webjars/**",
                "/images/**",
                "/css/**",
                "/js/**")
                .addResourceLocations(
                        "classpath:/META-INF/resources/webjars/",
                        "classpath:/static/images/",
                        "classpath:/static/css/",
                        "classpath:/static/js/");

    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
