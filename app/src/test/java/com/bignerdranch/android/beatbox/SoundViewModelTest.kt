package com.bignerdranch.android.beatbox


import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat


import org.junit.Before
import org.junit.Test

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

    /* Сам тест */
    @Test
    fun exposesSoundAsTitle(){
        /* Свойство заголовка будет тем же что и имя звука */
        /* тест проверяет функцию is */
        assertThat(subject.title, `is`(sound.name))
    }
}