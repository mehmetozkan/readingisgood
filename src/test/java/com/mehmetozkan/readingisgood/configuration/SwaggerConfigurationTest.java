package com.mehmetozkan.readingisgood.configuration;

import com.mehmetozkan.readingisgood.config.SwaggerConfiguration;
import org.junit.jupiter.api.Test;
import springfox.documentation.spring.web.plugins.Docket;

import static org.assertj.core.api.Assertions.assertThat;

public class SwaggerConfigurationTest {

    @Test
    public void it_should_create_docket(){
        SwaggerConfiguration swaggerConfig = new SwaggerConfiguration();

        Docket docket = swaggerConfig.api();

        assertThat(docket).isInstanceOf(Docket.class);
    }

}
