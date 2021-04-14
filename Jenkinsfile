pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Build Starts'
        sh 'mvn clean install'
        echo 'Build ends'
      }
    }

  }
}