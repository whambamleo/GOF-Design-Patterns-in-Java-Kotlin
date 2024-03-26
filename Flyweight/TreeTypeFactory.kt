package Flyweight

import java.awt.Color

class TreeTypeFactory {
    companion object {
        private val treeTypes: HashMap<String, TreeType> = hashMapOf()

        fun getTreeType(name: String, color: Color): TreeType {
            var result = treeTypes[name]
            if (result == null) {
                result = TreeType(name, color)
                treeTypes[name] = result
            }
            return result;
        }

        fun getTreeTypeNoCaching(name: String, color: Color): TreeType {
            return TreeType(name, color)
        }
    }
}