package com.bignerdranch.android.beatbox

class SoundViewModel {
    var sound: Sound? = null
        set(sound) {
            field = sound
        }

    /* функция для получения названия */
    val title: String?
    get() = sound?.name
}