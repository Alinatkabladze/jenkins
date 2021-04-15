pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Starts'
        sh 'mvn clean compile'
        echo 'Build ends'
      }
    }

  }
}