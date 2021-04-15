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
  post {
    always {
      mail(to: 'jenkinsbootcamp@gmail.com', subject: "Status of pipeline: ${currentBuild.fullDisplayName}", body: "${env.BUILD_URL} has result ${currentBuild.result}")
    }

  }
}