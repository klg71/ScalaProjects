package Main

import java.util.Collection
import scala.collection.mutable.ListBuffer

class Directory(name:String) extends FileSystemEntry(name) {
    private var _entries: ListBuffer[FileSystemEntry]= new ListBuffer()
    
    def entries=_entries.toList(_entries.size)
    
    def toTree(before:String): String = {
        return _name+"\r\n"+_entries.foldLeft(""){(total,s) =>total+before+s.toTree(before+" ")}
    }
    
    def toTree(): String = {
        return _name+"\r\n"+_entries.foldLeft(""){(total,s) =>total+s.toTree(" ")}
    }
    
    
    def addEntry(s: FileSystemEntry) = {
      _entries+=s
    }
    
}