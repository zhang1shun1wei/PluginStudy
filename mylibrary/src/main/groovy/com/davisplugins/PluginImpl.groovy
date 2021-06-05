package com.davisplugins

import com.android.build.gradle.AppExtension
import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl implements Plugin<Project>{

    void apply(Project project){
        System.out.println("========================");
        System.out.println("hello gradle plugin!");
        System.out.println("========================");
    }
}