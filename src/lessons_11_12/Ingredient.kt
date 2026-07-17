package lessons_11_12

class Ingredient(val _name: String, val _weight: Int, val _count: Int) {
<<<<<<< HEAD

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare

    }
=======


>>>>>>> fced994d7fd55cf1f0408f7f2ee070f9af4ae02f

}