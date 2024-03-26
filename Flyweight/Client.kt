package Flyweight

import java.awt.Color

fun random(min: Int, max: Int): Int {
    return (min + Math.random()*(max-min)+1).toInt()
}

fun main() {
    val canvasSize = 1000
    val numTreesToDraw = 100000
    val numTreeTypes = 4

    val forest = Forest();
    for (i in 0..numTreesToDraw/numTreeTypes) {
        forest.plantTree(random(0, canvasSize), random(0, canvasSize), "Summer Oak", Color.GREEN)
        forest.plantTree(random(0, canvasSize), random(0, canvasSize), "Autumn Oak", Color.ORANGE)
        forest.plantTree(random(0, canvasSize), random(0, canvasSize), "Spring Oak", Color.YELLOW)
        forest.plantTree(random(0, canvasSize), random(0, canvasSize), "Winter Oak", Color.BLUE)
    }
    forest.setSize(canvasSize, canvasSize);
    forest.isVisible = true;

    println((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()).toString() + " bytes")
}