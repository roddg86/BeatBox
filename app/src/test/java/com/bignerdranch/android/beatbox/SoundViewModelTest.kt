package com.bignerdranch.android.beatbox

import org.junit.Assert.*

import org.junit.Before

class SoundViewModelTest {
    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    /* будет выполнен один раз перед выполнением каждого теста */
    @Before
    fun setUp() {
        /* Создание тестируемого объекта */
        sound = Sound("assetPath")
        /* тестируемый обьект */
        subject = SoundViewModel()
        subject.sound = sound
    }
}