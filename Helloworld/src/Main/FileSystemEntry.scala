package Main

abstract class FileSystemEntry(var nameConst:String) {
    protected var _name:String=nameConst
    def name= _name
    
    def toTree(before:String): String
    def toTree(): String
}