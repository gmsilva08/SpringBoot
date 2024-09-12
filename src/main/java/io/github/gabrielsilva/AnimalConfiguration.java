package io.github.gabrielsilva;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnimalConfiguration {

    @Bean(name = "cachorro")
    public Animal cachorro(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.print("Au au");
            }
        };

    };

    @Bean(name = "gato")
    public Animal gato(){
        return new Animal() {
            @Override
            public void fazerBarulho() {
                System.out.println("Miau");
            }
        };
    }
}
