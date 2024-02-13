package com.example.myproject.ui.slideshow

class ClothesData {

    data class Clothing(
        val name: String,
        val skinColors: List<String>,
        val height: Float,
        val weight: Float,
        val formalities: List<String>,
        val places: List<String>,
        val gender: String,
        val color: String,
        val faceShapes: List<String>,
        val photo: String // Path or URL of the photo
    ) {
        // Calculate BMI index from height and weight
        val bmiIndex: Float = calculateBMIIndex(height, weight)

        private fun calculateBMIIndex(height: Float, weight: Float): Float {
            // Formula to calculate BMI: weight (kg) / height (m) ^ 2
            return weight / (height * height)
        }
    }

    val clothingItems = listOf(
        Clothing(
            name = "Business Suit",
            skinColors = listOf("Light", "Medium", "Dark"),
            height = 1.8f, // Height in meters
            weight = 75.0f, // Weight in kilograms
            formalities = listOf("Formal"),
            places = listOf("Office", "Business Meeting"),
            gender = "Male",
            color = "Black",
            faceShapes = listOf("Oval", "Rectangular"),
            photo = "drawable/business_suit.jpg"
        ),
        Clothing(
            name = "Summer Dress",
            skinColors = listOf("Light", "Medium"),
            height = 1.65f,
            weight = 60.0f,
            formalities = listOf("Casual"),
            places = listOf("Beach", "Outdoor Party"),
            gender = "Female",
            color = "Yellow",
            faceShapes = listOf("Heart", "Oval"),
            photo = "drawable/summer_dress.jpg"
        ),
        Clothing(
            name = "Winter Jacket",
            skinColors = listOf("Light", "Medium", "Dark"),
            height = 1.7f,
            weight = 80.0f,
            formalities = listOf("Casual"),
            places = listOf("Outdoor", "Ski Resort"),
            gender = "Unisex",
            color = "Blue",
            faceShapes = listOf("Round", "Square"),
            photo = "drawable/winter_jacket.jpg"
        ),
        Clothing(
            name = "Office Skirt",
            skinColors = listOf("Light", "Medium", "Dark"),
            height = 1.65f,
            weight = 55.0f,
            formalities = listOf("Formal"),
            places = listOf("Office", "Business Meeting"),
            gender = "Female",
            color = "Gray",
            faceShapes = listOf("Oval", "Rectangular"),
            photo = "drawable/office_skirt.jpg"
        ),
        Clothing(
            name = "Casual Jeans",
            skinColors = listOf("Light", "Medium", "Dark"),
            height = 1.75f,
            weight = 70.0f,
            formalities = listOf("Casual"),
            places = listOf("Everyday Wear", "Hangout"),
            gender = "Male",
            color = "Blue",
            faceShapes = listOf("Oval", "Rectangular"),
            photo = "drawable/jeans.png"
        )
    )
}