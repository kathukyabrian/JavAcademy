package com.company;

import java.util.Map;

public class Environment {
    public static void main(String[] args) {
        // System.env without arguments returns a Map of K,V
        Map<String, String> envs = System.getenv();

        for(String envKey : envs.keySet()){{
            System.out.format("%s=%s%n",envKey,envs.get(envKey));
        }}
    }
}
