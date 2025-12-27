pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'git@github.com:VaibhavRawade/devops-pipeline.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                bat 'docker build -t devops-app .'
            }
        }

        stage('Docker Run') {
            steps {
                bat 'docker run -d -p 8080:8080 --name devops-app devops-app'
            }
        }
    }
}
