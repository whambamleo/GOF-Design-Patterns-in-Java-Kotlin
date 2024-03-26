package Flyweight

import java.awt.Color
import java.awt.Graphics
import javax.swing.JFrame

class Forest(): JFrame() {

    private val trees: MutableList<Tree> = mutableListOf()

    fun plantTree(x: Int, y: Int, name: String, color: Color) {
        val treeType = TreeTypeFactory.getTreeType(name, color)
//        val treeType = TreeTypeFactory.getTreeTypeNoCaching(name, color)
        val tree =  Tree(x, y, treeType)
        trees.add(tree)
    }

    override fun paint(g: Graphics) {
        for (tree in trees) {
            tree.draw(g);
        }
    }
}