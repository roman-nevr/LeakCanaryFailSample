package ru.romaberendeev.simpleapplication

import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        my_text_id.text = resourceEntryName(R.string.custom_string) + "\n" + TestMinification::class.java.name
        App.activities.add(this)
        App.leakCanaryWrapper.watch(this)
        my_text_id_2.text = App.leakCanaryWrapper.name()
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
