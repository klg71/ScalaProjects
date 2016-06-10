package Main


object Run {
  def main(args: Array[String]) = {
    val dirRoot=new Main.Directory("root")
    val dirMovie=new Main.Directory("Movies")
    val dirPhoto=new Main.Directory("Photos")
    dirRoot.addEntry(dirMovie)
    dirRoot.addEntry(dirPhoto)
    
    dirMovie.addEntry(new File("Hancock"))
    dirMovie.addEntry(new File("Harry Potter"))
    dirMovie.addEntry(new File("X-Men"))
    
    dirPhoto.addEntry(new File("Blume.jpg"))
    dirPhoto.addEntry(new File("Herz.jpg"))
    dirPhoto.addEntry(new File("Sonne.jpg")
    )
    Main.FilePrinter.start()
    Main.FilePrinter ! dirRoot
    Main.FilePrinter ! "exit"
  }
}