package net.grandcentrix.thirtyinch

import org.gradle.api.Project

/**
 * Call this method with a closure to configure publishing your thirtyinch module to bintray.
 */
def configurePublish(Project project, Closure body) {
    println project
    project.apply([plugin: 'com.novoda.bintray-release'])

    project.publish {
        userOrg = 'grandcentrix'
        groupId = 'net.grandcentrix.thirtyinch'
        publishVersion = VERSION_NAME
        uploadName = 'ThirtyInch'
        website = 'https://github.com/grandcentrix/ThirtyInch'
        body.delegate = delegate
        body()
    }
}

static def printHello() {
    println "hello from buildSrc"
}