fun checkRectanglesIf(left1: Int, right1: Int, top1: Int, bottom1: Int,
                      left2: Int, right2: Int, top2: Int, bottom2: Int): String {
    if (left1 >= left2 && right1 <= right2 && top1 <= top2 && bottom1 >= bottom2) {
        return "Первый прямоугольник находится внутри второго"
    } else if (left2 >= left1 && right2 <= right1 && top2 <= top1 && bottom2 >= bottom1) {
        return "Второй прямоугольник находится внутри первого"
    } else if (right1 < left2 || right2 < left1 || bottom1 > top2 || bottom2 > top1) {
        return "Прямоугольники не пересекаются"
    } else {
        return "Прямоугольники пересекаются"
    }
}

fun checkRectanglesWhen(left1: Int, right1: Int, top1: Int, bottom1: Int,
                        left2: Int, right2: Int, top2: Int, bottom2: Int): String {
    return when {
        left1 >= left2 && right1 <= right2 && top1 <= top2 && bottom1 >= bottom2 ->
            "Первый прямоугольник находится внутри второго"
        left2 >= left1 && right2 <= right1 && top2 <= top1 && bottom2 >= bottom1 ->
            "Второй прямоугольник находится внутри первого"
        right1 < left2 || right2 < left1 || bottom1 > top2 || bottom2 > top1 ->
            "Прямоугольники не пересекаются"
        else ->
            "Прямоугольники пересекаются"
    }
}

fun checkPointIf(left: Int, right: Int, top: Int, bottom: Int, x: Int, y: Int): String {
    if (x > left && x < right && y > bottom && y < top) {
        return "Точка внутри прямоугольника"
    } else if ((x == left || x == right) && y in (bottom..top) ||
        (y == bottom || y == top) && x in (left..right)) {
        return "Точка на стороне прямоугольника"
    } else {
        return "Точка вне прямоугольника"
    }
}


fun checkPointWhen(left: Int, right: Int, top: Int, bottom: Int, x: Int, y: Int): String {
    return when {
        x > left && x < right && y > bottom && y < top ->
            "Точка внутри прямоугольника"
        (x == left || x == right) && y in (bottom..top) ||
                (y == bottom || y == top) && x in (left..right) ->
            "Точка на стороне прямоугольника"
        else ->
            "Точка вне прямоугольника"
    }
}

// Пример вызова функции
fun main() {
    println("Задача 1")
    val result1 = checkRectanglesIf(1, 5, 5, 1, 2, 6, 6, 2)
    println("конструкция if: $result1")
    val result2 = checkRectanglesWhen(1, 5, 5, 1, 2, 6, 6, 2)
    println("конструкция When: $result2\n")

    println("Задача 2")
    val result3 = checkPointIf(1, 5, 5, 1, 3, 3)
    println("конструкция if: $result3")
    val result4 = checkPointWhen(1, 5, 5, 1, 3, 3)
    println("конструкция When: $result4\n")
}