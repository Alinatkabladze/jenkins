pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Starts'
        sh 'mvn clean compile test'
        echo 'Build ends'
      }
    }

  }
  tools {
    maven 'Maven3'
  }
}