package com.samvel.samwindows

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        window.statusBarColor = Color.rgb(20, 35, 60)
        window.navigationBarColor = Color.rgb(20, 35, 60)

        val desktop = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.rgb(35, 65, 105))
        }

        val title = TextView(this).apply {
            text = "SamWindows 11"
            textSize = 28f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        desktop.addView(title)

        val subtitle = TextView(this).apply {
            text = "Mobile Edition • Alpha 0.1"
            textSize = 16f
            setTextColor(Color.WHITE)
            gravity = Gravity.CENTER
        }

        desktop.addView(subtitle)

        val space = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(20, 50, 20, 20)
        }

        listOf("📁 File Explorer", "⚙️ Settings", "🖥️ This PC").forEach {
            val button = Button(this).apply {
                text = it
                setOnClickListener {
                    Toast.makeText(
                        this@MainActivity,
                        "$it скоро появится!",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
            space.addView(button)
        }

        desktop.addView(space)

        val taskbar = TextView(this).apply {
            text = "⊞       Search                 Wi-Fi  🔋"
            textSize = 18f
            gravity = Gravity.CENTER
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.rgb(20, 30, 45))
            setPadding(10, 20, 10, 20)
        }

        desktop.addView(
            taskbar,
            LinearLayout.LayoutParams(
                -1,
                -2
            )
        )

        setContentView(desktop)
    }
}
