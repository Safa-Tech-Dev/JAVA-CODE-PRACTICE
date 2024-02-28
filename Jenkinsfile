pipeline{

    agent any
    stages{
        stage('Compile'){
            steps{
                bat 'javac MapIterator.java'
            }
        }
        stage('Run'){
            steps{
                bat 'java MapIterator'
            }
        }
    }
}