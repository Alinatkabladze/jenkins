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
          }
        }

        stage('Performance Test') {
          steps {
            echo 'This is Perf test'
          }
        }

      }
    }

  }
  tools {
    maven 'Maven3'
  }
}