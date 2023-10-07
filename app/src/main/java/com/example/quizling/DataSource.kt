package com.mehedi.simplequiz2302

object DataSource {

    val quizQuestions = mutableListOf<QuizQuestion>(

        QuizQuestion(
            "What does 'IT' stand for?",
            listOf(
                "Information Technology",
                "Internet Tools",
                "Integrated Testing",
                "Innovative Technologies"
            ),
            0
        ),
        QuizQuestion(
            "What is the most common programming language used for web development?",
            listOf("Java", "C++", "Python", "JavaScript"),
            3
        ),
        QuizQuestion(
            "Which company developed the Android operating system?",
            listOf("Microsoft", "Apple", "Google", "Samsung"),
            2
        ),

        QuizQuestion(
            "What does 'URL' stand for?",
            listOf(
                "Uniform Resource Locator",
                "Universal Remote Link",
                "User Registration Language",
                "Ultra-Reliable Link"
            ),
            0
        ),
        QuizQuestion(
            "Which programming language is often used for data analysis and machine learning?",
            listOf("Java", "C#", "Python", "Ruby"),
            2
        ),
        QuizQuestion(
            "What does 'HTML' stand for?",
            listOf(
                "Hyperlink Text Markup Language",
                "High-Level Text Markup Language",
                "Hypertext Transfer Markup Language",
                "Hypermedia Text Management Language"
            ),
            2
        ),
        QuizQuestion(
            "What technology is used to store and manage data in a structured way in databases?",
            listOf("XML", "JSON", "SQL", "HTML"),
            2
        ),
        QuizQuestion(
            "Which networking protocol is used for sending emails?",
            listOf("HTTP", "FTP", "SMTP", "TCP"),
            2
        ),
        QuizQuestion(
            "What is the name of the open-source web server software developed by the Apache Software Foundation?",
            listOf("Nginx", "Tomcat", "IIS", "Apache HTTP Server"),
            3
        ),
        QuizQuestion(
            "What is the term for malicious software designed to gain unauthorized access or cause damage to computer systems?",
            listOf("Virus", "Worm", "Trojan Horse", "Spyware"),
            0
        ),


        )


}