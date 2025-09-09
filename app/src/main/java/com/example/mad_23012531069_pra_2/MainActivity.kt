package com.example.mad_23012011126_pra_2

import android.R
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

// Import Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference the TextView (optional, but good practice if you plan to interact with it)
        val helloTextView = findViewById<TextView?>(R.id.helloTextView)

        // Reference the button
        val showSnackbarButton = findViewById<Button?>(R.id.showSnackbarButton)

        // Set an OnClickListener for the button
        showSnackbarButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Show a Snackbar when the button is clicked
                Snackbar.make(view, "This is a Snackbar message!", Snackbar.LENGTH_LONG)
                    .setAction("Action", object : View.OnClickListener {
                        override fun onClick(v: View?) {
                            // Handle the action click (e.g., another message or action)
                            Snackbar.make(view, "Action clicked!", Snackbar.LENGTH_SHORT).show()
                        }
                    })
                    .show()
            }
        })
    }
}

}