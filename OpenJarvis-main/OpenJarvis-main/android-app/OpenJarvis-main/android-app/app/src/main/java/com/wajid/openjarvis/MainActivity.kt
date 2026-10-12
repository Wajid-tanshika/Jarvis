package com.wajid.openjarvis

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.ViewGroup
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(28, 36, 28, 24)
            setBackgroundColor(Color.rgb(18, 24, 38))
        }

        val title = TextView(this).apply {
            text = "OpenJarvis"
            textSize = 30f
            setTextColor(Color.WHITE)
        }

        val subtitle = TextView(this).apply {
            text = "Your Personal AI Assistant"
            textSize = 16f
            setTextColor(Color.LTGRAY)
        }

        val chat = TextView(this).apply {
            text = "नमस्ते! 👋\nमैं OpenJarvis हूँ।\n\nअभी Android ऐप का शुरुआती संस्करण है।"
            textSize = 17f
            setTextColor(Color.WHITE)
            setPadding(0, 32, 0, 24)
        }

        val input = EditText(this).apply {
            hint = "अपना मैसेज लिखें..."
            setTextColor(Color.WHITE)
            setHintTextColor(Color.LTGRAY)
        }

        val send = Button(this).apply {
            text = "Send"
        }

        send.setOnClickListener {
            val message = input.text.toString().trim()
            if (message.isNotEmpty()) {
                chat.text = "आप: $message\n\nOpenJarvis बैकएंड से कनेक्शन अगले चरण में जोड़ा जाएगा।"
                input.setText("")
            }
        }

        root.addView(title)
        root.addView(subtitle)
        root.addView(
            chat,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                0,
                1f
            )
        )
        root.addView(input)
        root.addView(send)

        setContentView(root)
    }
}
