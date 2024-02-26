pipeline{

    agent any
    stages{
        stage('Compile'){
            steps{
                'javac MapIterator.java'
            }
        }
        stage('Run'){
            steps{
                'java MapIterator'
            }
        }
    }
}