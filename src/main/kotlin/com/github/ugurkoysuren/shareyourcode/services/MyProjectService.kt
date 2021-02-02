package com.github.ugurkoysuren.shareyourcode.services

import com.github.ugurkoysuren.shareyourcode.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
