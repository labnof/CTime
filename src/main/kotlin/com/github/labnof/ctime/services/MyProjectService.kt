package com.github.labnof.ctime.services

import com.intellij.openapi.project.Project
import com.github.labnof.ctime.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
