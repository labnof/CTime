package com.github.labnof.ctime.actions

import com.intellij.notification.Notification
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


class ShowTimeAction : AnAction(){
    override fun actionPerformed(e: AnActionEvent) {
        val currentDateTime = LocalDateTime.now()
        val time = currentDateTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM))
        //var noty = NotificationGroup("my.group.id", NotificationDisplayType.BALLOON,true)
        // noty.createNotification("Title", "Subtitle", "Content", NotificationType.INFORMATION)
        val msg = Notification("my.group.id", "Time", time,
                NotificationType.INFORMATION, null)
        msg.notify(getEventProject(e))
    }
}