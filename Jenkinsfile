pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Starts'
        sh 'clean compile test'
        echo 'Build ends'
      }
    }

  }
}