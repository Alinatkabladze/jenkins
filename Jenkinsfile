pipeline {
  agent any
  stages {
    stage('Build') {
      parallel {
        stage('Functional Test') {
          steps {
            echo 'Build Starts'
            bat 'mvn clean compile test'
            echo 'Build ends'
          }
        }

        stage('Performance Test') {
          steps {
            bat 'mvn clean compile test'
          }
        }

      }
    }

  }
  tools {
    maven 'Maven3'
  }
  triggers {
    pollSCM('* * * * *')
  }
}