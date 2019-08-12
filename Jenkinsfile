pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        bat 'mvn clean install'
      }
    }
    stage('Test') {
      parallel {
        stage('Test') {
          steps {
            bat 'mvn clean test'
            echo 'Tesst cases Success'
          }
        }
        stage('Comatability') {
          steps {
            echo 'Chrome test'
            echo 'Firefox Test'
          }
        }
      }
    }
    stage('Coverage') {
      steps {
        echo 'Code cover'
      }
    }
    stage('Quality') {
      steps {
        echo 'Code Quality'
      }
    }
  }
}