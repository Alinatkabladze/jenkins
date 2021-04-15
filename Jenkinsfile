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
      echo 'I will always say Hello again!'
      emailext(body: "${currentBuild.currentResult}: Job ${env.JOB_NAME} build ${env.BUILD_NUMBER} More info at: ${env.BUILD_URL}", recipientProviders: [[$class: 'DevelopersRecipientProvider'], [$class: 'RequesterRecipientProvider']], subject: "Jenkins Build ${currentBuild.currentResult}: Job ${env.JOB_NAME}")
    }

  }
}