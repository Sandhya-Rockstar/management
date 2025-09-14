pipeline {
    agent any

    tools {
        // Ensure Maven and JDK are installed and configured in Jenkins global tools
        maven 'Maven_3.9'     // This should match the Maven installation name in Jenkins
        jdk 'JDK_17'          // Change to your configured JDK
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                git branch: 'main', url: 'https://github.com/sundaram4009/jenkinstesting.git'
            }
        }

        stage('Build') {
            steps {
                echo 'Building project with Maven...'
                sh 'mvn clean install -DskipTests'
            }
        }

        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging Spring Boot app...'
                sh 'mvn package -DskipTests'
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploying application...'
                // Example: copy jar to server or run docker build
                sh 'scp target/*.jar user@server:/opt/apps/'
            }
        }
    }
}
