// package com.hanshenwang.projectisidore;


// import org.springframework.context.annotation.Configuration;
// import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
// import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
// import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// @Configuration
// public class MvcConfig implements WebMvcConfigurer {
//     @Override
//     public void addResourceHandlers(ResourceHandlerRegistry registry) {
//         registry
//                 .addResourceHandler("/resources/**")
//                 .addResourceLocations("/resources/");
//     }

//     @Override
//     public void addViewControllers(ViewControllerRegistry registry) {
//         registry.addViewController("/home").setViewName("home");
//         registry.addViewController("/").setViewName("home");
//         registry.addViewController("/blog").setViewName("blog");
//         registry.addViewController("/login").setViewName("login");
//         registry.addViewController("/contactme").setViewName("contactme");
//     }

// }
