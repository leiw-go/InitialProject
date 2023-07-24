pipeline {
    agent any
    
    stages {
        stage('Build') { 
            steps {
                echo 'Buiding...'
                sh 'mvn -B -DskipTests clean package'
            }
        }

        stage('Test') { 
            steps {
                echo 'Test...'
            }
        }

        stage('Deploy') { 
            steps {
                echo 'Deploy...'
            }
        }
    }
}
