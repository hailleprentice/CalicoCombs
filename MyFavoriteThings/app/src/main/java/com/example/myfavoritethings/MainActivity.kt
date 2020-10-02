package com.example.myfavoritethings


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    internal lateinit var favoriteSeasonButton: Button
    internal lateinit var favoriteAnimalButton: Button
    internal lateinit var favoriteShowButton: Button
    internal lateinit var favoriteBookButton: Button
    internal lateinit var favoriteWebtoonButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        favoriteSeasonButton = findViewById(R.id.favoriteSeasonButton)
        favoriteAnimalButton = findViewById(R.id.favoriteAnimalButton)
        favoriteShowButton = findViewById(R.id.favoriteShowButton)
        favoriteBookButton = findViewById(R.id.favoriteBookButton)
        favoriteWebtoonButton = findViewById(R.id.favoriteWebtoonButton)


        favoriteSeasonButton.setOnClickListener { view ->
            Toast.makeText(
                this,
                getString(R.string.seasonButton, favoriteSeasonButton),
                Toast.LENGTH_LONG
            ).show()

            favoriteAnimalButton.setOnClickListener { view ->
                Toast.makeText(
                    this,
                    getString(R.string.animalButton, favoriteAnimalButton),
                    Toast.LENGTH_LONG
                ).show()

                favoriteShowButton.setOnClickListener { view ->
                    Toast.makeText(
                        this,
                        getString(R.string.showButton, favoriteShowButton),
                        Toast.LENGTH_LONG
                    ).show()

                    favoriteBookButton.setOnClickListener { view ->
                        Toast.makeText(
                            this,
                            getString(R.string.bookButton, favoriteBookButton),
                            Toast.LENGTH_LONG
                        ).show()

                        favoriteWebtoonButton.setOnClickListener { view ->
                            Toast.makeText(
                                this,
                                getString(R.string.webtoonButton, favoriteWebtoonButton),
                                Toast.LENGTH_LONG
                            ).show()

                        }
                    }
                }
            }
        }
    }
}
