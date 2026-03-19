pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                bat 'mvnw clean compile'
            }
        }

        stage('Test') {
            steps {
                bat 'mvnw test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvnw package'
            }
        }

        stage('Run') {
            steps {
                bat 'java -jar target\\jenkinsDemo-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}