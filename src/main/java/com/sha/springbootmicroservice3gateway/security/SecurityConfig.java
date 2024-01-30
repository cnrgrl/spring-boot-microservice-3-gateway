//package com.sha.springbootmicroservice3gateway.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.servlet.config.annotation.CorsRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig implements WebSecurityConfigurer {
//    @Autowired
//    private CustomUserDetailsService customUserDetailsService;
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    @Bean(BeanIds.AUTHENTICATION_MANAGER)
//    public  AuthenticationManager authenticationManagerBean() throws Exception {
//
//    }
//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();
//        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//
//        http.authorizeRequests()
//                .antMatcher(HttpMethod.OPTIONS).permitAll()
//                .antMatcher("/api/authentication/**").permitAll() // login and register pre-path
//                .anyRequest().authentication();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public WebMvcConfigurer corsConfigurer() {
//        return new WebMvcConfigurer() {
//            @Override
//            public void addCorsMapping(CorsRegistry registry) {
//                registry.addMapping("/**")
//                        .allowedOrigins("*") // localhost, "^http://([-\\w]*.)?localhost(:[0-9])?"
//                        .allowedMethods("*"); // POST, GET...
//            }
//        };
//
//    }
//}

