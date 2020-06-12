package com.idemia.skycy.models

class Movie {
    var name : String? = null
    var description : String? = null
    var image : String? = null

    constructor(name: String?, description: String?, image: String?) {
        this.name = name
        this.description = description
        this.image = image
    }
}