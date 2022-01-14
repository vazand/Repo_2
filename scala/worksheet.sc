def readFile():Map[String,Int]={
  val count_Words = scala.io.Source.fromFile("/home/jeevi/text5.txt")
    .getLines
    .flatMap(_.split(" "))
    .foldLeft(Map.empty[String,Int])
    {
      (count_in_map, words) => count_in_map+(words->(count_in_map.getOrElse(words,0)+1))
    }
  return count_Words
}
def printWord_count(count_word:Map[String,Int]):Unit={

  for ((k,v)<-count_word) println(s" ${k} =>  ${v}")
}
val word_count = readFile()
printWord_count(word_count)
