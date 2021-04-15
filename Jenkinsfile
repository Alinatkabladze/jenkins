pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Pipeline has started!'
        bat 'mvn clean compile test'
        echo 'Pipeline has ended!'
      }
    }

  }
}