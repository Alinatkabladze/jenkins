pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        withEnv(overrides: ['PATH+EXTRA=/usr/sbin:/usr/bin:/sbin:/bin']) {
          echo 'Build Starts'
          sh 'clean compile test'
          echo 'Build ends'
        }

      }
    }

  }
}