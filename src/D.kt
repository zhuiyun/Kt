import jdk.jfr.Frequency

val str="Kotlin is my favorite language. I love Kotlin!"
fun main() {
    println(TextProcessorV1().processText(str))
}
class TextProcessorV1 {

    fun processText(text: String): List<WordFreq> {

//        val list=sortByFrequency(getWordCount(clean(text).split(" ")))


        return text.clean().split(" ").getWordCount().mapToList {  WordFreq(it.key, it.value)  }.sortedByDescending { it.frequency }
    }

    private inline fun <T> Map<String, Int>.mapToList(transform: (Map.Entry<String, Int>) -> T): MutableList<T> {
        val list = mutableListOf<T>()
        for (entry in this) {
            val freq = transform(entry)
            list.add(freq)
        }
        return list
    }

    private fun List<String>.getWordCount(): Map<String, Int> {
        val map= hashMapOf<String,Int>()
        for(word in this){
            if(word =="") continue
            val trim =word.trim()
            val count =map.getOrDefault(trim,0)
            map[trim]=count+1
        }
        return map
    }

    private fun String.clean(): String {
        return this.replace("[^A-Za-z]".toRegex()," ").trim()
    }
}

data class WordFreq(val word: String, val frequency: Int)