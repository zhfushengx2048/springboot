/**
 * Copyright (C), 2019-2019, 软件卓越人才班
 * FileName: WebConfig
 * Author:   hzg
 * Date:     2019-12-23 16:24
 * Description: 示例配置
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package org.example.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

/**
 * 〈一句话功能简述〉<br> 
 * 〈示例配置〉
 *
 * @author hbr
 * @create 2019-12-23
 * @since 1.0.0
 */
@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler(
                "/webjars/**",
                "/img/**",
                "/assets/**",
                "/icons/**",
                "/css/**",
                "/js/**")
                .addResourceLocations(
                        "classpath:/META-INF/resources/webjars/",
                        "classpath:/img/",
                        "classpath:/assets/",
                        "classpath:/icons/",
                        "classpath:/css/",
                        "classpath:/js/");
    }


}
