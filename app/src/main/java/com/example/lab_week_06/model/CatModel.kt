package com.example.lab_week_06

data class CatModel(
    val gender: Gender,
    val breed: CatBreed,
    val name: String,
    val biography: String,
    val imageUrl: String
)

enum class Gender {
    Male, Female, Unknown
}

enum class CatBreed {
    AmericanCurl,
    BalineseJavanese,
    ExoticShorthair,
    Unknown
}
