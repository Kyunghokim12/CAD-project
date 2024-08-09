package mallapi.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import mallapi.demo.controller.formatter.LocalDateFormatter;


@Configuration
public class CustomServletConfig implements WebMvcConfigurer{

  @Override
  public void addFormatters(FormatterRegistry registry) {
    
    registry.addFormatter(new LocalDateFormatter());
  }


}
