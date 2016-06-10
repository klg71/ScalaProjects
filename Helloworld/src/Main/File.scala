package Main

class File(nameConst:String) extends FileSystemEntry(nameConst) {
  
  def toTree(before:String) : String = {
    before+_name+"\r\n"
  }
  def toTree() : String = {
    _name+"\r\n"
  }
}