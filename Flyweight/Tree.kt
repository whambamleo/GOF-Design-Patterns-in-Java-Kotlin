package Flyweight

import java.awt.Graphics

class Tree(private val x: Int, private val y: Int, private val type: TreeType) {
    fun draw(g: Graphics) {
        type.draw(g, x, y)
    }
}














































