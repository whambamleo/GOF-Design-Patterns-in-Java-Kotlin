package Flyweight

import java.awt.Color

class TreeTypeFactory {
    companion object {
        private val treeTypes: HashMap<String, TreeType> = hashMapOf()

        fun getTreeType(name: String, color: Color): TreeType {
            return treeTypes.getOrPut(name) { TreeType(name, color) }
        }

        fun getTreeTypeNoCaching(name: String, color: Color): TreeType {
            return TreeType(name, color)
        }
    }
}