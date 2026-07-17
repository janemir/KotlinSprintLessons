package lessons_11_12

class Ingredient(val _name: String, val _weight: Int, val _count: Int) {

    var isNeedToPrepare = false

    constructor(
        name: String,
        weight: Int,
        count: Int,
        _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

        isNeedToPrepare = _isNeedToPrepare

    }

}