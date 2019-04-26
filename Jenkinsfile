
pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh 'gradle clean build'
            }
        }
        stage('test') {
            steps {
                sh 'gradle test'
            }
        }

    }
}