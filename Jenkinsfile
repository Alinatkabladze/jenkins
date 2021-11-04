pipeline {
  agent any
  stages {
    stage('Functional Test') {
      parallel {
        stage('Functional Test') {
          steps {
            echo 'Pipeline has started!'
            bat 'mvn clean compile test'
            echo 'Pipeline has ended!'
            echo 'BootCamp2021'
            echo 'BootCamp2021_2'
          }
        }

        stage('Performance Test') {
          steps {
            echo 'This is Perf test'
          }
        }

        stage('Security Test') {
          steps {
            echo 'Security step'
          }
        }

      }
    }

  }
  tools {
    maven 'Maven3'
  }
}