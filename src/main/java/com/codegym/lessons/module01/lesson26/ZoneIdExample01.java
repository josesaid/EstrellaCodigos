package com.codegym.lessons.module01.lesson26;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneIdExample01 {
    public static void main(String[] args) {
        //ZoneId zoneId = ZoneId.of("Africa/Cairo");
        ZoneId zoneId = ZoneId.of("Japan");
        ZonedDateTime time = ZonedDateTime.now(zoneId);
        System.out.println("TIME:  " + time);


        Set<String> zones = ZoneId.getAvailableZoneIds();
        for(String zona : zones){
            System.out.println("zona: " + zona);
        }

        System.out.println(zones.size());

        System.out.println("------------");
        System.out.println(time);
        System.out.println(time.getZone());
        System.out.println(time.getHour());
        System.out.println(time.getDayOfMonth());
        System.out.println(time.getDayOfWeek());


    }

}
