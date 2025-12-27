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
                sh 'mvn clean package'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t devops-app .'
            }
        }

        stage('Docker Run') {
            steps {
                sh 'docker run -d -p 8080:8080 --name devops-app devops-app'
            }
        }
    }
}
