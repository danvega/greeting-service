package dev.danvega.greetingservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConstructorBinding
@ConfigurationProperties("greeting")
public class GreetingProperties {

    private String salutation;

    public GreetingProperties(@DefaultValue("👋🏻 Hello") String salutation) {
        this.salutation = salutation;
    }

    public String getSalutation() {
        return salutation;
    }
}
