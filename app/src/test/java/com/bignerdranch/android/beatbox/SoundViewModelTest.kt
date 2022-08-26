package com.bignerdranch.android.beatbox


import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat


import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class SoundViewModelTest {
    /* поле для хранения */
    private lateinit var beatBox: BeatBox
    private lateinit var sound: Sound
    private lateinit var subject: SoundViewModel

    /* будет выполнен один раз перед выполнением каждого теста */
    @Before
    fun setUp() {
        /* создание обьекта имитации с помощью Mockito */
        beatBox = mock(BeatBox::class.java)
        /* Создание тестируемого объекта */
        sound = Sound("assetPath")
        /* тестируемый обьект */
        subject = SoundViewModel()
        subject.sound = sound
    }

    /* Сам тест */
    @Test
    fun exposesSoundAsTitle() {
        /* Свойство заголовка будет тем же что и имя звука */
        /* тест проверяет функцию is */
        assertThat(subject.title, `is`(sound.name))
    }

    /* пишется тест, который показывает, какое поведение ожидается от новой
    функции, причем делается это до написания самой функции */
    /* сгенерироват функцю Alt+Enter */
    @Test
    fun callBeatBoxPlayOnButtonClicked() {
        subject.onButtonClicked()

        /* verify проверяет, вызывались ли эти функции так, как вы ожидали. */
        /* Проверить, что функция play(...) была вызвана для beatBox с передачей sound в качестве параметра */
        verify(beatBox).play(sound)
    }
}