package com.example

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.example.data.BookRepository
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [36])
class ExampleRobolectricTest {

  @Test
  fun `read string from context`() {
    val context = ApplicationProvider.getApplicationContext<Context>()
    val appName = context.getString(R.string.app_name)
    assertEquals("Mandarin Pasti Bisa", appName)
  }

  @Test
  fun `verify book contains 200 pages across 20 chapters`() {
    assertEquals(200, BookRepository.totalPages)
    assertEquals(20, BookRepository.chapters.size)

    val firstPage = BookRepository.getPage(1)
    assertEquals("Fondasi & Salam Pertama", firstPage.title)

    val lastPage = BookRepository.getPage(200)
    assertEquals(20, lastPage.chapterNum)
  }
}
