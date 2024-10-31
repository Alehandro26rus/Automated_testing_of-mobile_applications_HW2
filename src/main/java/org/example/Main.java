package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

plugins {
    id 'java'
}

group 'org.exanple"
version "1.0-SNAPSHOT'

repositories {
    mavencentral()
}

dependencies {
    testCompile group: 'junit', name: 'junit", version: '4.12'
    implenentation group: "io.appiun", nane: 'java-client', version: '7.5.1'
}

