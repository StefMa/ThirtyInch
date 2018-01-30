//buildscript {
//    repositories {
//        jcenter()
//    }
//    dependencies {
//        classpath 'com.novoda:bintray-release:0.8.0'
//    }
//}

//package net.grandcentrix.thirtyinch
/**
     * Call this method with a closure to configure publishing your thirtyinch module to bintray.
     */
//    def configurePublish(Project project, Closure body) {
//        println project
//
//        apply plugin: com.novoda.gradle.release.ReleasePlugin
//
//        project.publish {
//            userOrg = 'grandcentrix'
//            groupId = 'net.grandcentrix.thirtyinch'
//            publishVersion = VERSION_NAME
//            uploadName = 'ThirtyInch'
//            website = 'https://github.com/grandcentrix/ThirtyInch'
//            body.delegate = delegate
//            body()
//        }
//    }
//
//    static def printHello() {
//        println "hello from buildSrc"
//        println project
//    }

//
//ext {
//    // expose method to everyone applying this gradle file
//    configurePublish = this.&configurePublish
//}