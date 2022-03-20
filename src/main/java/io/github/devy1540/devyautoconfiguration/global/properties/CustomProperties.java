package io.github.devy1540.devyautoconfiguration.global.properties;


import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "devy.custom")
public class CustomProperties {
    private String key1;
    private String key2;
    private String key3;
}
