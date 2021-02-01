package ru.netology.lesson6.attachment

/**
 * Это устаревший тип вложения. Он может быть возвращен лишь для записей,
 * созданных раньше 2013 года. Для более новых записей граффити возвращается в виде вложения с типом photo.
 */

data class AttachmentGraffiti (
    override val type     : String = "graffiti",
             val graffiti : AttachmentGraffitiContent = AttachmentGraffitiContent(),     //	идентификатор граффити.
) : Attachment()

/**
 * Содержимое вложения graffiti
 */
data class AttachmentGraffitiContent (
    val id      : Int = 0,     //	идентификатор граффити.
    val ownerId : Int = 0,     //	идентификатор автора граффити.
    val photo130: String = "", //	URL изображения для предпросмотра.
    val photo604: String = "", //	URL полноразмерного изображения.
)