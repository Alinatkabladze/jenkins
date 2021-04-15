pipeline {
  agent any
  stages {
    stage('build') {
      steps {
        echo 'Pipeline has started!'
        bat 'mvn --version'
        echo 'Pipeline has ended!'
      }
    }

  }
}