package net.ruixin.oauth.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author mxding
 * @date 2020-11-02 8:49
 */
@Configuration
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // http.httpBasic();
        // super.configure(http);
        http.authorizeRequests().anyRequest().authenticated().and().oauth2Login();
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/authorize")
                .antMatchers("/oauth2/callback")
        .antMatchers("/home");
        /*web.ignoring().antMatchers("/oauth2/callback");*/
        super.configure(web);
    }
}
