fun main() {
    val que1 = QuizClass(question = "Какой вопрос?", answer = "Да")
    println(que1.question)
    println(que1.answer)
}

class QuizClass (question: String?, answer: String?){
    var question: String? = question
        get(){
            return if (field == null) "Вопрос не задан"
            else field
        }
        set(value){
            field = value
        }

    var answer: String? = answer
        set(value){
            field = value
        }
}