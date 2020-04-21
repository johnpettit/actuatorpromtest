package com.greenwavesystems.actuatorpromtest;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class LoginCounterService {

    private MeterRegistry meterRegistry;
    private Counter loginCounter;

    public LoginCounterService(MeterRegistry meterRegistry) {
        this.meterRegistry = meterRegistry;
        this.loginCounter = Counter.builder("java_logins")
                .description("The number of login attempts")
                .register(this.meterRegistry);
    }
    
    public void increment() {
        loginCounter.increment();
    }
    
    public int getVal() {
       return ((int) loginCounter.count());
    }
}
