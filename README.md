pipeline {  
   
    agent any  
  
    tools {  
        maven 'MAVEN'  
    }  
  
    stages {  
        stage('Checkout Git') {  
            steps {  
                git branch: 'main',  
                    url: 'https://github.com/aaronalphons14/devops-maven-lab.git'  
            }  
        }  
  
        stage('Build and Test') {  
            steps {  
                bat 'mvn clean test'  
            }  
        }  
    }  
}
