package ru.romaberendeev.simpleapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes

import kotlinx.android.synthetic.main.activity_main.*

class DebugMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_text_id.setText(resourceEntryName(R.string.custom_string) + "\n" + TestMinification::class.java.name)
//        resources.getQuantityString()
        if (BuildConfig.DEBUG) {

        }
    }

    private fun resourceName(@StringRes resId: Int): String {
        val name = resources.getResourceName(resId)
        val entryName = resources.getResourceEntryName(resId)
        return "$name $entryName"
    }

    private fun resourceEntryName(@StringRes resId: Int): String {
        return resources.getResourceEntryName(resId)
    }

    private inner class TestMinification(
        val test: String
    )
}
