package ru.netology.lesson6.attachment

/**
 * Абстрактный класс предок для всех видов
 * присоединенных файлов
 * в классе есть только тип, содержимое зависит от
 * этого типа
 */

import kotlinx.serialization.Serializable

@Serializable
abstract class Attachment(
    val type    : String = ""
)





