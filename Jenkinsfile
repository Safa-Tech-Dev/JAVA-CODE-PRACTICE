pipeline{

    agent any
    stages{
        stage('Compile'){
            steps{
                sh 'javac MapIterator.java'
            }
        }
        stage('Run'){
            steps{
                sh 'java MapIterator'
            }
        }
    }
}