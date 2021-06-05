package com.davisplugins

import com.android.build.api.transform.QualifiedContent
import com.android.build.api.transform.Transform
import com.android.build.gradle.AppExtension
import com.android.build.gradle.internal.pipeline.TransformManager
import org.gradle.api.Plugin
import org.gradle.api.Project

class PluginImpl extends Transform implements Plugin<Project> {

    void apply(Project project) {
        System.out.println("***********************");
        def androidRegiste = project.extensions.findByType(AppExtension)
        androidRegiste.registerTransform(this)
        System.out.println("zsw11111 = "+androidRegiste.toString())
    }

    @Override
    String getName() {
        return "LifecyclePlugin"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        return false
    }
}