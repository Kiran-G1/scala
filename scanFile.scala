import java.io.File
object scanFile{

def Reader(file:File):Unit={

var lines=scala.io.Source.fromFile(file).getLines.toList	
println(lines)
}
def main(args:Array[String])
	{
		var filesHere=(new File(".")).listFiles
		var fileList=filesHere.toList
		//println(fileList)
		var file=(fileList(0))
		Reader(file)	
	}

}

