package net.grandcentrix.thirtyinch;

import com.novoda.gradle.release.PublishExtension;
import groovy.lang.Closure;
import java.util.HashMap;
import java.util.Map;
import org.gradle.api.Project;

public class Deps {

    public static final String androidPlugin = "com.android.tools.build:gradle:3.0.0-beta6";

    public static final String kotlinVersion = "1.1.50";

    public static final String kotlinPlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:" + kotlinVersion;

    public static final String kotlinRuntime = "org.jetbrains.kotlin:kotlin-stdlib-jre7:" + kotlinVersion;

    public static final String appCompat = "com.android.support:appcompat-v7:26.1.0";

    public static final String constraintLayout = "com.android.support.constraint:constraint-layout:1.0.2";

    public static final String junit = "junit:junit:4.12";

    public static void configPublish(Project project, Closure body) {
        System.out.println(project);
        final HashMap hashMap = new HashMap<>();
        hashMap.put("plugin", "com.novoda.bintray-release");
        project.apply(hashMap);

        final Object publicEx = project.getExtensions().findByName("publish");
        final PublishExtension extension = (PublishExtension) publicEx;
        extension.setUserOrg("grandcentrix");
        extension.setGroupId("net.grandcentrix.thirtyinch");
        extension.setPublishVersion("1");
        extension.setWebsite("https://github.com/grandcentrix/ThirtyInch");
        final Map<String, String> call = (Map<String, String>) body.call();
        extension.setArtifactId(call.get("artifactId"));
        extension.setDesc(call.get("desc"));
        System.out.println(extension.getGroupId());
    }

}