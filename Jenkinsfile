pipeline {
  agent any
  stages {
    stage('Build') {
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