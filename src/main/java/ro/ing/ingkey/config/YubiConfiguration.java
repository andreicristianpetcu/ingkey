package ro.ing.ingkey.config;

import com.yubico.u2f.U2F;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class YubiConfiguration {

    @Bean
    public U2F u2f(){
        return new U2F();
    }
}
