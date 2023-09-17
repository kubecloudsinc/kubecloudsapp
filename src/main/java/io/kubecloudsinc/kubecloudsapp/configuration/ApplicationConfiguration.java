package io.kubecloudsinc.kubecloudsapp.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class ApplicationConfiguration {
    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/app/");
        resolver.setSuffix(".html");
        return resolver;

    }

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }


}



