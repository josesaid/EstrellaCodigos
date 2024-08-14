package com.codegym.lessons.module01.lesson26;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.parse("2024-05-27T19:57:30.00Z");
        instant = instant.minus(Duration.ofDays(22));
        System.out.println(instant);

        instant = instant.plus(Duration.ofHours(3) );
        instant = instant.plus(Duration.ofMinutes(2) );
        instant = instant.plus(Duration.ofSeconds(100) );
        System.out.println(instant);

    }
}
