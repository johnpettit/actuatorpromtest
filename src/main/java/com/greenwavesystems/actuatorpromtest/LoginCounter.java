package com.greenwavesystems.actuatorpromtest;

import io.prometheus.client.Counter;

public class LoginCounter {
    static final Counter requests = Counter.build()
            .name("java_logins").help("Total Login attempts.").register();

    public void increment() {
        requests.inc();
    }

    public double getCount() {
        return requests.get();
    }
}
