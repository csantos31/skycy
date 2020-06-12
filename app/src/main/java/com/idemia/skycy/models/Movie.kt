package com.idemia.skycy.models

class Movie {
    var name : String? = null
    var description : String? = null
    var image : String? = null
    var background : String? = null
    var duration : String? = null
    var releaseYear : String? = null

    constructor(
        name: String?,
        description: String?,
        image: String?,
        background: String?,
        duration: String?,
        releaseYear: String?
    ) {
        this.name = name
        this.description = description
        this.image = image
        this.background = background
        this.duration = duration
        this.releaseYear = releaseYear
    }
}