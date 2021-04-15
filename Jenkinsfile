pipeline {
  agent any
  stages {
    stage('Build') {
      post {
        success {
          junit 'target/surefire-reports/**/*.xml'
        }

      }
      steps {
        echo 'Build Starts'
        bat 'mvn clean compile test'
        echo 'Build ends'
      }
    }

  }
  tools {
    maven 'Maven3'
  }
}