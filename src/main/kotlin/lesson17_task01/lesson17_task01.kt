fun main() {
    val que1 = QuizClass(question = "Какой вопрос?", answer = "Да")
    println(que1.question)
}

class QuizClass (question: String?, answer: String?){
    var question: String? = ""
        get(){
            return if (field == null) "Вопрос не задан"
            else question
        }

    val answer = null
}