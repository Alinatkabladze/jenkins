pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withEnv(overrides: ['PATH+EXTRA=/usr/sbin:/usr/bin:/sbin:/bin']) {
          echo 'Build Starts'
          sh 'mvn clean compile test'
          echo 'Build ends'
        }

      }
    }

  }
  environment {
    PATH = "opt/apache-maven-3.6.3/bin:$PATH"
  }
}